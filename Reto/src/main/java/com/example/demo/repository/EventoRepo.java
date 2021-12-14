//Operaciones (guardar, filtrar...) para manipular base de datos//
package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Evento;

public interface EventoRepo extends JpaRepository<Evento, Long>{
	@Query(value = "INSERT (nombre, fecha, id) VALUES(?, ?, ?)", nativeQuery = true)
	void saveDate(String nombre, String fecha, String id);
}
