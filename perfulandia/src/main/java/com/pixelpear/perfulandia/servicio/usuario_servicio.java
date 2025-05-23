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

        public usuario guardarUsuario(usuario usuario_save){
            return usuarioRepositorio.save(usuario_save);
        }

        public usuario actualizarUsuario(Long id, usuario nuevoUsuario){
            return usuarioRepositorio.findById(id).map(usuario ->{
                usuario.setNombre(nuevoUsuario.getNombre());
                usuario.setCorreo(nuevoUsuario.getCorreo());
                usuario.setRol(nuevoUsuario.getRol());
                usuario.setActivo(nuevoUsuario.getActivo());
                return usuarioRepositorio.save(usuario);

            }).orElse(null);
        }

        public void eliminarUsuario(Long id){
            usuarioRepositorio.deleteById(id);
        }

}
