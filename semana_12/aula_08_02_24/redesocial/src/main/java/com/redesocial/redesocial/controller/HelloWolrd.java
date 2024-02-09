package com.redesocial.redesocial.controller;

import com.redesocial.redesocial.modelo.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWolrd {

    @RequestMapping("/")
    public String retornMensagem(){
        return "AAAAAAAAAAAAAAAAAAAAAAA";
    }

    @RequestMapping("/listausuarios")
    public ArrayList<Usuario> retornaUsuarios(){

        ArrayList<Usuario> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario(1234567890L, "pedro", "pedro@hotmail.com", "pedropedrao");
        Usuario u2 = new Usuario(1234467890L, "joao", "joao@hotmail.com", "joaojoaozao");
        Usuario u3 = new Usuario(1243567890L, "josias", "josias@hotmail.com", "josiasjosiaszao");

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);


        return usuarios;
    }

}
