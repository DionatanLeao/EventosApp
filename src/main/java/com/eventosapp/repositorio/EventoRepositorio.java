package com.eventosapp.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.Entidade.Evento;

public interface EventoRepositorio extends CrudRepository <Evento, String> {
	Evento findByCodigo(Long codigo);
}
