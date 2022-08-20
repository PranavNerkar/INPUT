import java.io.* ;

class _10InputDataTypes {
    public static void main (String [] args) throws IOException {

        InputStreamReader ISR = new InputStreamReader(System.in) ;
        BufferedReader BR = new BufferedReader(ISR) ;

        int a = Integer.parseInt(BR.readLine()) ;

        float b = Float.parseFloat(BR.readLine()) ;

        double c = Double.parseDouble(BR.readLine()) ;

        System.out.println("A = " + a) ;
        System.out.println("B = " + b) ;
        System.out.println("C = " + c) ;
    }
}