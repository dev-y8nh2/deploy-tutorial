package org.codebase.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping({"/","/index"})
    public String index() {

        return "index";
    }
}
