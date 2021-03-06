package Lab;

import java.io.*;

public class UpperCaseIOFile {

	public static void main(String args[]) throws Exception {
		ByteArrayOutputStream f = new ByteArrayOutputStream(12);
		System.out.println("Enter 10 characters");
		System.out.println("These will be converted to uppercase and displayed");
		while (f.size() != 10) {
			f.write(System.in.read());
		}
		System.out.println("***********************************************");
		System.out.println("Accepted characters into an array");
		byte b[] = f.toByteArray();

		System.out.println("Displaying characters in the array");
		for (int l = 0; l < b.length; l++) {
			System.out.print((char) b[l]);
		}
		ByteArrayInputStream inp = new ByteArrayInputStream(b);
		int c;
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("Converted to upper case characters");
		for (int i = 0; i < 1; i++) {
			while ((c = inp.read()) != -1) {
				System.out.print(Character.toUpperCase((char) c));
			}
			System.out.println();
			inp.reset();
		}
	}

}

