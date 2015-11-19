public class StrategyAleatoire implements Strategy {

	@Override
	public boolean deciderDemanderCarte(Integer somme) {
		// TODO Auto-generated method stub
		return Math.random() < 0.5 ? true : false;
	}

}