public class StrategySeuil implements Strategy {

  public Integer seuil;


  public void setSeuil() {
      System.out.println("Saisir le seuil");
      Scanner sc= new Scanner(System.in);
      seuil=sc.nextInt();
      return seuil;
  }


	public boolean deciderDemanderCarte(int somme) {
		return false;
	}

}