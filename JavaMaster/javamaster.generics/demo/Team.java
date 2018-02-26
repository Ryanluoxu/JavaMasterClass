package demo;

import java.util.List;

public class Team<T extends Player> {

	private String name;
	private List<T> members;
	
	public Team(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void addPlayer(T player) {
		members.add(player);
	}
}
