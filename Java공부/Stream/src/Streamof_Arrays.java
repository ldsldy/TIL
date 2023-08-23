import java.util.Arrays;


public class Streamof_Arrays {
        static int solution(int[] num_list, int n) {
        int answer = 0;
        if(Arrays.stream(num_list).anyMatch(i->i==n)){
            answer=1;
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] arr={1, 2, 3, 4, 5};
        int n=3;

        System.out.println(solution(arr, n));

    }
}


// Arrays.stream(num_list).anyMatch(i->i==n)는 가능한데 Stream.of(num_list).anyMatch(i->i==n)는 오류가 나는 이유

// 답=>Stream.of는 요소를 Object 타입으로 변환한다. ==는 원시형을 인수로 받기에 오류가 난다.
// 수정=> Object는 i->i.equals(n)을 통해서 객체를 비교한다.