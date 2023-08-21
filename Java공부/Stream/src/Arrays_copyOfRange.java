import java.util.Arrays;


public class Arrays_copyOfRange {
        static int[] my_Case(int[] num_list) {
            int[] answer=Arrays.stream(num_list).sorted().skip(5).toArray();
            return answer;
        }

        static int[] other_Case(int[] num_list) {
            int[] answer = {};
            Arrays.sort(num_list);
            answer = Arrays.copyOfRange(num_list,5,num_list.length);
            return answer;
        }
    public static void main(String[] args) throws Exception {
        int[] arr={12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        System.out.println(my_Case(arr));        
        System.out.println(other_Case(arr));


    }
}
