import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while( t-- > 0 ) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println( Math.max( x, y) );
        }
    }
}
