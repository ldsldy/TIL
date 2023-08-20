import java.util.Arrays;


public class To_Arrays_copy2 {
        static int[] solution(int[] arr) {
            int max_num=1;
            while(arr.length>max_num){
                max_num*=2;
            }
            int[] answer=Arrays.copyOf(arr,max_num);
            return answer;
        }

    public static void main(String[] args) throws Exception {
        int[] arr={1, 2, 3, 4, 5, 6};

        System.out.println(solution(arr));

    }
}
