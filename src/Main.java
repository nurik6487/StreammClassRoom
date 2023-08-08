import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("MARSEL");
        str.add("Bobur");
        str.add("Nursultan");
        str.add("Bayjigit");
        str.add("Ahror");
        str.stream().filter(x->x.length()>5).forEach(System.out::println);
    }
}