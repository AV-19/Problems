import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String s = in.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    count++;
                } else {
                    if (count >= 4) {
                        break;
                    } else {
                        count = 0;
                    }
                }
                // }
            }
            // System.out.println(count);
            if (count < 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
