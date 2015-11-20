public class StrategySeuil implements Strategy {

  public Integer seuil;


  public void setSeuil() {
      System.out.println("Saisir le seuil");
      Scanner sc= new Scanner(System.in);
      seuil=sc.nextInt();
      return seuil;
  }



	@Override
	public boolean deciderDemanderCarte(Integer somme) {
		// TODO Auto-generated method stub
		return false;
	}

}