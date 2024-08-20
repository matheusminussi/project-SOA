package com.project.colecao.modelos;

import java.util.List;
import java.util.Date;

public class WebJogo extends Jogo {
    
    private TipoPlataforma plataforma = TipoPlataforma.WEB;

	public WebJogo() {
		super();
	}

	public WebJogo(String nome, String empresa, List<Desenvolvedor>  desenvolvedores,
        Date dataLancamento, String resumo) {
		super(nome, empresa, desenvolvedores, dataLancamento, resumo);
	}

	public TipoPlataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(TipoPlataforma plataforma) {
		this.plataforma = plataforma;
	}

}
