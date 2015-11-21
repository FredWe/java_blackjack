import java.io.*;

public class StrategyHumain implements Strategy {

	@Override
	public boolean deciderDemanderCarte() throws IOException, IllegalArgumentException {
		BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
		String str;
		System.out.println("Entrer une lettre à Demander ou Abandonner une nouvelle carte.");
		System.out.println("\"O\" (Oui) pour Demander, \"N\" (Non) pour Abandonner.");
		str = br.readLine();
		if (str.equalsIgnoreCase("o") || str.equalsIgnoreCase("oui")) {
			return true;
		}else if (str.equalsIgnoreCase("n") || str.equalsIgnoreCase("non")) {
			return false;
		}else {
			throw new IllegalArgumentException("Entree illegal");
		}
	}
	
	public boolean deciderDemanderCarte(Integer somme) throws IllegalArgumentException, IOException {
		try{
			return this.deciderDemanderCarte();			
		}catch(Exception e){
			throw e;
		}
	}

}