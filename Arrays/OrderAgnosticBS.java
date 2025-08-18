
public class OrderAgnosticBS {

    public static void main(String[] args) {
        int [] arr = {1,34,56,87,89,564,767};
        int ans = orderAgnosticBS(arr, 564);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end) {

            int mid = start+(end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target<arr[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid + 1;
                }
            }else {
                if(target>arr[mid]) {
                    end = mid-1;
                }
                start = mid + 1;
            }

        }
        return -1;
    }

}
