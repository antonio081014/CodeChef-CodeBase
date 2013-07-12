/**
 * Problem code: HS08TEST
 * 
 * Solution: Ad-hoc.
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author antonio081014
 * @since Nov 21, 2011, 9:51:40 PM
 */
public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int withdraw = Integer.parseInt(strs[0]);
		double amount = Double.parseDouble(strs[1]);
		if (withdraw % 5 == 0 && (amount - withdraw) >= 0.50) {
			amount -= withdraw + 0.50;
		}
		System.out.println(String.format("%.2f", amount));
	}
}

