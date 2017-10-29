import java.io.*;
public class Language {
	private static String[][] code;
	private static int version;
	public Language(int i, String[][] j) {
		int version = i;
		String[][] code = j;
	}
	public static void add(int a, int b, String c) {
		code[a][b] = c;
	}
	public static void print() {
		
	}
}
