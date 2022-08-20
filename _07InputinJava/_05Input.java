import java.io.* ;
class _05Input {
    public static void main(String [] args) throws IOException {

        InputStreamReader ISR = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(ISR) ;

        System.out.println("Enter Numbers") ;

        // int Input = br.readLine() ;    Can't convert String to Int

        int Input1 = Integer.parseInt(br.readLine()) ;
        int Input2 = Integer.parseInt(br.readLine()) ;
        System.out.println( Input1 + Input2 ) ;
    }
}