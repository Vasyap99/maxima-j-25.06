package dz25_06;

import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[]s1){
        TVset ts=new TVset(new Channel1("TNT",new Program("Dom 2"),new Program("Bitva Ekstrasensov")),
                           new Channel1("1 kanal",new Program("Novosti"),new Program("KVN"),new Program("Show Malahova")),
                           new Channel1("Russia24",new Program("Vesti"))
                          );
        Pult1 pult=new Pult1();
        ts.registerPult(pult);

        Random random = new Random();
        int randomNumber = random.nextInt(ts.getChNum()) + 1;

        pult.switchChannelTo(randomNumber);

        Scanner s=new Scanner(System.in);

        while(s.hasNext()){
            if(s.hasNextInt()){
                int i=s.nextInt();
                switch(i){
                    case 0:
                        pult.switchChannelForward();
                        break;
                    case -1:
                        pult.switchChannelBack();
                        break;
                    default:
                        pult.switchChannelTo(i);
                }
            }else{
                String cmd=s.next();
                if(cmd.equals("h")) pult.switchToPreviousChannel();
                else break;
            }
        }
    }
}