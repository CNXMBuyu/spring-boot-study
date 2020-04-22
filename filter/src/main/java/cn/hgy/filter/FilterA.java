package cn.hgy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@WebFilter(filterName = "filterA", urlPatterns = "/*") // /*表示拦截所有
public class FilterA implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String requestURI = req.getRequestURI();
        System.out.println("--------------------->过滤器：请求地址"+requestURI);
        chain.doFilter(request, response);
    }
}
