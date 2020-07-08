package com.algaworks.model;

import com.algaworks.service.CalculadoraPrecoPassagem;
import com.algaworks.service.PrecoPassageiroGold;

import com.algaworks.service.PrecoPassageiroSilver;

public enum TipoPassageiro {
	
	GOLD(new PrecoPassageiroGold()),
	SILVER(new PrecoPassageiroSilver());

	CalculadoraPrecoPassagem calculadoraPrecoPassagem;

	private TipoPassageiro(CalculadoraPrecoPassagem calculadoraPrecoPassagem) {
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
	}

	public CalculadoraPrecoPassagem getCalculadoraPrecoPassagem() {
		return calculadoraPrecoPassagem;
	}

	
}
