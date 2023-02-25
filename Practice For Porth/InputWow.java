import java.util.Scanner;

public class InputWow {

    public static void main(String[] args)
    
    {
    
    Scanner sc = new Scanner(System.in);
    
    String[] ss = new String[4];
    
    int[] ar = new int[4];
    
    for(int i=0;i<4;i++)
    
    {
    
    ss[i] =sc.next();
    
    ar[i]=Integer.parseInt(ss[i]);
    
    System.out.print(ss[i]+" ");
    
    }
    
    }
    
    }