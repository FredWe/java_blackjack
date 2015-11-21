public class StrategyAleatoire implements Strategy {

	public boolean deciderDemanderCarte(Integer somme) {
		return this.deciderDemanderCarte();
	}
	public boolean deciderDemanderCarte() {
		return Math.random() < 0.5 ? true : false;
	}

}