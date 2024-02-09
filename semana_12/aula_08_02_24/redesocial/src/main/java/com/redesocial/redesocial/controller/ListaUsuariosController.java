package com.redesocial.redesocial.controller;

import com.redesocial.redesocial.controller.dto.UsuarioDTO;
import com.redesocial.redesocial.modelo.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ListaUsuariosController {

    @RequestMapping("/listausuarios")
    public ArrayList<UsuarioDTO> retornaUsuarios(){

        ArrayList<UsuarioDTO> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario(1234567890L, "pedro", "pedro@hotmail.com", "pedropedrao");
        Usuario u2 = new Usuario(1234467890L, "joao", "joao@hotmail.com", "joaojoaozao");
        Usuario u3 = new Usuario(1243567890L, "josias", "josias@hotmail.com", "josiasjosiaszao");

        UsuarioDTO uDTO1 = new UsuarioDTO(u1);
        UsuarioDTO uDTO2 = new UsuarioDTO(u2);
        UsuarioDTO uDTO3 = new UsuarioDTO(u3);

        usuarios.add(uDTO1);
        usuarios.add(uDTO2);
        usuarios.add(uDTO3);


        return usuarios;
    }

}
