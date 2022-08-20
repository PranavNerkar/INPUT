import java.io.* ;

class _05Input01 {
    public static void main(String [] args) throws IOException {

        InputStreamReader ISR = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(ISR) ;

        System.out.println("Enter String") ;

        String Input1 = br.readLine() ;
        String Input2 = br.readLine() ;
        System.out.println( Input1 + Input2 ) ;
    }
}