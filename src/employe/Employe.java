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
public abstract class Employe {

    //les attributs necessaires
    String nom;
    String prenom;
    int age;
    String date;
    String matricule;
 
public Employe(String matricule, String nom, String prenom, int age, String date){
    this.matricule=matricule;
    this.nom = nom;
    this. prenom = prenom;
    this.age = age;
    this.date = date;
    
}
public abstract double calculersalaire();

public String getNom(){
    return ( "l'employé: " + nom +" " + prenom);
    
    
}

}

  
