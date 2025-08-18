

//ONLY WORKS ON SORTED ARRAY
public class BinarySearch {

    public static void main(String[] args) {

        int arr [] = {-10,-5,-1,2,4,6,8,9,12,34,45,65,78};
        int ans = binarySearch(arr, 234);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length -1;

        while(start<=end) {

            int mid = start +(end - start) / 2;

            if(target<arr[mid]) {

                end = mid -1;

            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

}
