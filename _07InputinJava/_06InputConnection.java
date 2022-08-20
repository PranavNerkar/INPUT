import java.io.* ;
class Connection {
    public static void main(String [] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)) ;
        
        //    br1.readLine() ;   IOException Forms Here
        System.out.println( br1.readLine() ) ;
        System.out.println( br1.readLine() ) ;

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println( br2.readLine() ) ;
    }
}