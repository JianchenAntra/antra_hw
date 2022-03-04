import java.util.Arrays;
import java.util.PriorityQueue;

public class interview {
	
	public static int minRoom(int[][] intervals) {
		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
	
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int count = 0;
		for(int[] cur : intervals) {
			if(pq.isEmpty()) {
				count++;
				pq.offer(cur[1]);
			}else {
				if(cur[0] >= pq.peek()) {
					pq.poll();
			
				}else {
					count++;
				}
				pq.offer(cur[1]);
			}
		}
		
		return pq.size();
		
	}
	public static void main(String[] args) {
        int[][] test1 = new int[][] {{0,30},{5,10},{15,20}};
        int[][] test3 = new int[][] {{0,30},{5,16},{15,20}};
        int[][] test2 = new int[][] {{7,10},{2,4}};
        int t1 = minRoom(test1);
        int t2 = minRoom(test2);
        int t3 = minRoom(test3);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
