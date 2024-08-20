package com.project.colecao.modelos;


import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({ WebJogo.class })
public class Jogo {

    @XmlElementWrapper(name = "desenvolvedores")
    @XmlElement(name = "desenvolvedor")
    @XmlJavaTypeAdapter(value = AdaptadorDesenvolvedores.class)
    private List<Desenvolvedor> desenvolvedores;
    private String nome;
    private String empresa;
    private Date dataLancamento = new Date();
    private String resumo;

    public Jogo(){
    }


    public Jogo(String nome, String empresa, List<Desenvolvedor> desenvolvedores, Date dataLancamento, String resumo) {
        this.nome = nome;
        this.empresa = empresa;
        this.desenvolvedores = desenvolvedores;
        this.dataLancamento = dataLancamento;
        this.resumo = resumo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public static class AdaptadorDesenvolvedores extends XmlAdapter<String, Desenvolvedor> {

        @Override
        public String marshal(Desenvolvedor desenvolvedor) throws Exception {
            return desenvolvedor.getNome();
        }

        @Override
        public Desenvolvedor unmarshal(String desenvolvedor) throws Exception {
            return new Desenvolvedor(desenvolvedor, null);
        }

    }

}