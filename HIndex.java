public class HIndex {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[] { 3, 0, 6, 1, 5 })); // 3
        System.out.println(hIndex(new int[] { 1, 3, 1 })); // 1
    }

    public static int hIndex(int[] citations) {
        if (citations == null || citations.length == 0)
            return 0;
        int n = citations.length;
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int index = citations[i];
            if (index > n) {
                index = n;
            }
            arr[index]++;
        }
        int sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += arr[i];
            if (sum >= i) {
                return i;
            }
        }
        return 1231;
    }

}