package demo;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		ISaveable ryan;
		ISaveable eric;
		
		ryan = new MediaPlayer("ryan", 100, 9900, "sword");
		saveObject(ryan);
		
		eric = new MediaPlayer("", 0, 0, "");
		loadObject(eric);
		System.out.println(eric);
		
	}

	private static void loadObject(ISaveable eric) {
		List<String> values = readValues();
		System.out.println("Values to be loaded: ");
		for (String string : values) {
			System.out.println(string);
		}
		eric.read(values);
	}

	private static List<String> readValues() {
		// fake data
		List<String> values = new ArrayList<>();
		values.add("eric");
		values.add("200");
		values.add("6000");
		values.add("gun");
		return values;
	}

	private static void saveObject(ISaveable saveableObject) {
		List<String> values = saveableObject.save();
		System.out.println("Values to be saved: ");
		for (String string : values) {
			System.out.println(string);
		}
		System.out.println("");
	}
	
	

}
