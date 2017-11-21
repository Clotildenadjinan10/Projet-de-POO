/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author Clotilde
 */
 public class manutentionnaire extends Employe{
    
    private final double heure_travail = 65;
    
    private final int heure;
    
public manutentionnaire(String matricule,String nom, String prenom, int age, String date, int heure){
    
    super(matricule,nom, prenom, age, date);
    
    this.heure = heure;
    
}

    /**
     *
     * @return
     */
    @Override
    public double calculersalaire(){
        
        return (65 * heure);
        
    }
    public String getN0M(){
        
        return "le manutentionnaire";
    }
}
