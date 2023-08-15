import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Obj_Primitive {

    static public String[] StreamCase(String[] strArr) {
        String[] answer = {};
        Stream<String> stream=Stream.of(strArr);
        answer=stream.filter(i -> !i.contains("ad")).toArray(String[]::new);
        
        return answer;
    }

    // 프로그래머스 카피
    static String[] IntStreamCase(String[] strArr) {
        String[] answer = {};
        answer=IntStream.range(0,strArr.length)
            .mapToObj(i->strArr[i]).filter(i -> !i.contains("ad"))
            .toArray(String[]::new);
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        String[] strArr={"and","notad","abcd"};

        System.out.println(IntStreamCase(strArr));
        System.out.println(StreamCase(strArr));
    }
}
