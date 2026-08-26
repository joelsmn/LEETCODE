class Solution {
    public boolean isAnagram(String s, String t) {
        int len=s.length();
        int len1=t.length();

        if(len!=len1) return false;

        HashMap <Character,Integer> map = new HashMap<>();

        for(int i=0;i<len;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<len1;i++){
            char c=t.charAt(i);

            if(!map.containsKey(c)) return false;

            map.put(c,map.get(c)-1);

            if(map.get(c)<0) return false;
        }

        return true;
    }
}