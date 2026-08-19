import java.util.*;
public class L1386_Cinema_Seat_Allocation {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, boolean[]> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            if (!map.containsKey(row)) {
                map.put(row, new boolean[11]);
            }
            map.get(row)[col] = true;
        }
        int ans = (n - map.size()) * 2;
        for (boolean[] seats : map.values()) {
            boolean left = true;
            boolean middle = true;
            boolean right = true;
            for (int i = 2; i <= 5; i++) {
                if (seats[i]) {
                    left = false;
                    break;
                }
            }
            for (int i = 4; i <= 7; i++) {
                if (seats[i]) {
                    middle = false;
                    break;
                }
            }
            for (int i = 6; i <= 9; i++) {
                if (seats[i]) {
                    right = false;
                    break;
                }
            }
            if (left && right) {
                ans += 2;
            } else if (left || middle || right) {
                ans++;
            }
        }
        return ans;
    }
}