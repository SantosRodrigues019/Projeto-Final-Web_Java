package br.com.etechoracio.feriadoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.feriadoapi.dao.FeriadoDAO;
import br.com.etechoracio.feriados.Cadastrar_Feriado;

@RestController
@RequestMapping("/Cadastrar_Feriado")
public class Cadastrar_FeriadoController {

	@Autowired
	private FeriadoDAO dao;
	
public List<Cadastrar_Feriado> findAll() {
		
		return dao.findAll();
	}
public List<Cadastrar_Feriado> findByld() {
	
	return dao.findById();
}
}

