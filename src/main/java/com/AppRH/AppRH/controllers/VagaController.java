package com.AppRH.AppRH.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.AppRH.AppRH.repository.CandidatoRepository;
import com.AppRH.AppRH.repository.VagaRepository;

public class VagaController {

	private VagaRepository vr;
	private CandidatoRepository cr;
	
	
	//cadastrando vaga para a view
	@RequestMapping(value="/cadastrarVaga", method= RequestMethod.GET)
	public String form() {
		return "vaga/formVaga";
	}
	
}
