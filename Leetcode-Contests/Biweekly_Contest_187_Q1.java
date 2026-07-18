public class Biweekly_Contest_187_Q1 {
    public String rearrangeString(String s, char x, char y) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (i < j && arr[i] != x) i++;
            while (i < j && arr[j] != y) j--;
            if (i < j) {
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}