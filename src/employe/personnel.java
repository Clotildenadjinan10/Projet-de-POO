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
public class personnel {

    private Employe[]collectionEmploye;
    
    private int nombreEmployes;
    
    private final int nbremaxEmploye = 500;
    
public personnel(){
    
    // tableau = collectionEmloye
    
    collectionEmploye = new Employe[nbremaxEmploye];
    
    nombreEmployes = 0;
}
    


public void ajouterEmploye (Employe p) {
    
    ++nombreEmployes;
    
    if(nombreEmployes<=nbremaxEmploye){
        
        collectionEmploye[nombreEmployes-1]=p;
    }
    else 
        System.out.println("pas plus de" + nombreEmployes + "employes");
    }               

    public double salaireMoyen(){
       
        double somme = 0.0;

       for( int i=0; i<nombreEmployes;i++) {
     

           somme =somme+collectionEmploye[i].calculersalaire();

       }
                  return somme/nombreEmployes;
} 
  public void affichersalaire(){
   
   for(int i=0; i<nombreEmployes ; i++)

{
      System.out.println( collectionEmploye[i].getNom() + " " + "a gagné" + " " + collectionEmploye[i].calculersalaire() + " francs");
}

}
}
