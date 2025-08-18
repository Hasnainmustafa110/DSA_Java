
public class SearchInReverseArray {

    public static void main(String[] args) {

        int[] arr = {10,8,6,4,2,1};
        int ans = search(arr, 6);
        System.out.println(ans);

    }

    static int search(int [] arr,int target) {


        for(int i = arr.length-1; i>=0; i--) {
            if(target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

