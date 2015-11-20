public class StrategyAleatoire implements Strategy {

	public boolean deciderDemanderCarte(Integer somme) {
		return Math.random() < 0.5 ? true : false;
	}

}