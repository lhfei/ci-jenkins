package cn.lhfei.ci.ui.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionTimeoutInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger log = LoggerFactory.getLogger(SessionTimeoutInterceptor.class);


	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>Session expired prehandler.");
		
		HttpSession session = request.getSession();
		/*UserSession userSession = (UserSession)session.getAttribute(AbstractController.USER_SESSION);
		
		log.info("Request URL: {}", request.getRequestURL());
		
		if(userSession == null){
			response.sendRedirect("../system/login.do");
			
			log.info("Session expired. Then will redirect to home page.");
			
			return false;
		}*/
		
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		HttpSession session = request.getSession();
		/*UserSession userSession = (UserSession)session.getAttribute(AbstractController.USER_SESSION);
		
		if(userSession == null){
			response.sendRedirect("system/index");
			
			log.info("Session expired. Then will redirect to home page.");
		}*/
		
		log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>Session expired posthandler.");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>Session expired afterCompletion.");
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>Session expired afterConcurrentHandlingStarted.");
	}
}
