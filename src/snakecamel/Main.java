package snakecamel;

public class Main {
	public static void main(String[]args){
		SnakeCamelUtil sc=new SnakeCamelUtil();
		System.out.println(sc.snakeToCamelcase("abc_def_ghi"));
		System.out.println(sc.camelToSnakecase("AbcDefGhi"));
	}

}
