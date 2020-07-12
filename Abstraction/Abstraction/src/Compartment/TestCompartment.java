package Compartment;
import java.util.*;
import java.io.*;

public class TestCompartment extends Compartment {
	@Override
	public String notice() {
		return null;
		// TODO Auto-generated method stub
	}
	public static void main(String[] args){
		FirstClass f1 = new FirstClass();
		Laddies l1 = new Laddies();
		General g1 = new General();
		Luggage l11 = new Luggage();
		Scanner s1 = new Scanner(System.in);
		int[] arr = new int[10];
		int randomnum = 0;
		for(int i = 0; i < 10 ; i++){
			arr[i] = (int)(Math.random()*((4-1)+1))+1;
			if(arr[i] == 1){
				System.out.println(f1.notice());
			}
			if(arr[i] == 2){
				System.out.println(l1.notice());
			}
			if(arr[i] == 3){
				System.out.println(l11.notice());
			}
			if(arr[i] == 4){
				System.out.println(g1.notice());
			}
		}
	}
}