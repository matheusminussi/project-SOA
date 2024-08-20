package com.project.colecao.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.project.colecao.modelos.Desenvolvedor;
import com.project.colecao.modelos.Jogo;
import com.project.colecao.modelos.WebJogo;

public class JogoDAO {

private static List<Jogo> jogos;

    static {
        jogos = new ArrayList<>();

        jogos.add(new Jogo(
            "Counter-Strike",
            "Valve Corporation",
            new ArrayList<Desenvolvedor>() {{
                add(new Desenvolvedor("Jess Cliffe", new Date())); 
                add(new Desenvolvedor("Richard Gray", new Date())); 
            }},
            new Date(), // 9 de novembro de 1999
            "Counter-Strike é um jogo de tiro em primeira pessoa (FPS) desenvolvido pela Valve."
    ));

        
            jogos.add(new Jogo(
                "League of Legends",
                "Riot Games",
                new ArrayList<Desenvolvedor>() {{
                    add(new Desenvolvedor("Brandon Beck", new Date()));
                    add(new Desenvolvedor("Marc Merrill", new Date()));
                }},
                new Date(),
                "League of Legends é um jogo multiplayer online battle arena (MOBA) desenvolvido pela Riot Games."
        ));

        WebJogo soaJogo = new WebJogo("Runescape","Jagex",new ArrayList<Desenvolvedor>() {{
            add(new Desenvolvedor("Andrew Gower", new Date()));
            add(new Desenvolvedor("Paul Gower", new Date()));
        }},new Date(),"RuneScape é um RPG online multijogador massivo (MMORPG) de fantasia desenvolvido e publicado pela Jagex.");


        jogos.add(soaJogo);
    }

    public List<Jogo> listarJogos() {
        return jogos;
    }

    public void criarJogo(Jogo jogo) {
        jogos.add(jogo);
    }
}