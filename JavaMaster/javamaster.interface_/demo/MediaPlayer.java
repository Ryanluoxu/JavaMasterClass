package demo;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer implements ISaveable{
	private String name;
	private int point;
	private int health;
	private String weapon;
	
	public MediaPlayer(String name, int point, int health, String weapon) {
		super();
		this.name = name;
		this.point = point;
		this.health = health;
		this.weapon = weapon;
	}
	
	@Override
	public List<String> save() {
		List<String> values = new ArrayList<>();
		values.add(name);
		values.add(String.valueOf(point));
		values.add(String.valueOf(health));
		values.add(weapon);
		return values;
	}
	@Override
	public void read(List<String> values) {
		name = values.get(0);
		point = Integer.valueOf(values.get(1));
		health = Integer.valueOf(values.get(2));
		weapon = values.get(3);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", point=" + point + ", health=" + health + ", weapon=" + weapon + "]";
	}
}
