import java.util.Arrays;


public class Stream_sorted {
        static int[] my_Case(int[] num_list) {
            int[] answer = new int[5];
            Arrays.sort(num_list);
            
            for(int i=0;i<5;i++){
                answer[i]=num_list[i];
            }
            return answer;
        }

        static int[] other_Case(int[] num_list) {
            return Arrays.stream(num_list)
                .sorted()
                .limit(5)
                .toArray();
        }

    public static void main(String[] args) throws Exception {
        int[] arr={12, 4, 15, 46, 38, 1, 14};

        System.out.println(my_Case(arr));        
        System.out.println(other_Case(arr));


    }
}
