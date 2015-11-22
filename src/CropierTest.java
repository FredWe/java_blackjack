import java.util.Iterator;
import java.util.Vector;

public class CropierTest {
	public static void showCarte(Vector<Carte> vca){
		System.out.println("getMyCarte().size() : " + 
				vca.size());
		Iterator<Carte> iter = vca.iterator();
		Carte thisCarte;
		while(iter.hasNext()){
			thisCarte = iter.next();
			System.out.println("indexOf(thisCarte) : " + 
					vca.indexOf(thisCarte));
			System.out.println(thisCarte.getEnseigne() + 
					" " + thisCarte.getValeur());
		}
	}
/*	
	public static void main(String[] args) {
		System.out.println("Hello world, Let's begin\n");
		Cropier crop = new Cropier();
		crop.initCarte();
		showCarte(crop.getMyCarte());
		Banque banq = new Banque(new StrategyAleatoire());
		showCarte(banq.getMyCarte());
		crop.distribuerCarte(banq);
		showCarte(crop.getMyCarte());
		showCarte(banq.getMyCarte());
		for(int i=0; i<53; i++){
			try{
				crop.distribuerCarte(banq);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		showCarte(crop.getMyCarte());
		showCarte(banq.getMyCarte());
	}
*/
}
