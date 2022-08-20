import java.io.* ;

class _03Input {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        
        String Input1 = br.readLine() ;
        System.out.println( Input1 ) ;

        String Input2 = br.readLine() ;
        System.out.println( Input2 ) ;

        br.close() ;   
        br.readLine() ;     // BR <-- ISR <-- System.in Hi process Stop Hote
                            // Exception in thread "main" java.io.IOException: Stream closed
    }
}