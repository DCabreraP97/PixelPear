package com.pixelpear.perfulandia.repositorio;

import com.pixelpear.perfulandia.modelo.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface usuario_repositorio extends JpaRepository<usuario, Long>{


}   

