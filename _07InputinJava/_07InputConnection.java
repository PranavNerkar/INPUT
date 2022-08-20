import java.io.* ;
class InputConnection {
    public static void main(String [] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)) ;
        
        //    br1.readLine() ;   IOException Forms Here
        System.out.println( br1.readLine() ) ;
        System.out.println( br1.readLine() ) ;

        br1.close() ;  // Exception in thread "main" java.io.IOException: Stream closed
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println( br2.readLine() ) ;
    }
}