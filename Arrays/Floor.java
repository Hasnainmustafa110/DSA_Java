
public class Floor {
    public static void main(String[] args) {

    }
    //Floor of a number in a sorted array:
    //The largest number in the array <= to the target.


    static int binarySearch(int [] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];



        while(start<=end) {

            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid +1;

                }
            }
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid+1;
                }
            }


        }
        return end;



    }
}
