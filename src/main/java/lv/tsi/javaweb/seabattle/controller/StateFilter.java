package lv.tsi.javaweb.seabattle.controller;

import lv.tsi.javaweb.seabattle.model.PlayerGameContext;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "StateFilter", urlPatterns = "/*")
public class StateFilter implements Filter {
    @Inject
    private PlayerGameContext playerGameContext;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) resp; // to make equal Servlet and HTTPServlet ServletResponse is a parent for HTTPServletResponse (convert to HTTP by force)

        HttpServletRequest request = (HttpServletRequest) req;
        String path = request.getServletPath();
        if (playerGameContext.getGame() == null && !(path.equals("/register")
           || path.endsWith((".png")) // zapros na .png
           || path.endsWith((".jsp"))
           || path.endsWith((".css"))

        ) ) {

            response.sendRedirect(request.getContextPath() + "/register");
        }
        else if (playerGameContext.getGame() != null
                && playerGameContext.getGame().isCancelled()) {
            request.getSession().invalidate(); // cancel session
            response.sendRedirect(request.getContextPath() + "/index.jsp"); // better sent to the page with "sorry, game is calcelled"
        } else {
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
