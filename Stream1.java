import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> angka = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long jumlahGenap = angka.stream()
            .filter(n -> n % 2 == 0)
            .count();

        System.out.println("Jumlah angka genap: " + jumlahGenap);
    }
}
