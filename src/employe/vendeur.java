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
 public class vendeur extends commercial{
    
   private final double pourcentage_vente = 20/100;
    
   private final int bonus_vendeur = 100;
    
   public vendeur(String matricule,String nom, String prenom, int age, String date, double chiffreAffaire ){
       
       
       super(matricule ,nom, prenom, age, date, chiffreAffaire);
   }
   @Override
   public double calculersalaire(){
       
       return( pourcentage_vente*getChiffreAffaire()) + bonus_vendeur;
   }
   
   public String getNOM(){
       
       return "le vendeur";
       
   }
}

