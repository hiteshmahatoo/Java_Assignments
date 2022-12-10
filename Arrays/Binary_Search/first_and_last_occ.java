package Arrays.Binary_Search;

class occurence {
    int firstOcc(int[] a, int length, int key) {
        int ans = -1, start = 0, end = length - 1, mid;

        mid = start + (end - start) / 2;

        while (start <= end) {

            if (a[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (a[mid] > key) {
                end = mid - 1;
            } else if (a[mid] < key) {
                start = mid + 1;
            }
        }
        return ans;
    }
}

public class first_and_last_occ {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3, 3, 5, 5 };
        occurence o1 = new occurence();
        int first = o1.firstOcc(arr, 7, 3);
        System.out.println("First Occurence is at Index "+first);
        System.out.println();
    }
}
