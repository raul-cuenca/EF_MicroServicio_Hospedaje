package pe.cuenca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.cuenca.model.Hospedaje;
import pe.cuenca.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {

	@Autowired
	private HospedajeRepository repository;

	@Override
	public void save(Hospedaje c) {
		repository.save(c);

	}

	@Override
	public List<Hospedaje> get() {
		return repository.findAll();
	}

}
