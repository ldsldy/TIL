import java.util.Arrays;
import java.util.stream.IntStream;


public class Stream_if_else {
        static int[] Array_Case(int[] arr) {
            int[] answer = new int[arr.length];
            for(int i=0 ; i<arr.length ; i++){
                if(arr[i]>=50&&arr[i]%2==0) answer[i]=arr[i]/2;
                else if(arr[i]<50&&arr[i]%2!=0) answer[i] = arr[i]*2;
                else answer[i] = arr[i];
            }
            return answer;
        }

        static int[] Stream_Case(int[] arr) {
        return IntStream.range(0,arr.length)
            .map(i->arr[i])
            .map(i->
            ((i>=50)&&(i%2==0)) ? i/2 : ((i<50)&&(i%2!=0)) ? i*2 : i
        ).toArray();
    }
    public static void main(String[] args) throws Exception {
        int[] arr={1, 2, 3, 100, 99, 98};

        System.out.println(Array_Case(arr));
        System.out.println(Stream_Case(arr));

    }
}
