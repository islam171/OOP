package practice1;
import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        int a = input.nextInt();
	        int b = input.nextInt();
	        int c = input.nextInt();
	        float d = b*b - 4*a*c;

	        if(d < 0){
	            System.out.println("Error");
	        }else{
	            float x1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
	            float x2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
	            System.out.printf("x1 is %s, x2 is %s", x1, x2);
	        }

	}

}
