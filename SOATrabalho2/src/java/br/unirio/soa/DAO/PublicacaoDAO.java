/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.soa.DAO;

import br.unirio.soa.Model.Publicacao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author labccet
 */
public class PublicacaoDAO {
    
    
    public ArrayList<Publicacao> getAll(){
        ArrayList<Publicacao> biblioteca = new ArrayList<Publicacao>();
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy"); 
        Date date;
        
        try{
            Publicacao publicacao1 = new Publicacao(
                "A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring.",
                        0, 0, dateFormat.parse("2015")
            );
            Publicacao publicacao2 = new Publicacao(
                "ResearchOps: The case for DevOps in scientific applications.",
                        1398, 1404, dateFormat.parse("2015")
            );
            Publicacao publicacao3 = new Publicacao(
                "Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study.",
                        1441, 1448, dateFormat.parse("2015")
            );
            Publicacao publicacao4 = new Publicacao(
                "WISE-SPL: Bringing Multi-tenancy to the Weather InSights Environment System.",
                        0, 0, dateFormat.parse("2015")
            );
            
            biblioteca.add(publicacao1);
            biblioteca.add(publicacao2);
            biblioteca.add(publicacao3);
            biblioteca.add(publicacao4);
            
        } catch (Exception e){
            System.out.println("dane-se");
        }
        
        return biblioteca;
    }
    
    public ArrayList<Publicacao> getAllbyTitle(String title){
    
        ArrayList<Publicacao> biblioteca = this.getAll();
        ArrayList<Publicacao> biblioteca2 = new ArrayList<Publicacao>();
                
        
        for(Publicacao publicacao : biblioteca){
            if(publicacao.getTitulo().equalsIgnoreCase(title)){
                biblioteca2.add(publicacao);
            }
        }
        
        return biblioteca2;
    }
    
    
    
}
