import java.util.Arrays;


public class stream_reduce2 {
        static int solution(int[] num_list) {
            if(num_list.length>=11){
                return Arrays.stream(num_list).reduce(0,(a,b)->a+b);
            }
            else{
                return Arrays.stream(num_list).reduce(1,(a,b)->a*b);
            }
        }

    public static void main(String[] args) throws Exception {
        int[] num_list={3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        System.out.println(solution(num_list));

    }
}
