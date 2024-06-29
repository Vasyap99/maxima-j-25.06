package dz25_06;

import java.util.Scanner;

public class Main{
    public static void main(String[]s1){
        TVset ts=new TVset(new Channel1("TNT",new Program("Dom 2"),new Program("Bitva Ekstrasensov")),
                           new Channel1("1 kanal",new Program("Novosti"),new Program("KVN"),new Program("Show Malahova"))
                          );
        Pult1 pult=new Pult1();
        ts.registerPult(pult);

        Scanner s=new Scanner(System.in);

        while(s.hasNextInt()){
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
        }
    }
}