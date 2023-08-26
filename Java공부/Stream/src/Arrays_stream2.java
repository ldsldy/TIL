import java.util.Arrays;


public class Arrays_stream2 {
        static int solution(String[] order) {
            int answer = 0;
            answer=Arrays.stream(order)
                .mapToInt(s->{
                    if(s.contains("americano"))
                      return 4500;
                    else if(s.contains("cafelatte"))
                        return 5000;
                    else
                        return 4500;
                })
                .sum();
            return answer;
        }

    public static void main(String[] args) throws Exception {
        String[] order={"cafelatte", "americanoice", "hotcafelatte", "anything"};

        System.out.println(solution(order));

    }
}
