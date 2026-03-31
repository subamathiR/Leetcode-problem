class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);

            if (!map.containsKey(ss)) {
                map.put(ss, new ArrayList<>());
            }
            map.get(ss).add(s);
        }

        res.addAll(map.values());
        return res;
    }
}