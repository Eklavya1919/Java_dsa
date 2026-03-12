import java.util.Scanner;

public class gcd_hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = num1 *num2;
        while(num2 != 0){
            int tem = num1;
            num1 = num2;
            num2 = tem % num2;
        }
        System.out.println("gcd is " + num1);
        System.out.println("lcm is " + product/num1);
        sc.close();
    }
}

