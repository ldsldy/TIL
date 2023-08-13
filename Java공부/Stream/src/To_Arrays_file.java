import java.util.Arrays;


public class To_Arrays_file {
        static int solution(int[] arr) {
            int[] temp= new int[arr.length];
            int answer=0;
            
            while(!Arrays.equals(arr,temp)){
                // temp=arr; 주소에 의한 복사
                temp=Arrays.copyOf(arr,arr.length);
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>=50&&arr[i]%2==0)
                        arr[i]=arr[i]/2;
                    else if(arr[i]<50&&arr[i]%2!=0)
                        arr[i]=arr[i]*2+1;
                    else
                        continue;
                }
                answer++;
            }
            answer--;
            return answer;
        }

    public static void main(String[] args) throws Exception {
        int[] arr={1, 2, 3, 100, 99, 98};

        System.out.println(solution(arr));

    }
}
