import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * Solution: Using PriorityQueue to maintain the max first heap.
 */

/**
 * @author Antonio081014
 * @since Aug 2, 2013, 11:19:32 AM
 */
public class Main {

  public static void main(String[] args) {
		Main main = new Main();
		main.run();
		System.exit(0);
	}

	private void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			int T = Integer.valueOf(in.readLine());
			while (T-- > 0) {
				String[] s = in.readLine().split("\\s");
				int n = Integer.valueOf(s[0]);
				int m = Integer.valueOf(s[1]);

				Room[] rooms = new Room[n];
				int[] action = new int[m];
				long amount = 0;

				s = in.readLine().split("\\s");
				for (int i = 0; i < m; i++) {
					action[i] = Integer.valueOf(s[i]);
				}
				for (int i = 0; i < n; i++) {
					s = in.readLine().split("\\s");
					// int c = Integer.parseInt(s[0]);
					rooms[i] = new Room(i);
					for (int j = 1; j < s.length; j++) {
						rooms[i].volumns.add(-Integer.valueOf(s[j]));
					}
				}
				for (int i = 0; i < m; i++) {
					if (rooms[action[i]].volumns.size() > 0) {
						int max = -rooms[action[i]].volumns.poll();
						amount += max;
					}
				}
				System.out.println(amount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Room {
	public PriorityQueue<Integer> volumns;
	public int id;

	public Room(int id) {
		this.id = id;
		volumns = new PriorityQueue<Integer>();
	}
}
