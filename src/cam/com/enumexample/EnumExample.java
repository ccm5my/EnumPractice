package cam.com.enumexample;

import java.util.*;

public enum EnumExample {

	Cameron(new ArrayList<String>(Arrays.asList("Cameron", "Christian", "Moore"))), Rob(
			new ArrayList<String>(Arrays.asList("Rob", "Adams"))), Christina(
					new ArrayList<String>(Arrays.asList("Christina", "Selvaraj"))), Gramm(
							new ArrayList<String>(Arrays.asList("Gramm", "Nixon")));

	private List<String> nameList = new ArrayList<>();

	private static final Map<String, EnumExample> lookupName = new HashMap<String, EnumExample>();

	static {
		for(EnumExample example: EnumExample.values()) {
			lookupName.put(example.name(), example);
			for(String name:example.nameList) {
				System.out.println(example.name() + " " + name);
			}
		}
	}

	EnumExample(List<String> nameList) {
		this.nameList = nameList;

	}
	
	public ArrayList<String> getNameList() {
		return (ArrayList<String>) nameList;
	}
	
	public static EnumExample getListByString(String name) {
		return lookupName.get(name);
	}
	
}
