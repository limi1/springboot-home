package cn.boot.home.sessionfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebFilter(filterName="SessionFilter",urlPatterns="/*")  
public class SessionFilter implements Filter {

	private static final Logger log = LoggerFactory.getLogger(SessionFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res= (HttpServletResponse) response;
        String requestURI = req.getRequestURI();
        log.info("requestURI："+requestURI);
        String contextPath = req.getRequestURI().substring(req.getContextPath().length());
        log.info("contextPath："+contextPath);
        filterChain.doFilter(req, res); // 发到controller
	}

	@Override
	public void destroy() {

	}

}
