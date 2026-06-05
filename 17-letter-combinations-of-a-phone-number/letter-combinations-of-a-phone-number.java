class Solution {

    String[] a = {
        "", "",
        "abc", "def", "ghi",
        "jkl", "mno", "pqrs",
        "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if (digits.length() == 0) {
            return list;
        }

        backtrack(digits, new StringBuilder(), list);

        return list;
    }

    void backtrack(String digits,
                   StringBuilder res,
                   List<String> list) {

        if (digits.length() == 0) {
            list.add(res.toString());
            return;
        }

        char cc = digits.charAt(0);

        String ros = digits.substring(1);

        String ps = a[cc - '0'];

        for (char c : ps.toCharArray()) {

            res.append(c);

            backtrack(ros, res, list);

            res.deleteCharAt(res.length() - 1);
        }
    }
}