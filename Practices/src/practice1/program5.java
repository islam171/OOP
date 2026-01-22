package practice1;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int balance = 10;
        System.out.printf("Your current balance: %s \n", balance);
        System.out.println("Enter inteset: ");
        int money = input.nextInt();
        balance += money;
        System.out.println(balance);
	}

}
