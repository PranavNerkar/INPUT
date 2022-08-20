import java.io.* ;
class ArithmaticInput {
    public static void main(String [] args) throws IOException {

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)) ;
        
        System.out.println("Enter Two Numbers") ;
        int a = Integer.parseInt(br1.readLine()) ;

        String x = br1.readLine() ;

        int b = Integer.parseInt(x) ;
        System.out.println("A = "+ a) ;
        System.out.println("B = "+ b) ;

        // System.out.println("A + B = "+(a+b)) ;
        // System.out.println("A - B = "+(a-b)) ;
        // System.out.println("A / B = "+(a/b)) ;
        // System.out.println("A * B = "+(a*b)) ;
        // System.out.println("A % B = "+(a%b)) ;
    }
}