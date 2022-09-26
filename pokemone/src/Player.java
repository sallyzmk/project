import java.util.ArrayList;


public class Player {
	private String name;
	final int maxPokemonNumber = 4;
	ArrayList<pokemon> myPokemonList = new ArrayList<>();
	private int presentPokemonNumber = myPokemonList.size();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}