package in.company.main;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int n=14;
		int c=n/2;
		int f=0;
		for(int i=1;i<=n;++i) {
			if(i==1||i==n)
			for(int k=0;k<n;++k)
				System.out.print("*");
			else
			for(int k=0;k<c+f;k++){
				System.out.print("*");
			}
			c--;
			if(c<=0)
				f+=2;
				
			System.out.println();
		}
	}
	
	
}





