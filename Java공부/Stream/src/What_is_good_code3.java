import java.util.Arrays;



public class What_is_good_code3 {
        static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                answer+=i;
            }
        }
        answer+=n;
        return answer;
    }

    public static void main(String[] args) throws Exception {
        int n = 12;

        System.out.println(solution(n));        
    
    }
}
