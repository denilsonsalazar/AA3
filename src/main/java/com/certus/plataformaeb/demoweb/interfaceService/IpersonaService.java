package com.certus.plataformaeb.demoweb.interfaceService;

import java.util.List;
import java.util.Optional;

import com.certus.plataformaeb.demoweb.modelo.Persona;

public interface IpersonaService {
	public List<Persona> listar();

	public Optional<Persona> ListarId(int id);

	public int save(Persona p);

	public void delete(int id);
}
