
public class OccuranceUsingBS {

    public static void main(String[] args) {
        int [] arr = {3,5,7,9,11,15,15,15,20,25,30};
        int target = 15;
        int ans = occuranceBS(arr, target);

        System.out.println("The Target " + target + " Appears " + ans + " times");

    }
    static int occuranceBS(int [] arr, int target)
    {
        int first = findFirst(arr,target);
        if(first == -1) {
            return 0;
        }
        int last = findLast(arr,target);

        return last-first+1;
    }

    static int findFirst(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end) {

            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                result = mid;
                end = mid -1;
            }else if(target>arr[mid]) {
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return result;
    }

    static int findLast(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end) {

            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                result = mid;
                start = mid + 1;
            }else if(target>arr[mid]) {
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return result;
    }

}
