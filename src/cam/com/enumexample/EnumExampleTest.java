package cam.com.enumexample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EnumExampleTest {
	
	
	private String rob = "Rob";
	private String christina = "Christina";
	private String cameron ="Cameron";
	private String gramm = "Gramm"; 
	
	@Test
	public void test_getNameListByString() {
		EnumExample cameronEx = EnumExample.getListByString(cameron);
		assertThat(cameronEx.getNameList().get(0), is("Cameron"));
		
		EnumExample robEx = EnumExample.getListByString(rob);
		assertThat(robEx.getNameList().get(0), is("Rob"));
		
		
	}
	
	@Test
	public void test_getNameList() {
		EnumExample cameronEx = EnumExample.getListByString(cameron);
		List<String> cameronNameList = cameronEx.getNameList();
		assertThat(cameronNameList.size(), is(3));
		assertThat(cameronNameList.get(0), is("Cameron"));
		assertThat(cameronNameList.get(1), is("Christian"));
		assertThat(cameronNameList.get(2), is("Moore"));
		
	}

}
