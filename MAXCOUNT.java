import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Easy dictionary problem.
 */

/**
 * @author antonio081014
 * @since Feb 2, 2012, 2:19:42 PM
 */
public class MAXCOUNT {

    public static HashMap<String, Integer> map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            map = new HashMap<String, Integer>();
            String str = "";
            map.put(str, -1);
            String[] strs = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                if (map.get(strs[i]) == null) {
                    map.put(strs[i], 1);
                }
                else {
                    map.put(strs[i], 1 + map.get(strs[i]));
                }
                if (map.get(strs[i]) > map.get(str)) {
                    str = strs[i];
                }
                else if (map.get(strs[i]) == map.get(str)) {
                    str = Integer.parseInt(strs[i]) < Integer.parseInt(str) ? strs[i]
                            : str;
                }
            }
            System.out.println(str + " " + map.get(str));
        }
    }
}

