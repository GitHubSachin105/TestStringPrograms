package com.sac.string;

import java.util.Scanner;

public class SpecificStringFromSentanceWithIndex {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the Sentance:");
		String sentance=scn.nextLine();
		System.out.print("Enter the specific string:");
		String s1=scn.next();
		String[] strArr=sentance.split(" ");
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].contains(s1)) {
				String word=strArr[i];
				int i1=word.indexOf(s1);
				for(int j=0;j<i1;j++) {
					System.out.print(word.charAt(j));
				}
				
				System.out.print(s1.toUpperCase());
				
				for(int j=(i1+s1.length());j<word.length();j++) {
					System.out.print(word.charAt(j));
				}
				System.out.println(" :"+word.indexOf(s1));
				
			}		
		}
		scn.close();
	}
}
