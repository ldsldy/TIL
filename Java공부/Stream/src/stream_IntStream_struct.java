import java.util.Arrays;
import java.util.stream.IntStream;


public class stream_IntStream_struct {
        static int[] Array_Case(int[] arr, int[][] queries) {
            for(int i=0;i<queries.length;i++){
                for(int j=queries[i][0];j<=queries[i][1];j++)
                    arr[j]++;
            }
            return arr;
        }

        static int[] Stream_Case(int[] arr, int[][] queries) {
            Arrays.stream(queries).forEach(query ->
                    IntStream.rangeClosed(query[0], query[1]).forEach(i -> arr[i] += 1));
            return arr;
        }
    public static void main(String[] args) throws Exception {
        int[] arr={0, 1, 2, 3, 4};
        int[][] queries={{0,1},{1,2},{2,3}};

        System.out.println(Array_Case(arr, queries));
        System.out.println(Stream_Case(arr, queries));

    }
}
