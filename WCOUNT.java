import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * 
 */

/**
 * @author antonio081014
 * @since Feb 2, 2012, 7:14:21 PM
 */
public class Main {

    public static HashMap<Character, Integer> map;
    public static final long                  MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String strLine = br.readLine();
            int N = strLine.length();
            map = new HashMap<Character, Integer>();
            for (int i = 0; i < N; i++) {
                if (map.get(strLine.charAt(i)) == null) {
                    map.put(strLine.charAt(i), 1);
                }
                else
                    map.put(strLine.charAt(i), map.get(strLine.charAt(i)) + 1);
            }
            long ret = 1L;
            Iterator<Character> it = map.keySet().iterator();
            while (it.hasNext()) {
                long tmp = (long) map.get(it.next());
                ret *= combin(N, tmp);
                N -= tmp;
                ret %= MOD;
            }
            System.out.println(ret);
        }
    }

    public static long combin(long N, long a) {
        BigInteger ret = new BigInteger("1");

        for (long i = 0; i < a; i++) {
            ret = ret.multiply(new BigInteger(Long.toString(N - i)));
            ret = ret.divide(new BigInteger(Long.toString(i + 1)));
        }
        ret = ret.mod(new BigInteger(Long.toString(MOD)));
        return ret.longValue();
    }
}

