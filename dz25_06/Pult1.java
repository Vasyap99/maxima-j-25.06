package dz25_06;

public class Pult1 extends AbstractPult implements Pult{
    //* Метод для переключения по цифрам (Т.е. ввел цифру 5 - включился 5 канал, цифру 8 - включился 8 и т.д.)
    public void switchChannelTo(int i){
        getTs().switchChannel(this,i);
    }
}