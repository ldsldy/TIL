import java.util.ArrayList;
import java.util.List;


public class Int_Ver_Integer {
        static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list=new ArrayList<>();
        for(Integer i:arr){
            list.add(i);
        }
        
        
        for(Integer d:delete_list){
            list.remove(Integer.valueOf(d));
            // if(list.contains(d)){
            //     System.out.println(d);
            //     list.removeIf(i->i==d);    what is removeIf 왜 실패했는가?
            // }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] arr={293, 1000, 395, 678, 94};
        int[] delete_list={94, 777, 104, 1000, 1, 12};

        System.out.println(solution(arr, delete_list));

    }
}
