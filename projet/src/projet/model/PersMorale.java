/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

/**
 *
 * @author jessi
 */
public class PersMorale extends Personne {
   
    private long numSiret;
    private String nomSociete;

    //CONSTRUCTEUR
    
    public PersMorale(String adresseP, String villeP, String cpP, long telP, String emailP, long numSiret, String nomSociete){
        super (adresseP, villeP, cpP, telP, emailP);
        this.numSiret = numSiret;
        this.nomSociete = nomSociete;
    }
    
    //GET AND SET

    public long getNumSiret() {
        return numSiret;
    }

    public void setNumSiret(long numSiret) {
        this.numSiret = numSiret;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }
    
    
    
}
