package com.certus.plataformaeb.demoweb.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.certus.plataformaeb.demoweb.modelo.Persona;
@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
