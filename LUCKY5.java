import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author antonio081014
 * @since Feb 2, 2012, 6:56:00 PM
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String strLine = br.readLine();
            int count = 0;
            for (int i = 0; i < strLine.length(); i++) {
                if (strLine.charAt(i) != '4' && strLine.charAt(i) != '7') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}

