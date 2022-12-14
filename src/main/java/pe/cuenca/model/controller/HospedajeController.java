package pe.cuenca.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.cuenca.model.Hospedaje;
import pe.cuenca.service.HospedajeService;

@RestController
@RequestMapping("/raulcuenca/api/hospedaje")
public class HospedajeController {
	
	@Autowired
	private HospedajeService service;
	
	@RequestMapping(path="/listar",method=RequestMethod.GET)
	public ResponseEntity<List<Hospedaje>> get(){		
		return new ResponseEntity<List<Hospedaje>>(service.get(),HttpStatus.OK);		
	}
	
	
	@RequestMapping(path="/guardar",method=RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Hospedaje hospedaje){
		
		service.save(hospedaje);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}



}
