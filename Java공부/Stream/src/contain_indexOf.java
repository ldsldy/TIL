import java.util.Arrays;
import java.util.stream.IntStream;


public class contain_indexOf {
    static int solution(String myString, String pat) {
        int answer=-1;
        String myString_low=myString.toLowerCase();
        String pat_low=pat.toLowerCase();
        if(myString_low.contains(pat_low))
            answer=1;
        else
            answer=0;
        return answer;
    }

    public static void main(String[] args) throws Exception {
        String myString="AbCdEfg";        
        String pat="aBc";


        System.out.println(solution(myString, pat));
    }
}


// 문자열 일치 확인
// toLowerCase, toUpperCase  <=문자열 자체를 변환하는게 아닌 반환하는 것이다.(변수에 저장해야 함.)
// equalsIgnoreCase

// 문자열 포함 확인
// indexOf, contain, matches
// StringUtils.contains(str, "C#") <= 대소문자를 무시