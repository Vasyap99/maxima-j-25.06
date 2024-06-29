package dz25_06;

public class Main{
    public static void main(String[]s){
        TVset ts=new TVset(new Channel1("TNT",new Program("Dom 2"),new Program("Bitva Ekstrasensov")),
                           new Channel1("1 kanal",new Program("Novosti"),new Program("KVN"),new Program("Show Malahova"))
                          );
        Pult1 pult=new Pult1();
        ts.registerPult(pult);
        pult.switchChannelTo(1);
        pult.switchChannelTo(2);
        System.out.println("Test");
    }
}