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
  abstract class commercial extends Employe {
    
    double chiffreAffaire;
    
    public commercial(String matricule,String nom, String prenom, int age, String date, double chiffreAffaire ){
    
    super(matricule,nom,prenom,age,date);
    }
    
    public double getChiffreAffaire(){ 
        
        return chiffreAffaire;
        
    }
}