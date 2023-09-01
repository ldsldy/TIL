import java.util.List;
import java.util.ArrayList;



public class Programmers1 {
        //     소수임을 구하는 함수
    static boolean isPrimeNumber(int num){
        boolean is=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                is=false;
                break;
            }
        }
        return is;
    }
    
    static public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(isPrimeNumber(nums[i]+nums[j]+nums[k]))
                        answer++;
                }
            }
        }
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] nums={1,2,7,6,4};

        System.out.println(solution(nums));        
    
    }
}
