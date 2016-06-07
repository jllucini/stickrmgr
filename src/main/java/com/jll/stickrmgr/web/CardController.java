package com.jll.stickrmgr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/card"})
public class CardController {

    @RequestMapping(value={"/test_rest"}, method={RequestMethod.GET})
    public String getCreateForm(Model model) {
        return "/card/test_rest";
    }
}
