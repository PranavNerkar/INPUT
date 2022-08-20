import java.io.* ;
import java.util.* ;

class Token {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;

        String EmpDetails = br.readLine() ;

        StringTokenizer ST = new StringTokenizer( EmpDetails , ",") ; //Invalid character constant

        String Tokan1 = ST.nextToken() ;     // String : Thats Whay prints spaces
        String Tokan2 = ST.nextToken() ;     // String : Thats Whay prints spaces
        String Tokan3 = ST.nextToken() ;     // String : Thats Whay prints spaces

        System.out.println("EmpId = " + Tokan1) ;
        System.out.println("EmpName = " + Tokan2) ;
        System.out.println("EmpSalary = " + Tokan3) ;
    }
}