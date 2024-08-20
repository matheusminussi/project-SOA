package com.project.colecao.servicos;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import javax.xml.ws.Endpoint;
import com.project.colecao.dao.JogoDAO;
import com.project.colecao.modelos.Jogo;
import com.project.colecao.modelos.Usuario;

@WebService
public class JogosService {
    
    @WebResult(name = "jogo")
	public List<Jogo> listarJogos() {
		JogoDAO JogoDAO = obterDAO();
		return JogoDAO.listarJogos();
	}


    public void criarJogo(@WebParam(name = "jogo") Jogo jogo,
			@WebParam(name = "usuario", header = true) Usuario usuario)
			throws UsuarioNaoAutorizadoException, SOAPException {
		if (usuario.getLogin().equals("soa")
				&& usuario.getSenha().equals("soa")) {
			obterDAO().criarJogo(jogo);
		} else {
			throw new UsuarioNaoAutorizadoException("Usuário não autorizado");
		}
	}

    private JogoDAO obterDAO() {
		return new JogoDAO();
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/jogos", new JogosService());
		System.out.println("Serviço inicializado!");

	}
}
