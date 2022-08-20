
import java.io.* ;

public class _08InputConnection {
    public static void main(String [] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)) ;
        
        //    br1.readLine() ;   IOException Forms Here
        System.out.println( br1.readLine() ) ;
        System.out.println( br1.readLine() ) ;
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)) ;

        br1.close() ;  // Exception in thread "main" java.io.IOException: Stream closed
        
        System.out.println( br2.readLine() ) ;
    }
}