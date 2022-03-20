package multiplication.book.application;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
//import java.util.logging.Filter;
import java.util.logging.LogRecord;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import javax.servlet.*;  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class LogRequestFilter implements Filter {
	
	 private static final Logger logger = LoggerFactory.getLogger(LogRequestFilter.class);


	@Override
	  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
	      FilterChain filterChain) throws IOException, ServletException {

	    HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
	    if(Arrays.asList("POST", "PUT").contains(httpRequest.getMethod())) {
	      CustomHttpRequestWrapper requestWrapper = new CustomHttpRequestWrapper(httpRequest);
	      filterChain.doFilter(requestWrapper, servletResponse);
	      return;
	    }
	    filterChain.doFilter(servletRequest, servletResponse);
	  }

	
}
