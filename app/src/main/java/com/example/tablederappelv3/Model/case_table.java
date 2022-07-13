package com.example.tablederappelv3.Model;

import android.net.http.SslCertificate;

import javax.xml.namespace.QName;

public class case_table {

    //attributs
    private String num;
    private String nom;
    private String debut;
    private String fin;

    //constructeur
    public case_table(String num, String nom, String debut, String fin){
        this.num = num;
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
    }

    //Méthode
    public String getNum(){ return num;}
    public String getNom(){ return nom;}
    public String getDebut(){ return debut;}
    public String getFin(){ return fin;}

}
