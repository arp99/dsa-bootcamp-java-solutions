// Count Items Matching a Rule
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int n = items.size();
        for(int i = 0;i<n;i++){
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                count++;
            }
            else if( ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                count++;
            }
            else if( ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                count++;
            }
        }
        return count;
    }
}
