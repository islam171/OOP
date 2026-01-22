package practice1;
import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in);
	        String s = input.next();

	        String reversed = new StringBuilder(s).reverse().toString();

	        if(s.equals(reversed)) System.out.println("Palindrome");
	        else{
	            System.out.println("Not Palindrome");
	        }
	}

}
