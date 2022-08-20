import java.io.* ;

class PlayerInfo {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;
        System.out.println("Enter Player Info :") ;
        
        int jerNo = Integer.parseInt(br.readLine()) ;
        char Grade = (char)br.read() ;  // Type mismatch: cannot convert from int to char
        br.skip(2);  // Argument is important (Next String Ji input mhanun ghetoy tyatil jo aapn parameter dila aahe tevdhe String madhle charavters Vanished Karta)
        String Name = br.readLine() ;
        double Avg = Double.parseDouble(br.readLine()) ;  // Why Gives AN Exception
        
        System.out.println("Jarsey No. = " + jerNo) ;
        System.out.println("Grade is = " + Grade) ;
        System.out.println("Name = " + Name) ;
        System.out.println("Average is = " + Avg) ;
    }
}