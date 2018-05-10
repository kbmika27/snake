package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
public class SnakeTest {

	@Test
	public void snakeToCamelcaseでスネークからキャメルに変換できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expect="AbcDef";
		String actual=sn.snakeToCamelcase("_abc_def__");
		assertThat(actual,is(expect));
	}
	@Test
	public void camelToSnakecaseでキャメルからスネークに変換できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expect="abc_def_gh";
		String actual=sn.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expect));
	}
	@Test
	public void capitalizeで頭文字を大文字にできる(){
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expect="";
		String actual=sn.capitalize("");
		assertThat(actual,is(expect));
	}
	@Test
	public void uncapitalizeで頭文字を小文字にできる(){
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expect="xyz";
		String actual=sn.uncapitalize("Xyz");
		assertThat(actual,is(expect));
	}
}
