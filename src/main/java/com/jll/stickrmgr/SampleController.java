package com.jll.stickrmgr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@Controller
public class SampleController {
 
    @RequestMapping("/")
    public String index(Model model) {
    	model.addAttribute("message", "Hello World!");
        return "helloworld";
    }
 
}