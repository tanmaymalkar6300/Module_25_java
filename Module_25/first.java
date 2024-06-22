// Once we create a String, on that string if we try to perform any operation and those changes get reflected in the same object then such strings are called "Mutable Strings"
// Ex : Stringbuffer , StringBuilder

package Java.Module_25;

public class first {
    
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("Tanamy");
        System.out.println(s);
        s.append(" Malkar");
        System.out.println(s);

    }
}
