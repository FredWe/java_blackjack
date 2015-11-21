
public class StrategyTest {
	
	public static void testSeuil(Strategy S, Integer seuil){
		((StrategySeuil) S).setSeuil(seuil);
		System.out.println("Seuil : " + ((StrategySeuil) S).getSeuil());
		for (int i = 0; i<25; i++){
			System.out.println("Somme comme " + i);
			try{
				System.out.println(S.deciderDemanderCarte(i));
			}catch(Exception e){
				System.out.println(e);
			}			
		}
	}
	
	public static void main(String[] args) {
/*
		System.out.println("Hello world, Let's begin\n");
		Strategy Strategy1 = new StrategyAleatoire();
		Strategy Strategy2 = new StrategyHumain();
		Strategy Strategy3 = new StrategySeuil();
		
		System.out.println("StrategyAleatoire :");
		for(int i=0;i<5;i++){
			System.out.println(Strategy1.deciderDemanderCarte());
		}
		for(int i=0;i<5;i++){
			System.out.println(Strategy1.deciderDemanderCarte(i));
		}
		
		System.out.println("StrategyHumain :");
		for(int i=0;i<3;i++){
			try{
				System.out.println(Strategy2.deciderDemanderCarte());
			}catch(Exception e){
				System.out.println(e);
			}
		}
		for(int i=0;i<3;i++){
			try{
				System.out.println(Strategy2.deciderDemanderCarte());
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		System.out.println("StrategySeuil :");
		try{
			System.out.println(Strategy3.deciderDemanderCarte());
		}catch(Exception e){
			System.out.println(e);
		}
		
		testSeuil(Strategy3, -1);
		testSeuil(Strategy3, 20);
		testSeuil(Strategy3, 21);
		testSeuil(Strategy3, 100);
		testSeuil(Strategy3, -1);

}
		
		
		try{
			uneCarte.setValeur(0);
		}catch(IllegalArgumentException e){
	         System.out.println(e);
	      }
		try{
			uneCarte.setEnseigne("toto");
		}catch(IllegalArgumentException e){
	         System.out.println(e);
	      }
		uneCarte.setValeur(1);
		uneCarte.setEnseigne("carrEau");
		System.out.println("Valeur : " + uneCarte.getValeur());
		System.out.println("Enseigne : " + uneCarte.getEnseigne());
*/
	}
}
