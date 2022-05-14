import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class NetworkDelay {
	public int networkDelayTime(int[][] times, int n, int k) {
		
		int timeTakenToRecieveSignalByAllNodes = 0;
		Map<Integer,List<int[]>> graph = new HashMap();
		for(int[] mapping:times) {
			graph.putIfAbsent(mapping[0], new ArrayList<int[]>());
			graph.get(mapping[0]).add(new int[] {mapping[1],mapping[2]});
		}

		PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>((a,b) -> (a[0]-b[0]));
		boolean visited[] = new boolean[n+1];
		int mininumDistance[] = new int[n+1];
		Arrays.fill(mininumDistance, Integer.MAX_VALUE);
		mininumDistance[k] = 0;
		priorityQueue.add(new int[] {0,k});
		while(!priorityQueue.isEmpty()) {
			int node[] = priorityQueue.poll();
			int currentDistance =  node[0];
			int currentNode =  node[1];
			if(visited[currentNode] == true)
				continue;
			visited[currentNode] = true;
			timeTakenToRecieveSignalByAllNodes = currentDistance;
			n--;
			if (!graph.containsKey(currentNode)) continue;
			for(int[] next: graph.get(currentNode)) {
				 if (!visited[next[0]] && currentDistance + next[1] < mininumDistance[next[0]])
					 priorityQueue.offer(new int[]{currentDistance + next[1], next[0]});
		        }
			}
		return n == 0 ? timeTakenToRecieveSignalByAllNodes : -1;
	}
	
	public static void main(String[] args) {
		int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
		System.out.println(new NetworkDelay().networkDelayTime(times, 4, 2));
	}
}
