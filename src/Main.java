import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float inc = 0;
        float sum = 0;
        System.out.println("Number: ");
        float num = in.nextInt();
        while(num != 0){
            System.out.println("Number: ");
            sum += num;
            inc++;
            num = in.nextInt();
        }
        float avg = sum / inc;
        System.out.println("Average: " + avg);
    }
}