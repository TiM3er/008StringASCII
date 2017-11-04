package main;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String napis = scan.nextLine(); 
		byte[] bity = napis.getBytes(StandardCharsets.US_ASCII);
		for(int i =0;i<bity.length;i++) {
			System.out.println("Znak: "+napis.charAt(i) +" Dziesietny: "+bity[i]+ " Hex: "+ Integer.toHexString(bity[i]));
		}
	}

}
