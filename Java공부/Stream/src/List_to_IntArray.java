import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class List_to_IntArray {
        static int[] my_Case(int[] arr) {
        List<Integer> list=new ArrayList<>();
        
        for(int a:arr){
            for(int i=0;i<a;i++){
                list.add(a);
            }
        }
        
        int[] answer=list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }

    static List<Integer> Stream_Case(int[] arr) {
        return Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());  //nCopies()
    }

    static int[] String_Case(int[] arr) {
        String answer = "";

        for(int i: arr) {
            answer += (String.valueOf(i)+",").repeat(i);
        }
        return Stream.of(answer.split(",")).mapToInt(Integer::parseInt).toArray(); 
    }

    public static void main(String[] args) throws Exception {
        int[] arr={5, 1, 4};

        System.out.println(my_Case(arr));        
        System.out.println(Stream_Case(arr));
        System.out.println(String_Case(arr));


    }
}
