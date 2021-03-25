package orh.imm;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmpDetails {

		public static void main(String[] args) {
		String s1 = "Python";
			System.out.println("code of s1 : "+ System.identityHashCode(s1));
		String s2 =  "Java";
			System.out.println("code of s2 : "+ System.identityHashCode(s2));
		String s3 = "program";
			System.out.println("code of s1 : "+ System.identityHashCode(s3));
			
			
		//immutable	
		String s4=s1.concat(s3);	
			System.out.println(s4);
			
			System.out.println("code of s4 : "+ System.identityHashCode(s4) );
			
			s1 = "bjb";
		System.out.println("code of s1 : "+System.identityHashCode(s1));
		
		System.out.println("Sucess");
		
		
		int a =12;
		String n = "14adad";
		System.out.println("oneplus");
		String s5 = "Selenium";
		System.out.println("Its my Life");
		 Set<Character> d = new TreeSet();
		 
		 EmpDetails e = new EmpDetails();
		 e.scanner();
		 
		}
		public static void scanner() {
			int a ,res=0,rem=0;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the values : ");
			int n = s.nextInt();
			a=n;
			while (a>0) {
				rem=a%10;
				res=(res*10)+rem;
				a=a/10;
			}
			System.out.println("reverse"+res);

		}

	}

