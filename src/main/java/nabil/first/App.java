package nabil.first;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	pc mypc = new pc(8, 160 , "dell");
    	
    	
        System.out.println( "informations PC Model = " + mypc.getModel()+ " RAM = "+mypc.getRam() + " hard disk = "+mypc.getHd() );
        
       
    }
}
