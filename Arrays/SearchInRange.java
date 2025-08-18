
public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {1,23,54,56,67,6,7878,56,45,65,45,34,35,3,4,334,34,54};
        int ans = linearSearch(num, 7878, 7, num.length);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr,int target,int start,int end) {
        if(arr.length == 0) {
            return -1;
        }

        for(int i = start; i<end;i++) {
            int element = arr[i];
            if(arr[i] == target) {
                System.out.print("The element is found at: "+ i);

            }
        }

        return -1;
    }
}
