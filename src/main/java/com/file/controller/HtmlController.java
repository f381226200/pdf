package com.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: html controller
 * @author: FM
 * @create: 2019-01-14 12:28:29
 */
@Controller
@RequestMapping
public class HtmlController {

    /**
     * jump to index page
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
