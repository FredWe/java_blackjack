public class StrategySeuil implements Strategy {

  private Integer seuil;

  public void setSeuil(Integer s) {
	  this.seuil = s;
  }
  public Integer getSeuil(){
	  return this.seuil;
  }


	@Override
	public boolean deciderDemanderCarte(Integer somme) {
		return (somme < this.seuil) ? true : false;
	}

}