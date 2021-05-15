import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {

        // Filter function
        List<String> names = Arrays.asList("Aman","Mankit","Tanuj","Ajay");
        List<String> NameListA = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(NameListA);

        // Map function
        List<Integer> liInt = Arrays.asList(1,2,5,8,41);
        List<Integer> newDoubleList = liInt.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newDoubleList);

        // Foreach Method
        names.stream().forEach(e-> System.out.println(e));

        System.out.println("method referece");

        // Method Reference
        names.stream().forEach(System.out::println);

        //Sorted List
        System.out.println("Sorted List of numbers");
        liInt.stream().sorted().sorted().forEach(e-> System.out.println(e));
        //List liSorted = liInt.stream().collect(Collectors.toList());
        //System.out.println(liSorted);

        // minimum no
        System.out.println("minimum no");
        Integer minNum =  liInt.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(minNum);

        // maximum no
        System.out.println("minimum no");
        Integer maxNum =  liInt.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(maxNum);
    }

}
