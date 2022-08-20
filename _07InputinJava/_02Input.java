import java.io.* ;

class _02Input {
    public static void main(String [] args) throws IOException {

        InputStreamReader ISR = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(ISR) ;
        
        String Input = br.readLine() ;
        System.out.println( Input ) ;
    }
}