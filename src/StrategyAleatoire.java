public class StrategyAleatoire implements Strategy {


	public boolean deciderDemanderCarte(int somme) {
		return Math.random() < 0.5 ? true : false;
	}

}