import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1; i*i<=n;i++){
            if (n%i==0) {
                count +=1;
            }
        }
        if (count==1) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        sc.close();
    }
}