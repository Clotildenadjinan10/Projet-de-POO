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
 public class producteur extends Employe {
    
    private final double nbre_unite_produit_par_mois = 5;
    
    private  final int unites;
    
    public producteur(String matricule,String nom, String prenom, int age, String date, int unites){
        
        super(matricule,nom, prenom, age, date);
        
        this.unites = unites;
        
    }
    @Override
   public  double calculersalaire(){

    return ( 5 * unites);
}
public String getNOM (){

    return "le technicien";

     }
}