package labAssignment_Nov17;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class RevString {
	
	static Scanner sc;
	static int index=0;
	static String input;
	static int count=0;
	public static void main(String[] args) throws Exception {
	
		
			try {
				if(count==0) {
				Scanner sc= new Scanner(System.in);
				int index=0;
			System.out.println("------------------------------------------------");
			System.out.println("Enter the Input String:");
		String input = sc.nextLine();
		if(input.length()==0 ) {
		throw new Exception("Input is Blank ");
		}else if((input.charAt(index)>='0')&&(input.charAt(index)<='9')) {
			
			throw new Exception("Integer input ");
			
		}
		
		else if((input.length()<=5)||(input.length()>=25)) {
			throw new Exception("Invalid input enter string with length between 5 to 25 ");
		}
		
			
			call(input);
				//count++;
				
				
				
				
				
				}
			} catch (Exception e) {
				System.out.println("Problem occured :" +e);
				
				count++;
				call(input);
			}
		
	
		}
	public static void repeat() throws Exception{
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Do you want to reverse another string? Y |N ");
		String answer=sc.next();
		//char answer= sc.next().charAt(0);   
		System.out.println("you said : "+answer+"\n");
		try {
			if((answer.charAt(index)=='y') ||(answer.charAt(index)=='Y')) {
				System.out.println("Ok");
				call(answer);
			}
			else if ((answer.charAt(index)=='N') ||(answer.charAt(index)=='n')) {
				System.out.println("Thank you !!");
				System.exit(0);
			}
			else 
				throw new Exception("Invalid Input Character ");
		}catch(InputMismatchException e) {
			System.out.println(" Check the input :" +e);
		}}
		
		catch(Exception e) {
			System.out.println(" Problem Occured :" +e+"\n");
		}
	}
	public static  void call(String input) throws Exception{
		try {
		if(count>0) {
		Scanner sc= new Scanner(System.in);
			int index=0;
			System.out.println("-------------------------------------------------------------------------");
		System.out.println("Enter the Input String:");
	 input = sc.nextLine();
			
		System.out.println(" USER INPUT :\t"+input);
		}
		if(input.length()==0 ) {
		throw new Exception("Input is Blank ");
		}else if((input.charAt(index)>='0')&&(input.charAt(index)<='9')) {
			
			throw new Exception("Integer input ");
			
		}
		
		else if((input.length()<=5)||(input.length()>=25)) {
			throw new Exception("Invalid input enter string with length between 5 to 25 ");
		}
		
	
		
		else
		System.out.println(" Reversed String : \t"+reverseIt(input));
		System.out.println("------------------------------------------------\n");
		count++;
		repeat();
		}
		catch (InputMismatchException e) {
			
			System.out.println("Enter String Only "+ e);
		}
		
		catch (Exception e) {
						
			System.out.println("A problem occured "+ e);
		//	if (count==0)
				
			call(input);
	
		}
				
	}
	public static String reverseIt(String source) throws Exception  {
		
		while(true) {
	try {
		
		int lengthcheck=source.length();
		if(lengthcheck >5 && lengthcheck <25) {
			 int i, length = source.length();
			    StringBuilder dest = new StringBuilder(length);

			    for (i = (length - 1); i >= 0; i--) {
			        dest.append(source.charAt(i));
		}

			    return dest.toString();
		}
	
		
	}
	
		
	catch(InputMismatchException ime){
		 // sc.next();
        System.out.println("Your input is invalid, please try again"+ime.getMessage());
        //sc.next();

    }catch(Exception e) {
    	// sc.nextLine();
		System.out.println("wrong input"+e.getMessage());
	}

	
		}	
	   
	}
	

}
