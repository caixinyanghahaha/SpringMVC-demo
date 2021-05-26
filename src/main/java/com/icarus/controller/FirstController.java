package com.icarus.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        // 创建 ModelAndView 对象
        ModelAndView mav = new ModelAndView();
        // 添加一个 Model 数据
        mav.addObject("msg", "SpringMVC 入门");
        // 设置视图页面
        /* 设置视图解析器前后缀之前 */
        // mav.setViewName("/WEB-INF/jsp/first.jsp");
        /* 设置视图解析器前后缀之后 */
        mav.setViewName("first");
        // 返回 ModelAndView 对象
        return mav;

    }
}
