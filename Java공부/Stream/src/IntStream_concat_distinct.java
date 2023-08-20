import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStream_concat_distinct {
        static int[] my_Case(int[] arr, int k) {
            List<Integer> list=new ArrayList<>();
            list.add(arr[0]);
            
            for(int i=0;i<arr.length;i++){
                if(list.size()>=k)
                    break;
                if(!list.contains(arr[i]))
                    list.add(arr[i]);
            }
            
            if(list.size()<k){
                for(int i=list.size();i<k;i++)
                    list.add(-1);
            }
            
            int[] answer=list.stream().mapToInt(i->i).toArray();
            return answer;
        }

        static int[] other_Case(int[] arr, int k) {
            return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1))  //concat은 두개의 스트림을 하나로 합쳐준다. distinct()는 중복을 제거해준다.
                .limit(k).toArray();
        }
    public static void main(String[] args) throws Exception {
        int[] arr={0, 1, 1, 2, 2, 3};
        int k=3;
        System.out.println(my_Case(arr, k));        
        System.out.println(other_Case(arr, k));


    }
}
