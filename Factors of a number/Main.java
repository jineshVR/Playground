import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num= in.nextInt();
      int factor = 0;
      for (factor = 1; factor <= num; factor++)
      {
        if( num % factor == 0)
          System.out.println(factor);
      }
	}
}