package com.unique.jointrent.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MeasurementInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request,  
        HttpServletResponse response,Object handler)throws Exception{  
        long startTime = System.currentTimeMillis();  
        request.setAttribute("startTime",startTime);  
        return true;
    }    
        
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
        ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        //modelAndView.addObject("handlingTime", endTime - startTime);
        
        System.out.println("______________enter interceptor . use time:" + (endTime - startTime));
    }

}
