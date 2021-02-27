class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        
        
        int prev = map.get(s.charAt(s.length() - 1));
        int ans = prev;
        for(int i=s.length() - 2; i>=0 ; i--){
            int curr = map.get(s.charAt(i));
            
            if(curr < prev){
                ans -= curr;   
            }
            else{
                ans += curr;
            }
            prev = curr;
        }
        return ans;
    }
}
