public class GnomeSort {
    public static <T extends Comparable<T>> void gnomeSort(T[] a) {
        int pos = 0;
        while (pos < a.length) {
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos++;
            } else {
                T temp = a[pos];
                a[pos] = a[pos - 1];
                a[pos - 1] = temp;
                pos--;
            }
        }
    }
}
