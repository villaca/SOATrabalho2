package br.unirio.soa.Model;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labccet
 */
public class Publicacao {
    
    private int id;
    private static int lastId;
    private String titulo;
    private int paginaInicial, paginaFinal;
    private Date dataPublicacao;

    public Publicacao(String titulo, int paginaInicial, int paginaFinal, Date dataPublicacao) {
        
        this.titulo = titulo;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.dataPublicacao = dataPublicacao;
    
        if(lastId == 0){
            this.id = ++lastId;
        }
    }

    
    
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    
    
}
