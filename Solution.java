package demo;

import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public static int solution(String str1, String str2) {
		int res=0;
		String a="";
		String b="";
		for(int i=0;i<str1.length();i++) {
			if(str2.indexOf(str1.charAt(i))!=-1) a+=str1.charAt(i);
			else res++;
		}
		for(int i=0;i<str2.length();i++) {
			if(str1.indexOf(str2.charAt(i))!=-1) b+=str2.charAt(i);
			else res++;
		}
		char[] ch = a.toCharArray();
		Arrays.sort(ch);
		a = String.valueOf(ch);
		ch = b.toCharArray();
		Arrays.sort(ch);
		b = String .valueOf(ch);
		
		String unique = "";
		String refer = a.length()<=b.length()?a:b;
	
		for(int i=0;i<refer.length();i++) {
			if(unique.indexOf(refer.charAt(i))==-1) unique+=refer.charAt(i);
		}
		
		int ind1=0,ind2=0;
		for(int i=0;i<unique.length();i++) {
			int c1=0;
			int c2=0;
			for( ;ind1<a.length();ind1++) {
				if(unique.charAt(i)!=a.charAt(ind1))  break;
				c1++;
				
			}
			for( ;ind2<b.length();ind2++) {
				if(unique.charAt(i)!=b.charAt(ind2)) break;
				c2++;
				
			}
			
			res += Math.abs(c1-c2);
		}
		return res;
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String a = sc.next();
		System.out.println("Enter 2nd String");
		String b = sc.next();
		int result = solution(a,b);
		System.out.println(result);
	}
}
