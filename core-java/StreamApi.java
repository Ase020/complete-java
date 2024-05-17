import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(4,5,6,8,7,9);
        int sum = 0;
        for (int n: numbers){
            if (n%2 == 0) {
                n = n*2;
                sum += n;
            }
        }
        Stream<Integer> s1 = numbers.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n-> n*2);
        int result = s3.reduce(0, (c,e)-> c+e);

        int result2 = numbers.stream().filter(n-> n%2 ==0).map(n->n*2).reduce(0,(c,e)-> c+e);



//      s3.forEach(n -> System.out.println(n));
        System.out.println(result2);
    }
}
