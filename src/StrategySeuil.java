public class StrategySeuil implements Strategy {

	private Integer seuil;
	
	public void setSeuil(Integer s) {
		this.seuil = s;
	}
	public Integer getSeuil(){
		return this.seuil;
	}
  
  	public boolean deciderDemanderCarte() throws UnsupportedOperationException {
  		throw new UnsupportedOperationException("Utiliser StrategySeuil necessite un valeur Somme comme l'entree");
  	}
	@Override
	public boolean deciderDemanderCarte(Integer somme) {
		return (somme < this.seuil) ? true : false;
	}

}