package Java.Module_25;

public class third {
    public static void main(String[] args) {
        
    
    String s1 ="Think Twice";
String s2 =" ";
String sarr[]=s1.split(" ");

for(String elem:sarr) {
    for(int i=elem.length()-1;i>=0;i--) 
    {
        s2=s2+elem.charAt(i);	
    }
s2= s2+" ";
}
{
    System.out.println(s2);
}

}

}
