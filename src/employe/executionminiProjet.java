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
public class executionminiProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        personnel perso = new personnel();
        
        
        perso.ajouterEmploye(new vendeur("AZ125","Madallah","Marie",70,"1996",4000));
        perso.ajouterEmploye(new representant("EZ200","Raison","Djimtoingar",45,"1987",5000));
        perso.ajouterEmploye(new producteur("AR250","Mantar","Judith",30,"2000",3500));
        perso.ajouterEmploye(new manutentionnaire("AT300","Meré","Carine",28,"2003",2500));
        perso.ajouterEmploye(new producteur_a_risque("AR2512","Mantario","Judithine",30,"2000",3500));
        perso.ajouterEmploye(new manutentionnaire_a_risque("AT306","Merino","Cariline",28,"2003",2500));
       //affichage nom et salaire
        perso.affichersalaire();
        //le salaire moyen
       System.out.println("le salaire moyen est "+ perso.salaireMoyen()+" francs ");
    }
    
}
