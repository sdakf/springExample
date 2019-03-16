import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.String.valueOf;
import static java.util.Comparator.*;

public class TestOfTests {


    private List<String> strings =
            Arrays.asList("aaaaz", "aaaaac", "aab", "aac", "aaa", "aad", "aaa");


    @Test
    void sortByLastLetter() {
        strings.stream()
                .sorted((a, b) ->
                        valueOf(a.charAt(a.length() - 1))
                                .compareTo(valueOf(b.charAt(b.length() - 1))))
        .forEach(System.out::println);

        strings.stream()
                .sorted(comparing(a -> a.length() ))
                .forEach(System.out::println);

    }
}
