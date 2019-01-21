package com.example.tests;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		//String dupa="dupa222";
		//System.out.println("liczba"+dupa);
		//skaner();
		//menu();
		//Test();
		//nowego();
		zewnetrzna();
		
	//KolejnyTest();
	}
	
    public static void KolejnyTest() {
    	int [] liczby = {20,12,22,45,13};
    	int zmienna = 0;
    	
    	for(int i=0; i < liczby.length; i++)
    	{
    		if(liczby[i]<=12)
    		{	
    			System.out.println("Elementy macierzy: " + liczby[i] +"  " + i);
    			break;
    		}
    		else if (liczby[i]%2 != 0)
    		{
    			System.out.println("Inne Elementy macierzy nieparzyste: " + liczby[i] + i);
    			continue;
    		}
        	 else 
        	 { 		
        		 zmienna = zmienna + liczby[i];
        		 System.out.println("suma tych co nie wpadaja: " + zmienna +"  " + i); 
        	 }
    	}
    	System.out.print("Zmienna= " + zmienna +"\n");
    	
    	

    

    }
    public static void Test() {
		int [] myArray = new int[10];
		int i=0;
		//Traditional for loop to populate
		for(int k=100; k>0; k=k-10, i++)
		{			
		myArray[i]=k;		
		}				
		//Enhanced for loop to print elements of array
		for(int loopVal: myArray)
		{
		System.out.println(loopVal);
		}
	}
    
    
    
    
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Options\n");
            System.out.println("(1) - do this");
            System.out.println("(2) - quit");

            System.out.print("Please enter your selection:\t");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.print("Enter a sentence:\t");
                String sentence = scanner.nextLine();

                System.out.print("Enter an index:\t");
                int index = scanner.nextInt();

                System.out.println("\nYour sentence:\t" + sentence);
                System.out.println("Your index:\t" + index);
            }
            else if (selection == 2) {
                break;
            }
        }
        
        
     }  
    
    public static void skaner(){
    	String zmien = "tekst";
    	Scanner skaner1 = new Scanner(System.in);
    	
    	 zmien = skaner1.nextLine();
    	 System.out.println("tekst    " + zmien);
    }   
    
   
    
    public static void nowego() {
    	int [] numery = { 34, 13, 67, 23};
    	int ter = 0;
    	
    	for(int i=0; i < numery.length; i++)
    	{
    		if(numery[i]  <= 10) 
    				{
    			System.out.println("1 wynik " + numery[i] +"  " + i);
    			break;
    				}
    		else if(numery[i]%2 != 0)
    		{
    			System.out.println("2 wynik nieparzyste" + numery[i] +"  " + i);
    			continue;
    		}
    		else 
    		{
    			System.out.println("3 wynik" + "  " + ter);
    			ter = ter + numery[i];
    		}
    				
    	}
    	System.out.println("zawsze idzie po breaku" );	
    }
    
    
    public static void zewnetrzna() {
    	
    	int limit = 9;
    	
    	outer: 
    		for (int i=0;;i++) {
    			for(int j=0;j<10;j++) {
    				if(j>i) {
    					System.out.println();
    					continue outer;
    					}
    				System.out.print(" " + (i * j));
    			}
    		if (i==limit){
    			break outer;
    		}
    	}
    	System.out.println();
    	
    	
    }
    
    
    
    
    
    
}
