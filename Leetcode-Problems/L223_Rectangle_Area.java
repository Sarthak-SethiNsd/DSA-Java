public class L223_Rectangle_Area {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        if (ax2 <= bx1 || bx2 <= ax1 || ay2 <= by1 || by2 <= ay1) {
            return area1 + area2;
        }
        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int bottom = Math.max(ay1, by1);
        int top = Math.min(ay2, by2);
        int overlapArea = (right - left) * (top - bottom);
        return area1 + area2 - overlapArea;
    }
}