package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
public class SnakeTest {

	@Test
	public void snakeToCamelcaseでスネークからキャメルに変換できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expect="AbcDefGhi";
		String actual=sn.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expect));
	}
	@Test
	public void camelToSnakecaseでキャメルからスネークに変換できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expect="abc_def_ghi";
		String actual=sn.camelToSnakecase("AbcDefGhi");
		assertThat(actual,is(expect));
	}

}
