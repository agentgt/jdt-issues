package bug;

public sealed interface PatternMatching {
	
	record Stuff() implements PatternMatching {}
	
	static Stuff match(PatternMatching pm) {
		return switch(pm) {
		case Stuff s -> s;
		 //default -> new Stuff(); //... you should not need as we exhausted it but Eclipse NPE w/o a default.
		}; 
	}
}