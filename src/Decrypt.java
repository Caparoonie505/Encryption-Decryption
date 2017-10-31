import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Decrypt{
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
	String finalMessage = "";
//Set up Scanner
	
	Scanner keyboard = new Scanner(System.in);
	
//Get message from user
	
	System.out.println("What message would you like to Decrypt? \n");
	userInput = keyboard.nextLine();
	String[] userInputArray = userInput.split("(?!^)");
//	System.out.println(Arrays.toString(userInputArray));
//Initialize inputList	
//	for(int i = 0; i < userInputArray.length; i++) {
//		inputList.add(userInputArray[i]);
//	}


//Get key from user
	System.out.println("What is your key? \n");	
	String key = keyboard.nextLine();
	String[] key2 = key.split("(?!^)");
	int[] key3 = new int[key2.length];
	for(int q = 0; q < key2.length; q++) {
		key3 = Arrays.stream(key.split("(?!^)")).mapToInt(Integer::parseInt).toArray();  
	}
//Decrypt Message
	

	for(int i = key3.length - 1; i > -1; i--) {
//Declare variables subject to change in decryption protocol
		int index = 0;
		inputList.clear();
		while (index < userInput.length()) {
		    inputList.add(userInput.substring(index, Math.min(index + 5,userInput.length())));
		    index += 5;
		}
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
			outputList.clear();
//Split file language into individual arrays in a 2-dimensional array
			for(int i2 = 0; i2 < 94; i2++) {
				for(int j = 0; j < 10; j++) {
					t_1[i2][j] = content[count++];
				}	
			}
//			for(int m = 0; m < inputList.size(); m++) {
//				outputList.add(inputList.get(m));
//			}
//			System.out.println("Error!");
//			outputList.clear();
			outputList.clear();
			for(int b = 0; b < inputList.size(); b++) {
				outputList.add(inputList.get(b));
			}
			for(int u = 0; u < inputList.size(); u++) {
				for(int i2 = 0; i2 < 94; i2++) {
					if(inputList.get(u) != null) {		
//						System.out.println("inputList = " + inputList);
						if (inputList.get(u).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
//							System.out.println("inputList.get(u): " + inputList.get(u));
//							System.out.println("This is equal to  " + (t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
//							System.out.println("Setting outputList to " + t_1[i2][0]);
							outputList.set(u,t_1[i2][0]);
//							System.out.println("OutputList.get(u): " + outputList.get(u));
//							System.out.println("inputList changed to: " + inputList);
//							System.out.println(u);
						}
					}
				}
			}
//			System.out.println("New outputList: " + outputList);
			if(userInput.equals("") == false) {
				userInput = "";
			} if(userInput.equals("")) {
				for(int k = 0; k < outputList.size(); k++) {
					userInput += outputList.get(k);
				}
			}
//			userInputArray = userInput.split("(?!^)");
			for(int n = 0; n < inputList.size(); n++) {
				finalMessage += outputList.get(n);
//				System.out.println(finalMessage);
			}
//			System.out.println("\n");
//			for(int o = 0; o < inputList.size(); o++) {
//				System.out.print(outputList.get(o));
//			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Reset userInput to outputList and break into array of string
		
		
	}
//After encryption

	System.out.println("\nTranslation Complete! Decrypted message below...");		
//	System.out.println("Message is: " + finalMessage);
	for(int o = 0; o < inputList.size(); o++) {
		System.out.print(outputList.get(o));
	}
	}
	
}