
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,10};
        int[] ans = search(arr, 8);

        System.out.println("The first element is: " + ans[0] + " And the last element: "+ans[1]);
    }

    static int[] search(int[] arr,int target) {
        int first = findFirst( arr, target);
        int last = findLast(arr,target);
        return new int[] {first,last};
    }

    static int findFirst(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end) {
            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                result = mid;
                end = mid -1;   // search left side
            }else if(target>arr[mid]) {
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return result;
    }

    static int findLast(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end) {
            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                result = mid;
                start = mid + 1;   // search right side
            }else if(target>arr[mid]) {
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return result;
    }
}
