package Java.Module_25;

public class second {
    public static void main(String[] args){
        String str= "PWSKILLS";
        StringBuilder sb =new StringBuilder(str);

        sb.reverse();

        String revString= sb.toString();

        System.out.println("Reversed String:"+ revString);
    }
    
}
