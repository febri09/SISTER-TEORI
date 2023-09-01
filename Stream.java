import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> nama = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> namaUpper = nama.stream()
            .map(n -> n.toUpperCase()) // Menggunakan map untuk mengubah semua huruf menjadi uppercase
            .collect(Collectors.toList());

        System.out.println(namaUpper);
    }
}
