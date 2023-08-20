import java.util.Arrays;
import java.util.stream.IntStream;

public class Integer_compare {
        static int my_solution(int[] arr1, int[] arr2) {
            int answer = 0;
            
            if(arr1.length>arr2.length)
                answer=1;
            else if(arr1.length<arr2.length)
                answer=-1;
            
            else{
                int sum1=Arrays.stream(arr1).sum(),
                    sum2=Arrays.stream(arr2).sum();
                if(sum1>sum2)
                    answer=1;
                else if(sum1<sum2)
                    answer=-1;
                else
                    answer=0;
            }
                
            return answer;
        }

        static int other_solution(int[] arr1, int[] arr2) {
            int answer = Integer.compare(arr1.length, arr2.length);
    
            if(answer == 0) {
                int sum1=Arrays.stream(arr1).sum(),
                    sum2=Arrays.stream(arr2).sum();
                answer = Integer.compare(sum1, sum2);
            }
    
            return answer;
        }
    public static void main(String[] args) throws Exception {
        // int[] arr={1, 2, 3, 100, 99, 98};

        System.out.println(solution(arr));

    }
}
