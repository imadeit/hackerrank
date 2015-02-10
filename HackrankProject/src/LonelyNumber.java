import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 * 
 * @author Leon
 * 
 */
public class LonelyNumber {
    static int lonelyinteger(int[] a) {
        int size = a.length;
        boolean[] judge = new boolean[101];
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                judge[a[i]] = !judge[a[i]];
            }
            for (int j = 0; j < 101; j++) {
                if (judge[j]) {
                    return j;
                }
            }
        } else {
            return a[0];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
}