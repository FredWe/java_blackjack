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
		
		for(int i=0; i<54; i++){
			System.out.println("\n\nThis is Round " + i + "--->");
			try{
				crop.distribuerCarte(banq);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println("\ncroq show Carte : ");
			showCarte(crop.getMyCarte());
			System.out.println("\nbanq show Carte : ");
			showCarte(banq.getMyCarte());
		}
		
		// crop.initCarte();
		// System.out.println("\n" + crop);
		// showCarte(crop.getMyCarte());
		// Cropier crop0 = crop.clone();
		// System.out.println("\n" + crop0);
		// showCarte(crop0.getMyCarte());
	}
*/
}
