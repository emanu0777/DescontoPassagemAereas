package com.algaworks.service;

import com.algaworks.model.Voo;

public class PrecoPassageiroGold implements CalculadoraPrecoPassagem{

	@Override
	public double calcular(Voo voo) {
		if(voo.getPreco()>500)
			return getPrecoAcimaFaixa(voo);
		return getPrecoAbaixoFaixa(voo);
	}

	private double getPrecoAbaixoFaixa(Voo voo) {
		return voo.getPreco() * 0.90;
	}

	private double getPrecoAcimaFaixa(Voo voo) {
		return voo.getPreco() * 0.85;
	}

}
