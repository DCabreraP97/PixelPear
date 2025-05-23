package com.pixelpear.perfulandia.controlador;

import com.pixelpear.perfulandia.modelo.usuario;
import com.pixelpear.perfulandia.servicio.usuario_servicio;
import com.pixelpear.perfulandia.dto.usuario_DTO;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class usuario_controlador {

    private final usuario_servicio usuarioService; //probando cambio

    public usuario_controlador(usuario_servicio usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<usuario> listar(){
        return usuarioService.listaUsuarios();
    }

    @PostMapping
    public usuario crear(@Valid @RequestBody usuario_DTO usuarioDTO){
        return usuarioService.guardarUsuarioDTO(usuarioDTO);
    }

    @PutMapping("/{id}")
    public usuario actualizar(@PathVariable Long id,@Valid @RequestBody usuario_DTO usuarioDTO){
        return usuarioService.actualizarUsuario(id, usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);
    }
}
