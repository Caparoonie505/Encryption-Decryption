import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class encryption extends LanguageGen{
	private static String[] outputArray;

	public static void main(String[] args) {
//Declare variables
	BufferedReader br = null;
	FileReader fr = null;
	String contentLine;
	String userInput;
	String[] languageFiles = {"language/translation1.txt","language/translation2.txt","language/translation3.txt"
			,"language/translation4.txt","language/translation5.txt","language/translation6.txt","language/translation7.txt"
			,"language/translation8.txt","language/translation9.txt","language/translation10.txt"};
	ArrayList<String> outputList = new ArrayList<String>();
	ArrayList<String> inputList = new ArrayList<String>();
//Set up Scanner
	
	Scanner keyboard = new Scanner(System.in);
	
//Get message from user
	
	System.out.println("What message would you like to encrypt? \n");
	userInput = keyboard.nextLine();
	String[] userInputArray = userInput.split("(?!^)");
//Initialize inputList	
	for(int i = 0; i < userInputArray.length; i++) {
		inputList.add(userInputArray[i]);
	}
//Create and Declare key
	
	KeyGen.CreateKey();	
	String key = KeyGen.ReturnKey();
	String[] key2 = key.split("(?!^)");
	int[] key3 = new int[key2.length];
	for(int q = 0; q < key2.length; q++) {
		key3 = Arrays.stream(key.split("(?!^)")).mapToInt(Integer::parseInt).toArray();  
	}
//Encrypt Message
	

	for(int i = 0; i < key3.length; i++) {
//Declare variables subject to change in encryption protocol
		userInputArray = userInput.split("(?!^)");
		try {
//Decide Which language to use
			fr = new FileReader(languageFiles[key3[i]]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		br = new BufferedReader(fr);
		try {
//Initialize try statement variables
			String[][] t_1 = new String[94][10];
			contentLine = br.readLine();
			String[] content = contentLine.split("(?!^)");
			int count = 0;
//Split file language into individual arrays in a 2-dimensional array
			for(int i2 = 0; i2 < 94; i2++) {
				for(int j = 0; j < 10; j++) {
					t_1[i2][j] = content[count++];
				}	
			}
			for(int u = 0; u < userInputArray.length; u++) {
				for(int i2 = 0; i2 < 94; i2++) {
					if(inputList.get(u) != null) {				
						if (inputList.get(u).equals(t_1[i2][0])) {
							outputList.add(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]);
							
						}
					}
				}
			}
			for(int o = 0; o < outputList.size(); o++) {
				System.out.print(outputList.get(o));
			}	
			System.out.println("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Reset userInput to outputList and break into array of string
		if(userInput.isEmpty() == false) {
			userInput = "";
		} if(userInput.isEmpty()) {
			for(int k = 0; k < outputList.size(); k++) {
				userInput += outputList.get(k);
			}
		}
		userInputArray = userInput.split("(?!^)");
		inputList.clear();
		for(int j = 0; j < userInputArray.length; j++) {
			inputList.add(userInputArray[j]);
			outputList.clear();
		}
//After encryption

	}
	System.out.println("\nTranslation Complete! Encrypted message up above...");		
	System.out.println("Key is... " + key);
	
	
	}
	
}

