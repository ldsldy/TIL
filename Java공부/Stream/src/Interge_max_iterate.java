import java.util.stream.IntStream;


public class Interge_max_iterate {
    static int Integer_Case(int[] num_list) {
        return Integer.max(IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum(), IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum());
    }

    static int Array_Case(int[] num_list) {
        int answer = 0;
        int even_sum=0, odd_sum=0;
        
        for(int i=0;i<num_list.length;i++){
            if((i+1)%2==0){
                even_sum+=num_list[i];
            }
            else{
                odd_sum+=num_list[i];
            }
        }
        answer=Math.max(even_sum,odd_sum);
        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] num_list={4, 2, 6, 1, 7, 6};

        System.out.println(Integer_Case(num_list));
        System.out.println(Array_Case(num_list));
    }
}
