import java.io.* ;
import java.util.* ;

class TokanDemo {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;

        String EmpDetails = br.readLine() ;

        StringTokenizer ST = new StringTokenizer( EmpDetails , ",") ; //Invalid character constant

        int Tokan1 = Integer.parseInt(ST.nextToken().trim()) ;
        String Tokan2 = ST.nextToken().trim() ;    // String : Thats Whay prints spaces
        Float Tokan3 = Float.parseFloat(ST.nextToken().trim()) ;   // Float : AutoCorrect

        System.out.println("EmpId = " + Tokan1) ;
        System.out.println("EmpName = " + Tokan2) ;
        System.out.println("EmpSalary = " + Tokan3) ;
    }
}