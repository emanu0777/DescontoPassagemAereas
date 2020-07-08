package com.algaworks.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.model.Passageiro;
import com.algaworks.model.TipoPassageiro;
import com.algaworks.model.Voo;

public class PassageiroServiceTeste {

	private PrecoPassagemService precoPassagemService;
	
	@Before
	public void setup() {
		precoPassagemService = new PrecoPassagemService();
	}
	
	@Test
	public void devePermitirChamarCalculoDaPassagemPassageiro() throws Exception {
		Passageiro p = new  Passageiro("Joao da Luz", TipoPassageiro.GOLD);
		Voo voo = new Voo("Sao Paulo", "Sao Luis", 100.0);
		double total = precoPassagemService.calcular(p, voo);
		assertEquals(90.0, total, 0.0001);
		
	}
	
	@Test
	public void deveCalcularValorPassagemParaTipoGoldComValorAbaixoDoLimite() throws Exception {
		Passageiro p = new  Passageiro("Joao da Luz", TipoPassageiro.GOLD);
		Voo voo = new Voo("Sao Paulo", "Sao Luis", 100.0);
		double total = precoPassagemService.calcular(p, voo);
		assertEquals(90.0, total, 0.0001);
	}
	
	@Test
	public void deveCalcularValorPassagemParaTipoGoldComValorAcimaDoLimite() throws Exception {
		Passageiro p = new  Passageiro("Joao da Luz", TipoPassageiro.GOLD);
		Voo voo = new Voo("Sao Paulo", "Sao Luis", 600.0);
		double total = precoPassagemService.calcular(p, voo);
		assertEquals(510.0, total, 0.0001);
	}
	
	@Test  
	public void deveCalcularValorPassagemParaTipoSilverComValorAbaixoLimite() throws Exception{
		Passageiro p = new  Passageiro("Joao da Luz", TipoPassageiro.SILVER);
		Voo voo = new Voo("Sao Paulo", "Sao Luis", 100.0);
		double total = precoPassagemService.calcular(p, voo);
		assertEquals(94.0, total, 0.0001);
	}
	
	@Test
	public void deveCalcularValorPassagemParaTipoSilverComValorAcimaDoLimite() throws Exception {
		Passageiro p = new  Passageiro("Joao da Luz", TipoPassageiro.SILVER);
		Voo voo = new Voo("Sao Paulo", "Sao Luis", 600.0);
		double total = precoPassagemService.calcular(p, voo);
		assertEquals(564.0, total, 0.0001);
	}
	
}

