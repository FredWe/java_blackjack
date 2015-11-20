import java.util.Vector;
import java.util.Scanner;
import java.util.*;


public class Cropier {

  public Vector<Carte>  myCarte;

  public void distribuerCarte(AbstractJoueur v){
      
      int i,t;
      Random rand =new Random();
      i=rand.nextInt(51);
      t=sizeof(v.myCarte);
      v.myCarte.setSize(t+1);
      v.myCarte.add(myCarte(i));
      this.myCarte.removeElement(i);
  }

}