package com.demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @RequestMapping("/test")
    @ResponseBody
    public String handle(){
        return "TESTING";
    }
    
}
