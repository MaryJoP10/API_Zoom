//Operaciones (guardar, filtrar...) para manipular base de datos//
package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Evento;

public interface EventoRepo extends JpaRepository<Evento, Long>{

}
