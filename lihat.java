//variable pada interface merupakan variable statik
//interface tidak dapat di instansiasikan
package pkginterface;

/**
 *
 * @author ADe25
 */
interface Interface{

   String nama = "Aprilia Dewi";
   
}
    
public class lihat implements Interface{
    public String getNama(){
        return nama ="Dewi";
    }
   public static void main (String[] args){
   Interface i = new Interface();
   } 
}
