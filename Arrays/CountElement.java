public class CountElement{
    public static void main(String[] args) {
        int[] arr = {1,3,5,33,5,23};
        int ans = Search(arr, 5);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == target) {
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