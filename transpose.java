package com.example.tests;

import java.util.Scanner;

public class transpose {

    

    

    public static void main(String[] args) {



                  // transpose();
    	//transpose2();
    	//Macierz3();
    	arrej();

                 }

    public static void transpose() {



final int[][] original = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

for (int i = 0; i < original.length; i++) {

for (int j = 0; j < original[i].length; j++) {

    System.out.print(original[i][j] + " ");

}

System.out.print("\n");

}

System.out.print("\n\n matrix transpose:\n");

// transpose

if (original.length > 0) {

for (int i = 0; i < original[0].length; i++) {

    for (int j = 0; j < original.length; j++) {

        System.out.print(original[j][i] + " ");

    }

    System.out.print("\n");

}

}}
    

    public static void transpose2() {



    	 int[][] original = new int[][] {{5,6},{6,9,4} };
    	for (int i = 0; i < original.length; i++) {
    		 System.out.println(original[i].length);
    		for (int j = 0; j < original[i].length; j++) {

    	   // System.out.print(original[i][j] + " ");

    		}
    	}
}
    
    
    public static void Macierz3() {
    	
    	
    	System.out.print("podaj wartosc");
    	Scanner Skan = new Scanner(System.in);
    	
    	
    	int zmienna1 = Skan.nextInt();
    	int tab4[][]= new int[zmienna1][zmienna1];
    	
    	for(int i=0; i<tab4.length; i++) {
    		for(int y=0; y<tab4[i].length;y++) {
    			if(i==y || tab4.length-i==y+1) {
    				tab4[i][y]=1;
    			}
    			else {
    				tab4[i][y]=0;
    			}
    				
    		}
    			
    	}
    	
    	for(int i=0; i<tab4.length; i++) {
    		for(int y=0; y<tab4[i].length;y++) {
    			System.out.print(tab4[i][y]+ " ");
    		}
    		System.out.println();
    	
    }
    	
    	
    
    
    } 
    
    
    
    

    	
    	
    	public static  void arrej() {
    		String war = "ji";
        	String tab5[] = new String[1];
    		tab5[0] = war;
    		System.out.print(tab5[0]);
    	}
    	
    	
    
    
    
    
}

