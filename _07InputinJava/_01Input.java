import java.io.* ;

class _01Input {
    public static void main(String [] args) throws IOException {
        // InputStreamReader ISR = new InputStreamReader(System.in) ;   4 errors because
        // BufferedReader br = new BufferedReader(ISR) ;                in Inheritance
        InputStreamReader ISR = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(ISR) ;
        br.readLine() ;
        br.close() ;
        InputStreamReader ISR1 = new InputStreamReader(System.in) ;
        BufferedReader br1 = new BufferedReader(ISR1) ;
        System.out.println(br1.readLine()) ;
    }
}