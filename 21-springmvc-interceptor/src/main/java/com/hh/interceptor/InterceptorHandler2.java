package com.hh.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class InterceptorHandler2 implements HandlerInterceptor {
       //方法前的拦截器  返回true放行  request response handler-方法三个参数
       //用于-编码格式设置-解决乱码 登录验证 权限处理
       @Override
       public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
              System.out.println("handle方法前的拦截器");
              return true;
       }
       //方法后的拦截器-用于敏感词的替换
       @Override
       public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
              System.out.println("方法后的拦截-替换敏感词");
       }
       //方法执行结束后-不常用

       @Override
       public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
              System.out.println("方法执行完成后拦截");
       }
}
