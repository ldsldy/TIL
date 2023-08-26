import java.util.Arrays;


public class replaceAll_example {
        static String solution(String myString) {
            String answer = myString.replaceAll("[a-k]","l");
            return answer;
        }

    public static void main(String[] args) throws Exception {
        String myString="jjnnllkkmm";

        System.out.println(solution(myString));

    }
}

// replace와 달리 replaceAll은 정규식을 사용한다.