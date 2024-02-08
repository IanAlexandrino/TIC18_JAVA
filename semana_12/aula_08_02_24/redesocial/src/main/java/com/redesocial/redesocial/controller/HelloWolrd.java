package com.redesocial.redesocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWolrd {

    @RequestMapping("/")
    @ResponseBody
    public String retornMensagem(){
        return "AAAAAAAAAAAAAAAAAAAAAAA";
    }

    public String retorna(){


        return
    }

}
