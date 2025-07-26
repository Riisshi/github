import java.util.*;
public class ex1 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String a=s.nextLine();
        int count=0;
       char arr[]={'a','e','i','o','u'};
        for(int i=0;i<a.length();i++){
            char f=Character.toLowerCase(a.charAt(i));
            if(f=='a'||f=='e'||f=='i'||f=='o'||f=='u'){
                count++;
            }
        
        }
        System.out.print(count);
    }
        
}
