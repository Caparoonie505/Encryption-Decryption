import java.io.*;
import java.util.Random;

public class LanguageGen {
	
	
	
	private static String[] translation_1;

	private static String[][] language_1 = new String[94][6];
	private static String[][] language_2 = new String[94][6];
	private static String[][] language_3 = new String[94][6];
	private static String[][] language_4 = new String[94][6];
	private static String[][] language_5 = new String[94][6];
	private static String[] trans1 = new String[5];
	private static String[] trans2 = new String[5];
	
	public LanguageGen() {
		
		
		
	}
	
	public static void genLan(){
		
		
		String[] langTrans = new String[94];
		
		String[] keyboard_Characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B",
				"C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9",
				"0","`","~","!","@","#","$","%","^","&","*","(",")","-","_","=","+","[","]","{","}","|",";",":","'","\"",",",".","<",">","/","?"," ",};
		String[] translation_1 = new String[5];
		
		for(int i = 0; i < langTrans.length; i++) {
			int[] char_translation = {0,1,2,3,4};
			
			for(int k = 0; k < 5; k++) {
				Random randNum = new Random();
				int myNum = randNum.nextInt(94);
				char_translation[k] = myNum;
				translation_1[k] = keyboard_Characters[myNum];
				
			}

			language_1[i][1] = translation_1[0];
			language_1[i][2] = translation_1[1];
			language_1[i][3] = translation_1[2];
			language_1[i][4] = translation_1[3];
			language_1[i][5] = translation_1[4];
			
		}
	/*	int count = 0;
		for(int m = 0; m < 94; m++) {
		language_1[m][0] = keyboard_Characters[count];				
		System.out.println(language_1[m][0] + " = " +
		   language_1[m][1] + 
		   language_1[m][2] + 
		   language_1[m][3] + 
		   language_1[m][4] + 
		   language_1[m][5]);
		count++;
		}
	*/	
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("translationUnAltered.txt"), "utf-8"))) {
			int count = 0;
			for(int m = 0; m < 94; m++) {
			language_1[m][0] = keyboard_Characters[count];				
			writer.write(language_1[m][0] + " = " +
			   language_1[m][1] + 
			   language_1[m][2] + 
			   language_1[m][3] + 
			   language_1[m][4] + 
			   language_1[m][5] + " ");
			count++;
			}
			writer.write(" ");
			
	   
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
