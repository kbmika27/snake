package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {//キャメルに
		String[] words = snake_case.split("_");//_で分割
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {//スネークに
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				//sb.append(camelcase.substring(j,i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				j = i;
			}
			sb.append(Character.toLowerCase(c));
		}
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if(s.length()==0)
			return "";
		else{
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst +rest;
		}
	}

	static String uncapitalize(String s) {
		if(s.length()==0)
			return "";
		else{
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
		}
	}
}
