package com.wipro.test;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.wipro.task.TestStringConcat;
@RunWith(Suite.class)
@Suite.SuiteClasses(TestStringConcat.class)
public class TestSuiteAll {
}
/*import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
public class TestSuiteAll {
	public static void main(String[] args){
		Result res = JUnitCore.runClasses(TestStringConcat.class);
	}
}*/
/*package com.wipro.test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.*;
import com.wipro.task.DailyTasks;
public class TestStringConcat {
	DailyTasks s = new DailyTasks();
	DailyTasks s2 = new DailyTasks();
	DailyTasks s1 = s;
	@Before
	public void d1()
	{
		System.out.println("main before");
	}
	@After
	public void d2()
	{
		System.out.println("main after");
	}
	@BeforeClass
	public static void d3()
	{
		System.out.println("main before class");
	}
	@AfterClass
	public static void d4()
	{
		System.out.println("main after class");
	}
	@Test
	public void String(){
	String[] str = new String[]{"Avanija","apple"};
	String[] str1 = new String[]{"Avanija","apple"};
	assertTrue(Arrays.equals(str,str1));
	}
	@Test
	public void testdoStringConcat() {
		String result = "deeps deepika";
		System.out.println("before "+result);
		assertEquals(result,s.doStringConcat("Avani","Avanija"));
	}
	@Test
	public void testsortValues(){
		int result[] = {1,2,3,4};
		System.out.println("test sort values");
		assertArrayEquals(result,s.sortValues(new int[]{4,3,1,2}));
		int result1[] = s.sortValues(new int[]{3,2,1,4});
		assertTrue(result.equals(result1));
		assertTrue(Arrays.equals(result1,result));
	}
	@Test
	public void testObject1(){
		System.out.println("test object1");
		assertTrue(s.equals(s1));
	}
	@Test
	public void testObject(){
		System.out.println("test object");
		assertFalse(s.equals(s2));
	}
}*/
/*package com.wipro.task;
import java.util.Arrays;
public class DailyTasks {
	public Object sortValues;
	public String doStringConcat (String s1, String s2) {
		return s1+" "+s2;
	}
	public int[] sortValues(int arr[]){
		Arrays.sort(arr);
		return arr;
	}
	public boolean checkPresence(String str,String a){
		return str.contains(a);
	}
	public int sum(int a,int b){
		return 2+3;
	}
}
*/