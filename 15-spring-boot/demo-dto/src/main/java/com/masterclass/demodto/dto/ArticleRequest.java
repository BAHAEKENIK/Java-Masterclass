package com.masterclass.demodto.dto;

public class ArticleRequest{
    private String titre;
    private String contenu;
    private Long auteurId;
    public ArticleRequest(){}

    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public String getContenu(){
        return contenu;
    }
    public void setContenu(String contenu){
        this.contenu = contenu;
    }
    public Long getAuteurId(){
        return auteurId;
    }
    public void setAuteurId(Long auteurId){
        this.auteurId = auteurId;
    }
   
}