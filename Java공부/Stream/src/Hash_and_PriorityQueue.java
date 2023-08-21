import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;


public class Hash_and_PriorityQueue {
        static int my_Case_Hash(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map=new HashMap<>(rank.length);
//      true만 해쉬맵에 저장 key:rank, value:인덱스의 값
        for(int i=0;i<rank.length;i++){
            if(attendance[i]==true)
                map.put(rank[i],i);
        }
//         Set형태로 key를 리스트로 만들어 key를 기준으로 소팅하기
        List<Integer> keySet=new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        
        int first_index=map.get(keySet.get(0));
        int second_index=map.get(keySet.get(1));
        int third_index=map.get(keySet.get(2));
        int answer=first_index*10000+second_index*100+third_index;
        return answer;
    }

    static int other_Case_priority(int[] rank, boolean[] attendance) {
//      rank[a] - rank[b]=>앞이 크면 양수, 작으면 음수=>랭크값을 기준으로 오름차순 정리
        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }

        return que.poll() * 10000 + que.poll() * 100 + que.poll();
    }
    public static void main(String[] args) throws Exception {
        int[] rank={3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance={false, true, true, true, true, false, false};

        System.out.println(my_Case_Hash(rank, attendance));
        System.out.println(other_Case_priority(rank, attendance));

    }
}
