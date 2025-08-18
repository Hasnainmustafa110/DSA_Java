
public class FindIndexes {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,7,8,0,5};
        int ans = search(arr, 5);
        if(ans == -1) {
            System.out.println("The target is not found");
        }else {
            System.out.println("The target found "+ans+" 	times");
        }
    }

    static int search(int[] arr, int target) {

        int count = 0;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("The target is found at index: "+i);
                count++;
            }



        }

        if(count == 0) {
            return -1;
        }else {
            return count;
        }




    }
}
