import java.util.Scanner;
public class check_pali_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int tem = num;
        int num2 = 0;
        while (tem>0) {
            num2 = num2*10 + tem%10;
            tem /= 10;
        }
        if (num2==num){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}