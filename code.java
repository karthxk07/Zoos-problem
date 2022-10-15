import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String z = scan.nextLine();
        int x = 0;
        int y = 0;      
        for (int i=0;i<z.length();i++){
            char ch = z.charAt(i);
            if (ch=='z'){
                x+=1;
            }else if(ch=='o'){
                y+=1;
            }
        }
        if ((2*x)==y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
