package dz25_06;

import java.util.LinkedList;


public class Pult1 extends AbstractPult implements Pult{
    //* Метод для переключения по цифрам (Т.е. ввел цифру 5 - включился 5 канал, цифру 8 - включился 8 и т.д.)

    LinkedList<Integer> l=new LinkedList<>();

    {
       l.add(1);
    }

    private void memChannel(int i){
        if(l.getLast()!=i) l.add(i);
    }

    public void switchChannelTo(int i){
        getTs().switchChannel(this,i);
        memChannel(getTs().getChNum());
    }
}