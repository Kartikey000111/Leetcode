class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        for (int i = 0; i < arr.length;) {
            int j = i;
            while (j < arr.length && arr[j] == arr[i]) {
                j++;
            }

            int count = j - i;

            for (int k = 0; k < count / 2; k++)
                left.append(arr[i]);

            if (count % 2 == 1)
                mid.append(arr[i]);

            i = j;
        }

        return left.toString() + mid.toString()
                + left.reverse().toString();
    }
}