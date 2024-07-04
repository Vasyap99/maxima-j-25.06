package dz25_06;


public interface ITVset{
    int getCurrChannel();

    int getChNum();

    void registerPult(Pult pult);

    void switchChannel(Pult pult,int i);
}