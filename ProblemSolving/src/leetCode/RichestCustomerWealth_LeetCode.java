package leetCode;

public class RichestCustomerWealth_LeetCode {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0 ;
        for(int[] customers: accounts){
            int customerWealth = 0;
            for(int account: customers){
                customerWealth += account;
            }
            if(maxWealth<customerWealth){
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }
}
