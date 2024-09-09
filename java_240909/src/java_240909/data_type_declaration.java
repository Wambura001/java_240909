package java_240909;

import java.util.Arrays;

public class data_type_declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte [] byteArray = new byte [] {20, 87, 79, 46}; 
		System.out.print("\n'Byte Array " + 
		Arrays.toString(byteArray));
		
		short [] shortArray = new short [] {-32768,87,79};
		System.out.print("\n\r'Short Array " +
		Arrays.toString(shortArray));
		
		int [] intArray = new int [] { -2147483648,87,79,46};
		System.out.print("\n\r'Integer Array " + 
		Arrays.toString(intArray));
		
		int score = 2;
		System.out.print("\n\r'Integer output " + score);
		
		double hits = 2;
		System.out.print("\n\r'Double output " + hits);
		
		char level = 'D';
		System.out.print("\n\r' Character output " + level);
		
		String D_level = "Very Difficult"; 
		System.out.print("\n\n'String output " + D_level);
		
		int x, y, z;
		
		x = 10;
		y = 25;
		z = y / x;
		
		System.out.print("\n\n'Equation output " + z);
		
		final int hours = 24;
		
		hours = 12;
		
		System.out.print("\n\n'Hours output " + hours);

	}

}
