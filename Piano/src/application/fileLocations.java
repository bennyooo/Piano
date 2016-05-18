package application;

import java.util.*;


public class fileLocations{

	public static String getLocation(int i){
		String location;
		ArrayList<String> fileLocations = new ArrayList<String>();
		Collections.addAll(fileLocations, 	"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\c1.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\d.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\e.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\f.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\g.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\a.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\b.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\c2.mid");
		location = fileLocations.get(i);
		return location;
	}
}