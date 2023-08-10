import java.util.Arrays;
import java.util.stream.IntStream;


public class mapToObj_toArray {
    static String[] solution(String[] names) {
        String[] answer=IntStream.range(0,names.length)
            .filter(i->i%5==0).mapToObj(i->names[i]).toArray(String[]::new);
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        String[] names={"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        System.out.println(solution(names));
    }
}
