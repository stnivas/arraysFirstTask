import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class FirstArrayTask{
 	
 	static Scanner input=new Scanner(System.in);

//question1
	public int findIndex(int[] number,int findNumber){
	    int run=0;
	    for( ; run<number.length; run++){
	    		if(findNumber==number[run]){
	    		//System.out.println("index of given number="+run);
	    		return run;
	     }
	    
        }
       return -1; 
    } 
//question 2   
      public int sumNumber(int[] number){
       
       int sum=0;
        for(int run=0; run<number.length; run++){
           sum=number[run]+sum;	
        }
       return sum;
     }  
//question 3
	public void removeSpecific(int[] number,int remove){
		 for(int run=0; run<number.length; run++){
		 	if(number[run]!=remove){
		 	System.out.println(number[run]);
		  }	
	   } 
	} 
//question 4
 	public void insertValue(int[] number,int position,int insert){
 		for(int run=0; run<number.length; run++){
 			if(number[run]==position){
 				number[run]=insert;
 			 }
 	    }
 	    System.out.println(Arrays.toString(number));
 	     
 			 
 	}	
	
	       
	public static void main (String[] args){
	     FirstArrayTask obj=new  FirstArrayTask();
		System.out.println("enter the your choice");
		int choice =input.nextInt();
	 
	 switch(choice){
	 
	 	case 1:
	 	       int count;
	 	       int number[];
	 		   try{
	 			System.out.println("enter the number count");
	 			  count=input.nextInt();
	 			 number=new int[count];
	 			System.out.println("enter the " + count + " number");
	 		    	
	 		    	for(int run=0;run<count;run++){
	 		    	    System.out.println("enter the number");
	 		    	    number[run]=input.nextInt();
	 		    	}	
	 		    System.out.println("enter the any one number to find the index");	
	 		    	int findNumber=input.nextInt();
	 		    	  int run = obj.findIndex(number,findNumber);
	 		    	System.out.println("index of given number="+run);
	 		    }
	 		   catch( InputMismatchException e){	
	 		   	System.out.println("*please enter the input properly*");
	 		   }
	 			break;
	   case 2:
	   		  try{
	   		  System.out.println("enter the number count");
	 			 count=input.nextInt();
	 			 number=new int[count];
	 			System.out.println("enter the " + count + " number");
	 		    	
	 		    	for(int run=0;run<count;run++){
	 		    	    System.out.println("enter the number");
	 		    	    number[run]=input.nextInt();
	 		    	}
	   		      int sum=obj.sumNumber(number);
	   		      System.out.println("total of given number= "+sum);
      
	   		  	}			
	 			catch( InputMismatchException e){	
	 		   	System.out.println("*please enter the input properly*");
	 		   }
	 			break;
	 			
	  case 3:
	   		  try{
	   		  System.out.println("enter the number count");
	 			 count=input.nextInt();
	 			 number=new int[count];
	 			System.out.println("enter the " + count + " number");
	 		    	
	 		    	for(int run=0;run<count;run++){
	 		    	    System.out.println("enter the number");
	 		    	    number[run]=input.nextInt();
	 		    	 }
	 		   System.out.println("enter the remove value");
	 		  	  int remove=input.nextInt();
	 		      
	 		    	
	   		     obj.removeSpecific(number,remove);
	   		     
      
	   		  	}			
	 			catch( InputMismatchException e){	
	 		   	System.out.println("*please enter the input properly*");
	 		   }
	 			break;
	 case 4:
	         try{
	   		  System.out.println("enter the number count");
	 			 count=input.nextInt();
	 			 number=new int[count];
	 			System.out.println("enter the " + count + " number");
	 		    	
	 		    	for(int run=0;run<count;run++){
	 		    	    System.out.println("enter the number");
	 		    	    number[run]=input.nextInt();
	 		    	 }
	 		   System.out.println("enter the position you want to put th evalue");
	 		  	  int position=input.nextInt();
	 		   System.out.println("enter the insert value");
	 		  	 int insert=input.nextInt();
	 		      
	 		    	
	   		     obj.insertValue(number,position,insert);
	   		     }
	   		     catch( InputMismatchException e){	
	 		   	System.out.println("*please enter the input properly*");
	 		   }
	   		  break;   
	        			
			

	} 			
   }	 			
 } 	 			
	
	
	
