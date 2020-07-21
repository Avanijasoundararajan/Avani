package com.wipro.task;

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
	String[] str = new String[]{"deepika","apple"};
	String[] str1 = new String[]{"deepika","apple"};
	assertTrue(Arrays.equals(str,str1));
	}
	@Test
	public void testdoStringConcat() {
		String result = "deeps deepika";
		System.out.println("before "+result);
		assertEquals(result,s.doStringConcat("deeps","deepika"));
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
}
