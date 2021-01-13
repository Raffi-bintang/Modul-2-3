
package inheritance;


public class main {

   
    public static void main(String[] args) {
        hewan hewan = new hewan(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof kucing));
        
        System.out.println("------------------------");
        
        kucing kucing = new kucing(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof kucing));
       
        System.out.println("------------------------");
         
        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");
        
        System.out.println("------------------------");
        
        kucing meow = new kucing("Ocicat", "tropis");
        kucing puss = new kucing("Ocicat", "subtropis");
        kucing popo = new kucing("Anggora", "subtropis");
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));
        
        System.out.println("------------------------");
         
        Object o = new kucing(); // kucing adalah Object
        hewan h = new kucing(); // kucing adalah Hewan
        kucing k = new kucing(); // kucing adalah Kucing, pastinya :)
        
        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();
        Object object = k; // bisa langsung diassign
        hewan hewanK= k; // bisa langsung diassign
        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewanK.makan();
        kucing kucingK = (kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();
        
        hewan harimau = new hewan();
        kucing anggora = (kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
    
    
}
