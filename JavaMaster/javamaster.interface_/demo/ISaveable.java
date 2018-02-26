package demo;

import java.util.List;

public interface ISaveable {
	List<String> save();
	void read(List<String> values);
}
