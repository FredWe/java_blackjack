import java.util.Vector;
import java.util.*;

public class Cropier implements Cloneable{

  public Vector<Carte> myCarte;

  public Cropier(){
	  this.myCarte = new Vector<Carte>(52);
  }
  public Vector<Carte> getMyCarte(){
	  return this.myCarte;
  }

  
  public void distribuerCarte(AbstractJoueur v){
   
      int i;
      Random rand = new Random();
      if(this.myCarte.size() > 1){
    	  i = rand.nextInt(this.myCarte.size() - 1); // To generate a random number between [0, myCarte.size - 1]
      }else if(this.myCarte.size() == 1){
    	  i = 0;
      }else{
    	  throw new IllegalArgumentException("Cropier : I have no more cards !");
      }

      Carte thisCarte = this.myCarte.elementAt(i);
 
      v.myCarte.addElement(thisCarte);
      if(this.myCarte.size() > 1){
    	  this.myCarte.removeElementAt(i);
      }else{
    	  this.myCarte.clear();
      }
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