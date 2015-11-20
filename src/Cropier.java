import java.util.Vector;
import java.util.Scanner;
import java.util.*;


public class Cropier {

  public Vector<Carte>  myCarte;

  public void distribuerCarte(AbstractJoueur v){
      
      int i,t;
      Random rand =new Random();
      i=rand.nextInt(51);
      t=v.myCarte.capacity();
      v.myCarte.setSize(t+1);
      v.myCarte.add(myCarte.elementAt(i));
      this.myCarte.removeElement(i);
  }

}