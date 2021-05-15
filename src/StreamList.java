
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamList {
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(8,7,1,21,4,45,6);
        List<Integer> lieven = new ArrayList<Integer>();

        System.out.println("Complete List");

        for(Integer i : li1)
        {
            System.out.println(i);
        }

        for(Integer i : li1)
        {
            if(i%2==0)
            {
              lieven.add(i);
            }
        }

        System.out.println("Even number List");

        for(Integer i : lieven)
        {
            System.out.println(i);
        }

        //using stream
        //Stream<Integer> stream = li1.stream();
        //List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("New Even List");
        System.out.println(li1.stream().filter(i->i%2==0).collect(Collectors.toList()));

        // filter
        System.out.println("no greater than 10");
        System.out.println(li1.stream().filter(i->i>10).collect(Collectors.toList()));

    }

}
