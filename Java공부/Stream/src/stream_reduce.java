import java.util.Arrays;


public class stream_reduce {
        static int Array_Case(int[] numbers, int n) {
            int answer = 0;
            
            for(int i=0; i<numbers.length;i++){
                if(answer<=n)
                    answer+=numbers[i];
                else
                    break;
            }
            return answer;
        }

        static int Stream_Case(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);
    }
    public static void main(String[] args) throws Exception {
        int[] numbers={34, 5, 71, 29, 100, 34};
        int n=123;

        System.out.println(Array_Case(numbers, n));
        System.out.println(Stream_Case(numbers, n));

    }
}
