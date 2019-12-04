package com.eventosapp.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.Entidade.Convidado;
import com.eventosapp.Entidade.Evento;

public interface ConvidadoRepositorio extends CrudRepository <Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByCodigo(Long codigo);
}
