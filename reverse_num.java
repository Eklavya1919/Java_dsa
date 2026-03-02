import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        int rn = 0;
        while (n>0) {
            rn = rn*10 + n%10;
            n/=10;
        }
        System.out.println(rn);
    }    
}
