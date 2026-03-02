import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        int c=0;
        while(n>0){
            n=n/10;
            c+=1;
        }
        System.out.println(c);
    }
}
