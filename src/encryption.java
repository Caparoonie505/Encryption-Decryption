import java.io.*;

import java.util.Scanner;
public class encryption extends LanguageGen{
	private static String[] userInputArray2;

	public static void main(String[] args) {
	//Declare variables
	BufferedReader br = null;
	FileReader fr = null;
	String contentLine;
	String userInput;
	
	
	//Set up Scanner
	
	Scanner keyboard = new Scanner(System.in);
	
	//Get message from user
	
	System.out.println("What message would you like to encrypt? \n");
	userInput = keyboard.nextLine();
	String[] userInputArray = userInput.split("(?!^)");
	userInputArray2 = userInputArray;
	//Create and Declare key
	
	KeyGen.CreateKey();	
	String key = KeyGen.ReturnKey();
	
	System.out.println(key);
	//Encrypt Message
	
	String[] key2 = key.split("(?!^)");

	for(int i = 0; i < 5; i++) {
		switch (key2[i]) {
		case "0":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation1.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case "1":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation2.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "2":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation3.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "3":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation4.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "4":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation5.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "5":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation6.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "6":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation7.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "7":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation8.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "8":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation9.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "9":
			//System.out.println("Language " + key2[i]);
			try {
				fr = new FileReader("translation10.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader(fr);
			try {
				String[][] t_1 = new String[94][10];
				contentLine = br.readLine();
				//System.out.println(contentLine);
				String[] content = contentLine.split("(?!^)");
				int count = 0;
				
				for(int i2 = 0; i2 < 94; i2++) {
					for(int j = 0; j < 10; j++) {
						t_1[i2][j] = content[count++];
					}
			/*		System.out.println(t_1[i2][0] + t_1[i2][1] + t_1[i2][2] + t_1[i2][3] + t_1[i2][4] +
									   t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8] + t_1[i2][9]);
			*/		
				}
				
				for(int u = 0; u < userInputArray.length; u++) {
					for(int i2 = 0; i2 < 94; i2++) {
						if(userInputArray[u].equals(t_1[i2][0])) {
							userInputArray2[u] = userInputArray[u].replace(userInputArray[u], 
								(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8]));
						}
					}
				}
				
				for(int o = 0; o < userInputArray2.length; o++) {
					System.out.print(userInputArray2[o]);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}	
	}
			
	
	
	}
	
}

