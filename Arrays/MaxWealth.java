
public class MaxWealth {
    public static void main(String[] args) {
        int[][] ar = {{12,4,2},
                {32,4,2},
                {3,23,12}};
        int ans = maximumWealth(ar);
        System.out.println(ans);
    }
    static	public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int person = 0; person<accounts.length; person++) {
            int sum = 0;

            for(int account = 0; account<accounts[person].length;account++) {
                sum += accounts[person][account];
            }
            if(sum>max) {
                max = sum;
            }

        }



        return max;

    }
}
