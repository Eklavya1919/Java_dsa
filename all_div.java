import java.util.ArrayList;
import java.util.Scanner;
public class all_div{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        ArrayList<Integer> divs = new ArrayList<>();
        for(int i=1;i*i<=num; i++){
            if (num%i==0){
                divs.add(i);
                if(i!=num/i){
                    divs.add(num/i);
                }
            }
        }
        System.out.println(divs);
        sc.close();
    }
}