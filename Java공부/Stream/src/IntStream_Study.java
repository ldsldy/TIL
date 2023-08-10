import java.util.stream.IntStream;


public class IntStream_Study {
    static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer=
            IntStream.range(0,finished.length).filter(i->finished[i]==false)
            .mapToObj(i->todo_list[i]).toArray(String[]::new);
        return answer;
    }

    public static void main(String[] args) throws Exception {
        String[] todo_list={"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished={true, false, true, false};

        System.out.println(solution(todo_list, finished));
    }
}
