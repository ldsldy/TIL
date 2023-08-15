import java.util.stream.Stream;

public class Regular_Expression {

    static String[] ArrayCase(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }

    // 프로그래머스 카피
    static String[] StreamCase(String my_string) {
        return Stream.of(my_string.split(" ")).filter(str -> str.length()>0).toArray(String[]::new);
    }

    public static void main(String[] args) throws Exception {
        String my_string=" i    love  you";

        System.out.println(ArrayCase(my_string));
        System.out.println(StreamCase(my_string));
    }
}
