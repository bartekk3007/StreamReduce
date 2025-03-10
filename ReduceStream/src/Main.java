import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> values = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> sum1 = values.stream().reduce((x, y) -> x + y);
        Optional<Integer> sum2 = values.stream().reduce(Integer::sum);
        Integer sum3 = values.stream().mapToInt(Integer::intValue).sum();
        Integer sum4 = values.stream().reduce(10, Integer::sum);
        Integer sum5 = values.stream().parallel().reduce(10, Integer::sum);

        System.out.println(sum1.orElse(0));
        System.out.println(sum2.orElse(0));
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
    }
}