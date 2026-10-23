public class L3492_Maximum_Containers_on_a_Ship {
    // Using Mathematical Constraints
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n * n, maxWeight / w);
    }
}
