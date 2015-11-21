import java.io.IOException;

public interface Strategy {

	public boolean deciderDemanderCarte(Integer somme) throws IllegalArgumentException, IOException;
	public boolean deciderDemanderCarte() throws IOException, IllegalArgumentException;

}