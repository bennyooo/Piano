package application;

import java.util.*;


class fileLocations{

	static String getLocation(int i){
		String location = "";
		ArrayList<String> fileLocations = new ArrayList<String>();
		Collections.addAll(fileLocations, 	"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\c1.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\db.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\d.mid",
				                            "C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\eb.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\e.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\f.mid",
                                            "C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\fs.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\g.mid",
                                            "C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\gs.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\a.mid",
                                            "C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\as.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\b.mid",
											"C:\\Users\\Benjamin\\Documents\\GitHub\\Piano\\Piano\\notes\\c2.mid");
		location = fileLocations.get(i);
		return location;
	}
}