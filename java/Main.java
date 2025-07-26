import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);

      String a=s.nextLine();
      int l=a.length();


      char arr[]={'a','e','i','o','u'};
      int arrs=arr.length;

       boolean first=false;
       boolean last=false;

      for(int i=0;i<arrs;i++){
        char f=Character.toLowerCase(a.charAt(0));
        char la=Character.toLowerCase(a.charAt(l-1));
        
        if(Character.isAlphabetic(f)){
            System.out.println("TRye");
        }
        
        if(f==arr[i]) first=true;
        if(la==arr[i])last=true;

      }

      if(last && first)System.out.println("Yes");
    }
}

