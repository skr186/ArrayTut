package com.smtech;

public class A {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,8,10,1};
		int[] b = {1,4,10,15,16};
		
		int [] c = {1,2,3,4,5};
		int [] d = new int [5] ;
		
		
		for(int i=0; i<a.length;i++) {
			
			for(int j =0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					
				}
			}
		}
		System.out.println("======================");
		
		for(int i=0; i<c.length; i++) {
			d[i]= c[i]+1;
			
			}
		for(int i = 0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		
		}
	}


