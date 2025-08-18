
public class FindMin {
    public static void main(String[] args) {
        int[] arr= {1,34,54,67,-5,3};
        System.out.println(findMin(arr));

    }
    static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 0; i< arr.length; i++) {
            if(arr[i]< min) {
                min = arr[i];
            }
        }
        return min;

    }
}
