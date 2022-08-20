import java.io.* ;

class _04Input {
    public static void main(String [] args) throws IOException {

        InputStreamReader ISR = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(ISR) ;
        
        String Input1 = br.readLine() ;
        System.out.println( Input1 ) ;

        String Input2 = br.readLine() ;
        System.out.println( Input2 ) ;

        ISR.close() ;   
        br.readLine() ;     // BR <-- ISR <-- System.in Hi process Stop Hote
                            // Exception in thread "main" java.io.IOException: Stream closed
    }
}