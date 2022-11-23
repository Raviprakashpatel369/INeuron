package in.company.main;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int n=14;
		int c=n/2+1;
		for(int i=1;i<=c;++i) {
			for(int k=0;k<i;++k)
				System.out.print("*");
			for(int k=0;k<n-(2*i);k++){
				System.out.print(" ");
			}
			int p=(i>n/2)?n/2-1:i;
			for(int k=0;k<p;++k)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
}





