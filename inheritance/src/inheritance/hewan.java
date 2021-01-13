
package inheritance;

public class hewan {
    public hewan() {
        System.out.println("construct Hewan");
    } 
     
    public void makan() {
        System.out.println("Hewan sedang makan..");
    }
      
    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}
