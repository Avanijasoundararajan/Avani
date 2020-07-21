package com.wipro.task;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.*;
public class TestCheckPresence {
	public int[] sortValues(int arr[]){
		Arrays.sort(arr);
		return arr;
	}
	@Test
	public void testsortValues(){
		int[] result = {1,2,3,4,5,6};
		int[] arr = new int[]{4,5,6,1,2,3};
		assertFalse(Arrays.equals(result,arr));
	}
}
