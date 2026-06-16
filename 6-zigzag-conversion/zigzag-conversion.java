class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        // create rows
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentrow = 0;
        boolean down = true;

        // place characters
        for (int i = 0; i < s.length(); i++) {

            rows[currentrow].append(s.charAt(i));

            if (currentrow == 0)
                down = true;

            if (currentrow == numRows - 1)
                down = false;

            if (down)
                currentrow++;
            else
                currentrow--;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }

        return result.toString();
    }
}