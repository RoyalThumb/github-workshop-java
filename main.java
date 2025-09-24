import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num = (int) (Math.random()*10)+1;
        System.out.println("Number 1-10");
        int response=input.nextInt();
        while (response!=num) {
            System.out.println("Try Again (Number 1-10)");
            response=input.nextInt();
        }
        input.close();
        System.out.println("YIPPEE");
    }
}