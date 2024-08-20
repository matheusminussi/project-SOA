package com.project.colecao.servicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.project.colecao.modelos.Desenvolvedor;

@WebService
public class DesenvolvedoresService {
    
    public List<Desenvolvedor> listarDesenvolvedores() {
        Desenvolvedor brandoBeck = new Desenvolvedor("Brandon Beck", new Date());
        Desenvolvedor marcMerrill = new Desenvolvedor("Marc Merrill", new Date());
        Desenvolvedor jessCliffe = new Desenvolvedor("Jess Cliffe", new Date());
        Desenvolvedor richardGray = new Desenvolvedor("Richard Gray", new Date());
        Desenvolvedor andrewGower = new Desenvolvedor("Andrew Gower", new Date());
        Desenvolvedor paulGower = new Desenvolvedor("Paul Gower", new Date());
        return new ArrayList<>(Arrays.asList(brandoBeck, marcMerrill, jessCliffe, richardGray,
        andrewGower, paulGower));
     }
  
     public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/desenvolvedores", new DesenvolvedoresService());
  
     }

}
