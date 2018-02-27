package org.leetcode.divya.RomanToInt;
import java.lang.String;
public class romantoint {
	public static int RomanToInt(String s) {
		char [] l = s.toCharArray();
		int [] n = new int [l.length];
		int a = 0;
		for(int i=0; i<l.length; i++) {
			switch(l[i]) {
			case 'M': n[i]=1000;
				break;
			case 'D': n[i]=500;
				break;
			case 'C': n[i]=100;
				break;
			case 'L': n[i]=50;
				break;
			case 'X': n[i]=10;
				break;
			case 'V': n[i]=5;
				break;
			case 'I': n[i]=1;
				break;
			}
		}
		for(int i=0; i<n.length-1; i++) {
			if (n[i]>=n[i+1])
				a+=n[i];
			else
				a-=n[i];
		}
		a+=n[n.length-1];
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "MDVI";
		System.out.println("The given Roman vaule : " + s);
		int a = RomanToInt(s);
		System.out.println("the integer value :"+ a);
		}
}
