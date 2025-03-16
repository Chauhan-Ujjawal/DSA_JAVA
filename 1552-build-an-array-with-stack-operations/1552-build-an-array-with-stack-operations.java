class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<>();
        int k=1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < target.length; i++) {
            set.add(target[i]);
        }
        while(k<=n){
            if(k>target[target.length-1]) break;
            if(set.contains(k)){
                list.add("Push");
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
            k++;
        }
        return list;  
    }
}