import java.util.ArrayList;

class largestele {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(1);
        nums.add(3);

        int max = nums.get(0);

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max){
                max = nums.get(i);
            }
        }

        System.out.println("Largest element = " + max);
    }
}