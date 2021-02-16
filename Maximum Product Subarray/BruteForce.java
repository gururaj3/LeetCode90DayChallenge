class Solution {
    public int maxProduct(int[] nums) {
        
        int ans = nums[0];
        for(int i=0; i<nums.length; i++){
            int product = nums[i];
            ans = Math.max(product, ans);
            for(int j=i+1; j<nums.length; j++){
                product *= nums[j];
                ans = Math.max(product, ans);
            }
        }
        return ans;
    }
}
