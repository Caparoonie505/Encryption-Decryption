import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Decrypt {
	private static FileReader fr;
	private static BufferedReader br;
	private static String contentLine;


	public static void main(String [] args) {
		String key;
		Scanner keyboard = new Scanner(System.in);
		String userInput;
		
		
		System.out.println("What is your encrypted message?\n");
		userInput = keyboard.nextLine();
		String[] userInputArray = userInput.split("(?<!^)");
		
		String[] userInputArray2 = new String[userInputArray.length];
		String[] m_1 = new String[100000];
		System.out.println("What is your key?\n");
		key = keyboard.nextLine();
		String[] key1 = key.split("(?!^)");
		
		for(int p1 = 4; p1 >= 0; p1--) {
			switch(key1[p1]) {
			case "0":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case "1":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "2":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "3":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "4":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "5":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "6":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "7":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "8":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
			case "9":
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
					
					//List<String> list = new ArrayList<String>(0);	
					
					int index = 0;
					String[] s1 = new String[content.length/5];
					for(int i = 0; i < content.length/5; i++) {
						s1[i] = (contentLine.substring(index, Math.min(index + 5,contentLine.length())));
						index+=5;
					}
					System.out.println();
					for(int u = 0; u < s1.length; u++) {
						for(int i2 = 0; i2 < 94; i2++) {
							if((s1[u]).equals(t_1[i2][4] + t_1[i2][5] + t_1[i2][6] + t_1[i2][7] + t_1[i2][8])) {
								s1[u].replace((s1[u]),t_1[i2][0]);
							}
						}
					}
					
/*					for(int o = 0; o < userInputArray2.length; o++) {
						System.out.print(userInputArray2[o]);
					}*/
					
					for(int j = 0; j < s1.length; j++) {
					m_1[j] = s1[j];
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				break;
				default:
					System.out.println("Something went wrong...");
					break;

				
				
			}
			
			}
		System.out.println("Decryption complete!");
		System.out.println("Message reads...");
//		for(int o = 0; o < m_1.length; o++) {
			System.out.print(m_1[0]);
//		}
		
	}
}
