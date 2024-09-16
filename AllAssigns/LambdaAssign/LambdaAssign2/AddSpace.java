package LambdaAssign2;

public class AddSpace {
	public String addspace(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str += s.charAt(i);
			str += " ";
		}
		return str;
	}
}
