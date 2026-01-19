import java.util.Scanner;

class Program5 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        String s = input.next();

        boolean ok = true;
        for(int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                ok = false;
                break;
            }
        }
        if(ok) System.out.println("Palindrome");
        else{
            System.out.println("Not Palindrome");
        }
    }
}