package com.pixelpear.perfulandia.servicio;

import com.pixelpear.perfulandia.modelo.usuario;
import com.pixelpear.perfulandia.repositorio.usuario_repositorio;

import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class usuario_servicio {

        private final usuario_repositorio usuarioRepositorio;

        public usuario_servicio(usuario_repositorio usuarioRepositorio){
            this.usuarioRepositorio = usuarioRepositorio;
        }

        public List<usuario> listaUsuarios(){
            return usuarioRepositorio.findAll();
        }

        


}
