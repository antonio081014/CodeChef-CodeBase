/**
 * Problem code: ISLANDS
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author antonio081014
 * @since Nov 21, 2011, 11:08:02 PM
 */
public class Main {
	public static int N;
	public static int M;
	public static String[] layout;
	public static boolean[][] mark;
	public static final int[] dx = { 1, 0, -1, 0 };
	public static final int[] dy = { 0, 1, 0, -1 };

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		layout = br.readLine().split(" ");
		N = Integer.parseInt(layout[0]);
		M = Integer.parseInt(layout[1]);
		layout = new String[N];
		mark = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			layout[i] = br.readLine();
		}
		int pieces = 0;
		int mmax = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (layout[i].charAt(j) == 'x' && mark[i][j] == false) {
					pieces++;
					int tmp = solve(i, j);
					mmax = Math.max(mmax, tmp);
				}
			}
		}
		System.out.println(pieces + " " + mmax);
	}

	public static int solve(int x, int y) {
		if (mark[x][y] == true)
			return 0;
		int count = 1;
		mark[x][y] = true;
		for (int i = 0; i < dx.length; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && xx < N && yy >= 0 && yy < M)
				if (layout[xx].charAt(yy) == 'x')
					count += solve(xx, yy);
		}
		return count;
	}

}

