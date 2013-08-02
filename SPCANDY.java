import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Antonio081014
 * @since Aug 2, 2013, 10:52:08 AM
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
			int T = Integer.parseInt(in.readLine());
			while (T-- > 0) {
				String[] s = in.readLine().split("\\s");
				long N = Long.parseLong(s[0]);
				long K = Long.parseLong(s[1]);
				if (K == 0)
					System.out.println(String.format("%d  %d\n", 0, N));
				else
					System.out.println(String.format("%d  %d\n", N / K, N % K));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
