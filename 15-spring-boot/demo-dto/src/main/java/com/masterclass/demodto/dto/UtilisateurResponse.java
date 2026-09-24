package com.masterclass.demodto.dto;
import java.time.LocalDateTime;
public class UtilisateurResponse{
    private Long id;
    private String nom;
    private String email;
    private LocalDateTime createdAt;

    public UtilisateurResponse(){}
    public UtilisateurResponse(Long id, String nom, String email){
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
}