package com.github.likechen.web.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by like on 2016/10/15.
 */
@RestController
@RequestMapping(value = "", produces = "text/html;charset=UTF-8")
public class HomeController {

    @RequestMapping(value = "/*",  method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
