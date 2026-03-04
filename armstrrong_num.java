import java.util.Scanner;

public class armstrrong_num {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int sum = 0;
        int tem=num;
        while (tem>0){
            sum += Math.pow((tem%10),3);
            tem /= 10;
        }
        sc.close();   
        System.out.println(sum==num);
    }
}