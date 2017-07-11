package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "devang", "hibernet", "J2EE");

        String filter = "devang";
        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !filter.equals(line))     	// remove filter word
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);              

    }

}
