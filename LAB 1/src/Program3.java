import java.util.Scanner;

public class Program3{
    public static void main(){
        Scanner input = new Scanner(System.in);
        int point = input.nextInt();
        String grade;
        if(point >= 94.5){
            grade = "A";
        }else if(point >= 89.5 && point <  94.5){
            grade = "A-";
        }else if(point >= 84.5 && point < 89.5){
            grade = "B+";
        }else if(point >= 79.5 && point < 84.5){
            grade = "B";
        }else if(point >= 74.5 && point < 79.5){
            grade = "B-";
        }else if(point >= 69.5 && point < 74.5){
            grade = "C+";
        }else if(point >= 64.5 && point < 69.5){
            grade = "C";
        }else if(point >= 59.5 && point < 64.5){
            grade = "C-";
        }else if(point >= 54.5 && point < 59.5){
            grade = "D+";
        }else if(point >= 49.5 && point < 54.5){
            grade = "D";
        }else{
            grade = "F";
        }

        System.out.printf("Grade is %s", grade);
    }
}