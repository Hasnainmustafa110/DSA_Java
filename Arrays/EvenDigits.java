class EvenDigits{
    public static void main(String[] args) {

        int[] arr = {23,44,54,56,8,8,9,5,6};
        int ans = findNumbers(arr);
        System.out.println(ans);

    }

    static int findNumbers(int [] arr) {
        int count = 0;
        for(int element:arr) {
            if(isEven(element)) {
                count++;
            }
        }
        return count;
    }

    static int countDigits(int num) {
        int count = 0;
        if(num<0) {
            num = num * -1;
        }
        if(num == 0) {
            return 1;
        }
        while(num>0) {
            count++;
            num/=10;
        }
        return count;
    }

    static boolean isEven(int num) {
        int digits = countDigits(num);

        return digits % 2 == 0;

    }

}
