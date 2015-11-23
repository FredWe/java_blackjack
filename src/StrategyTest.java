import java.io.IOException;

public class StrategyTest {
	
	public static void testSeuil(Strategy S, Integer seuil){
		((StrategySeuil) S).setSeuil(seuil);
		for (int i = 0; i<25; i++){
			System.out.println("Seuil : " + ((StrategySeuil) S).getSeuil());
			System.out.println("Somme comme " + i);
			try{
				System.out.println(S.deciderDemanderCarte(i));
			}catch(Exception e){
				System.out.println(e);
			}			
		}
	}

/*
	public static void main(String[] args) {	
		System.out.println("Hello world, Let's begin\n");
		Strategy Strategy1 = new StrategyAleatoire();
		Strategy Strategy2 = new StrategyHumain();
		Strategy Strategy3 = new StrategySeuil();
		
		System.out.println("StrategyAleatoire :");
		for(int i=0;i<5;i++){
			try {
				System.out.println(Strategy1.deciderDemanderCarte(i));
			} catch (IllegalArgumentException | IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("StrategyHumain :");
		for(int i=0;i<3;i++){
			try{
				System.out.println(Strategy2.deciderDemanderCarte(i));
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		System.out.println("StrategySeuil :");
		Integer[] testSeuil = {-1, 20, 21, 100};
		for(int i=0; i<testSeuil.length; i++){
			testSeuil(Strategy3, testSeuil[i]);
		}
	}
*/
}
