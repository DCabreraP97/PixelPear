package com.pixelpear.perfulandia.controlador;

import com.pixelpear.perfulandia.modelo.usuario;
import com.pixelpear.perfulandia.servicio.usuario_servicio;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class usuario_controlador {

    private final usuario_servicio usuarioService;

    public usuario_controlador(usuario_servicio usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<usuario> listar(){
        return usuarioService.listaUsuarios();
    }

    @PostMapping
    public usuario crear(@RequestBody usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public usuario actualizar(@PathVariable Long id, @RequestBody usuario usuario){
        return usuarioService.actualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);
    }
}
