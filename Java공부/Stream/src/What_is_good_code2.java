import java.util.Arrays;



public class What_is_good_code2 {
        static int[][] solution(int[][] arr) {
            int max_len=Math.max(arr.length, arr[0].length);
            int[][] answer = new int[max_len][max_len];     //배열의 길이를 잡는 아이디어
            
            for(int i=0;i<arr.length;i++){
                answer[i]=Arrays.copyOf(arr[i],max_len);
            }
            
            return answer;
        }

    public static void main(String[] args) throws Exception {
        int[][] arr={{572,22,37},{287,726,384},{85,137,292},{487,13,876}};

        System.out.println(solution(arr));        
    
    }
}
