package pe.cuenca.service;

import java.util.List;

import pe.cuenca.model.Hospedaje;

public interface HospedajeService {
	void save(Hospedaje c);	

	List<Hospedaje> get();
}
