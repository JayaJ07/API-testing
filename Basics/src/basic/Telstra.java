package basic;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Telstra {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file= new File("C:\\Users\\subi0\\Desktop\\json_part1.txt");
		
		Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
      
        
        String json= sc.next();
        json=json.replaceAll("( )+", " ");
        
        
        
     json= json.replaceAll(" ","");
     String spitvaljson1[]=  json.split(","); 
     boolean flag = false;
     
     File file2= new File("C:\\Users\\subi0\\Desktop\\json_part2.txt");
		Scanner sc2 = new Scanner(file2);
     sc2.useDelimiter("\\Z");
   String json2= sc2.next();
   
		 json2=json2.replaceAll("( )+", " ");
		 json2= json2.replaceAll(" ","");
		 
		 
		 
		 String spitval[]=  json2.split(",");
     
     for (int i = 0; i < spitvaljson1.length; i++) {
    	 
    	 spitvaljson1[i]= 	 spitvaljson1[i].replaceAll("[{}]", "");
    	
    	 flag=false; 
    	 
    	 for (int j = i; j <=i; j++) {
    	
    		 spitval[j]= spitval[i].replaceAll("[{}]", "");
    		 System.out.println("The value at spitvaljson1["+i+"]"+spitvaljson1[i]); 
    		 System.out.println("The value at spitval["+j+"]"+spitval[j]);
    		 
    	
				
				  if (spitvaljson1[i].equals(spitval[i])) {
				  
					  flag=false;
				  
				  } else {
				  
					  flag= true;
				
				  
				  }
				 
	}
    	 
    	 
    	 if (flag==true) 
    	 {
    		  System.out.println("Contents are not equal at "+spitvaljson1[i]);
		}
    	 
     }
     
     
     
     
     if (flag==false) 
	 {
    	 System.out.println("Congrats contents are equal");
	}  
     
      
	}}    
        
		
		


