import java.io.*;

import java.util.Arrays;
public class KeyGen {

	private static String key = "";
	
	public KeyGen() {
		
	}
	
	public static void CreateKey() {
		//Declaring variables
		int maxNum = 5;
		int[] codeGen = new int[maxNum];
		
		
		//For statement create and print key
		for(int i = 0; i < codeGen.length; i++) {
			
			int keyOption = (int)(Math.random()*10);
			
			codeGen[i] = keyOption;
			
		}

		System.out.print("Key is: ") ;
		for(int l = 0; l < codeGen.length; l++) {
			
			System.out.print(codeGen[l]);
			key += codeGen[l] + "";
		}
		System.out.println("\n");
	}
	public static String ReturnKey() {
		return key;
		
	}
}
