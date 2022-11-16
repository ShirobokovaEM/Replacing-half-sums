
package javaapplication49;
import java.util.Arrays;

public class JavaApplication49 {
   
    public static void main(String[] args) {
        
        double[] m = {1,2,8,4,5,6};
        zamenanaPolusum(m);
        System.out.println(Arrays.toString(m));
    }

    private static void zamenanaPolusum(double[] m) {
        double prev = m[0], curr;        
        for (int i = 1; i < m.length - 1; i++) {
            curr = m[i];
            m[i] = (prev + m[i + 1])/2;
            prev = curr;            
        }
        
    }
    
}
