package chapt01;


import java.io.*;


public class Hello
{

    public static void main(String[] args){
        String Passvd = "user";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
           /* System.out.println("Enter pass");*/

            String userPasss = br.readLine();
            if (Passvd.equals(userPasss) ) System.out.println("Pass equals");
            else System.out.println("Pass dont equals");
        }
        catch (IOException e){
            System.err.println("Error input" + e.toString());
        }


 /*S
        for (String str: args)
        System.out.printf("Args = %s", str);
       ystem.out.println("Hello World teatcher branch Alex 3 commit!" +Calendar.getInstance().getTimeZone() );*/
    }
}

   /*public static void main(String[] args) {
       MustangLogic m = new MustangLogic();
        m.JumpMustang();
    }
}

class MustangLogic {
    public void JumpMustang(){
        System.out.println("Hello World teatcher branch Alex 3 commit!");
    }
}*/