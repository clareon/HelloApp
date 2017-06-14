package chapt01;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Hello
{

    public static void main(String[] args){
        String Passvd = "user";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("Введите пароль");
            String userPasss = br.readLine();
            if (Passvd.equals(userPasss) ) System.out.println("Пароли совпадают");
            else System.out.println("Пароли не совпадают");
        }
        catch (IOException e){
            System.err.print("Ошибка ввода" + e);
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