import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamuntukFilterData {
    public static void main(String[] args) {
        List<Integer> angka = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> hasil = angka.stream()
            .filter(n -> n % 2 == 0) // Menggunakan filter untuk mengambil angka genap
            .collect(Collectors.toList()); // Mengumpulkan hasil ke dalam List

        System.out.println(hasil);
    }    
}
