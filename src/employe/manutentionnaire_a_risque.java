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
 public class manutentionnaire_a_risque extends manutentionnaire implements employe_a_risque {
    
    public manutentionnaire_a_risque(String matricule,String nom, String prenom, int age, String date, int heure ){
        
        super(matricule,nom, prenom, age, date, heure );
       
        
    }
    @Override
    public double calculersalaire(){
        
        return super.calculersalaire() + prime_mensuel;
    }
}
