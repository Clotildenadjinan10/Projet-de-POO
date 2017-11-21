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
  public class producteur_a_risque extends producteur implements employe_a_risque {
    
    public producteur_a_risque(String matricule,String nom, String prenom, int age, String date, int unite){
        
        super(matricule,nom, prenom, age, date, unite);
    }
    
    public double calculerSALAIRE(){
        
        return super.calculersalaire() + prime_mensuel;
    }
    
}
