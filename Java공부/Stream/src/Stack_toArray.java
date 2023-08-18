import java.util.Stack;
import java.util.stream.IntStream;


public class Stack_toArray {
        static int[] my_solution(int[] arr) {
            Stack<Integer> stack=new Stack<>();
            
            IntStream.range(0,arr.length).forEach(i->{
                if(stack.empty()){
                    stack.push(arr[i]);
                }
                else if(stack.peek()==arr[i]){
                    stack.pop();
                }
                else{
                    stack.push(arr[i]);
                }
            });
            
            if(stack.isEmpty())                     // 줄일 수 있는 라인
                stack.push(-1);                     //
                                                    //
            int[] answer=new int[stack.size()];     //
            for(int i=stack.size()-1;i>=0;i--){     //
                answer[i]=stack.pop();              //
            }                                       //
            return answer;
        }
        
        static int[] solution(int[] arr) {

            Stack<Integer> stack = new Stack<>();
    
            for (int no : arr) {
                if (!stack.isEmpty() && no == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(no);
                }
            }
    
            return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();  // stream을 통해 가독성을 높인 라인
        }

    public static void main(String[] args) throws Exception {
        int[] arr={0, 1, 0, 1, 0};

        System.out.println(my_solution(arr));        
        System.out.println(solution(arr));


    }
}
