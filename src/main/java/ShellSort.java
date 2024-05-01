import java.util.List;

public class ShellSort {
    public static <T extends Comparable<T>> void shellSort(T[] a) {
        List<Integer> gaps = List.of(701, 301, 132, 57, 23, 10, 4, 1);
        int n = a.length;
        for (int gap : gaps) {
            for (int i = gap; i < n; i++) {
                T temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compareTo(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}
