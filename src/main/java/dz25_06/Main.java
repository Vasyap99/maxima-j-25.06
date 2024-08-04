package dz25_06;

import java.util.Scanner;
import java.util.Random;
import lombok.Getter;


class tvFactory{
    @Getter
    private ITVset ts;
    private boolean first_call=true;

    public tvFactory(ITVset ts){
        this.ts=ts;
    }

    public Pult getPult(int type){
       
        Pult pult=null;

        switch(type){
            case 0:
                pult=new Pult1();
                break;
            case 1:
                pult=new ChildPult();
                break;
            default:
                pult=new Pult1();
        }

        ts.registerPult(pult);        

        if(first_call){
            Random random = new Random();
            int randomNumber = random.nextInt(ts.getChNum()) + 1;

            pult.switchChannelTo(randomNumber);            
            first_call=false;
        }

        return pult;
    }
}

public class Main{
    public static void main(String[]s1){
        tvFactory tf=new tvFactory( 
            new TVset(new Channel1("TNT",new Program("Dom 2"),new Program("Bitva Ekstrasensov")),
                      new Channel1("1 kanal",new Program("Novosti"),new Program("KVN"),new Program("Show Malahova")),
                      new Channel1("Russia24",new Program("Vesti"))
                     )
        );
        int ptype=0;

        System.out.println("Choose pult type(0/1):");
        Scanner s=new Scanner(System.in);

        ptype=s.nextInt();
        if(ptype>1 || ptype<0) ptype=0;

        Pult pult=tf.getPult(ptype); 

        System.out.println("***********************************************************");
        System.out.println("Enter:\n   -1 back\n   0 forward\n or chanel number <Enter>");
        System.out.println("***********************************************************");

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