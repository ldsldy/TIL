import java.util.Arrays;
import java.util.stream.Stream;

public class Comparison_Stream_Array {

    static int[] stream_Case(int[] num_list, int n) {
        Stream<Integer> stream=Arrays.stream(num_list).boxed();
        int[] answer=
            stream.skip(n-1).mapToInt(Integer::intValue).toArray();
        
        return answer;
    }

    static int[] Array_Case(int[] num_list, int n) {
        int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
        return a;
    }
    public static void main(String[] args) throws Exception {
        int[] num_list={5,2,1,7,5};
        int n=3;

        System.out.println(stream_Case(num_list, n));
        System.out.println(Array_Case(num_list, n));
    }
}
