import java.util.Vector;
import java.util.*;


public class Cropier {

  public Vector<Carte>  myCarte;

  public void distribuerCarte(AbstractJoueur v){
      
      //int i,t;
      
      int i;
      Random rand =new Random();
      i=rand.nextInt(51);
      //t=v.myCarte.capacity();
      //v.myCarte.setSize(t+1);
    //  System.out.println("la valeur de rand" + i) ;
      Carte thisCarte = this.myCarte.elementAt(i);
     /* System.out.println("E : " + thisCarte.getEnseigne()) ;
      System.out.println("V : " + thisCarte.getValeur()) ;
      System.out.println("VV : " + v) ;
      System.out.println("V myCarte : " + v.myCarte) ;*/
      v.myCarte.addElement(thisCarte);
      this.myCarte.removeElement(i);
  }
  
  public void initCarte(){
	  String[] enseignes = {"Carreau", "Coeur", "Pique", "Trefle"};
	  this.myCarte = new Vector<Carte>(52);
	  for(int i=0; i<enseignes.length; i++){
		  for(int ii=0; ii<13; ii++){
			  this.myCarte.addElement(new Carte(enseignes[i], ii+1));
		  }
	  }
  }

}