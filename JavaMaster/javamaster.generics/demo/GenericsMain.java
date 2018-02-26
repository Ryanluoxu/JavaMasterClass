package demo;

public class GenericsMain {

	public static void main(String[] args) {

		BasketballPlayer michael = new BasketballPlayer("Michael");
		FootballPlayer beckham = new FootballPlayer("BeckHam");
		
		Team team1 = new Team("1st team"); // warning
//		Team<String> team2 = new Team<>("2nd team"); // error 
		
		Team<Player> team3 = new Team<>("3rd team");
		team3.addPlayer(beckham);
		team3.addPlayer(michael);
		// able to add both types of player
		
		Team<FootballPlayer> team4 = new Team<>("4th team");
		team4.addPlayer(beckham);
//		team4.addPlayer(michael);	// error
		// only accept football player
	}
}
