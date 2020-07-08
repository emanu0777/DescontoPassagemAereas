package com.algaworks.service;

import com.algaworks.model.Voo;

public class PrecoPassageiroSilver implements CalculadoraPrecoPassagem{

	@Override
	public double calcular(Voo voo) {
		if(voo.getPreco() > 700)
			return voo.getPreco() * 0.06;
		return voo.getPreco() * 0.94;
	}

}
