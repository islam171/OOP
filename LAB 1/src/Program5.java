import java.util.Scanner;

class Program5 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        String s = input.next();

        String reversed = new StringBuilder(s).reverse().toString();

        if(s.equals(reversed)) System.out.println("Palindrome");
        else{
            System.out.println("Not Palindrome");
        }
    }
}