package codilityDemos;

public class NestedParanthesis {

	public static void main(String args[]){
	
		String s = "()()()";
		int result = nested(s);
		
		System.out.println(result == 0 ? "No":"Yes");
	}

	private static int nested(String s) {
		int result = 1;
		if (s.contains(" ")) {
			s = s.replaceAll(" ", "");
		}
		while (s.contains("()")) {
			s = s.replaceAll("\\(\\)", "");
		}
		if (s.length()!=0) {
			result = 0;
		}
		return result;
	}
	
}
