import java.util.* ;  // Nahi Lihala Tar 2 Error Detect

class InputScanner {
	public static void main (String [] args) {

		Scanner SC = new Scanner (System.in) ;

		int x = SC.nextInt() ;
		String y = SC.next() ;
		float z = SC.nextFloat() ;
		char a = SC.next().charAt(0) ;  // First Letter Of Character

		System.out.println("X = "+ x) ;
		System.out.println("Y = "+ y) ;
		System.out.println("Z = "+ z) ;
		System.out.println("Character = "+a) ;
		SC.close() ;
	}
}