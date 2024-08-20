package com.project.colecao.servicos;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.project.colecao.dao.JogoDAO;
import com.project.colecao.modelos.Jogo;

@WebService
public class ListagemJogos {

      public List<Jogo> listarJogos() {
        JogoDAO JogoDAO = obterDAO();
        return JogoDAO.listarJogos();
    }

    private JogoDAO obterDAO() {
        return new JogoDAO();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/jogos", new ListagemJogos());
        System.out.println("Serviço inicializado!");

    }

}
