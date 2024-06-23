import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<CustomerWithId> customers = Arrays.asList(
                new CustomerWithId(1, "Ivan", "Ivanov"),
                new CustomerWithId(2, "Petro", "Petrov"),
                new CustomerWithId(3, "Sergiy", "Sergeev"),
                new CustomerWithId(4, "Andriy", "Andreev"),
                new CustomerWithId(5, "Oleg", "Olegov")
        );

        Map<Integer, Customer> customerMap = customers.stream()
                .collect(Collectors.toMap(CustomerWithId::getId, customer -> customer));

        System.out.println("Values in map:");
        customerMap.values().forEach(System.out::println);

        System.out.println("Keys in map:");
        customerMap.keySet().forEach(System.out::println);

        System.out.println("Keys and values in map:");
        customerMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
