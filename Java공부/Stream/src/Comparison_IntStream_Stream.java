import java.util.Arrays;
import java.util.stream.IntStream;

public class Comparison_IntStream_Stream {

    static public int[] IntStream_Case(int[] num_list, int n) {
        
        return IntStream.range(0,n)
                .map(i->num_list[i]).toArray();
    }

    // 프로그래머스 카피
    static int[] Stream_Case(int[] num_list, int n) {
        return Arrays.stream(num_list).limit(n).toArray();
    }

    static int[] Array_Case(int[] num_list, int n) {
        int[] answer={};
        answer=Arrays.copyOfRange(num_list,0,n);
        
        return answer;
    }
    public static void main(String[] args) throws Exception {
        int[] num_list={5,2,1,7,5};
        int n=3;

        System.out.println(IntStream_Case(num_list, n));
        System.out.println(Stream_Case(num_list, n));
        System.out.println(Array_Case(num_list, n));
    }
}
