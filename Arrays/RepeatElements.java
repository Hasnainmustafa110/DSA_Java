
public class RepeatElements {


    public static void main(String[] args) {
        int[] ar = {2,1,2,2,56,677,5,4};
        int ans = search(ar);
        if(ans!=-1) {
            System.out.println("First repeating element is: " + ar[ans] + " at index " + ans);
        }else {
            System.out.println("No repeating element");
        }
    }

    static int search(int[] arr) {

        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {

                if(arr[i] == arr[j]) {
                    return j;

                }

            }
        }
        return -1;




    }
}
