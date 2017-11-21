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
  public class representant  extends commercial{
    
    private final double pourcentage_representation = 20/100;
    
    private final int bonus_representant = 200;
    
    public representant(String matricule,String nom, String prenom, int age, String date, double chiffreAffaire){
        
        super(matricule,nom, prenom, age, date, chiffreAffaire);
    }
    
    @Override
    public double calculersalaire(){
        
        return ( pourcentage_representation*getChiffreAffaire()) + bonus_representant;
        
    }
    public String getNOM(){
        
        return "le representant";
        
    }
}
