package dz25_06;

import java.util.LinkedList;


public class Pult1 extends AbstractPult implements Pult{
    //* Метод для переключения по цифрам (Т.е. ввел цифру 5 - включился 5 канал, цифру 8 - включился 8 и т.д.)

    private LinkedList<Integer> l=new LinkedList<>();
    private boolean b=false;
    private int x=0;

    {
       l.add(1);
    }

    private void memChannel(int i){
        if(l.getLast()!=i) l.add(i);
    }

    public void switchChannelTo(int i){
        getTs().switchChannel(this,i);
        memChannel(getTs().getCurrChannel());
        b=false;
    }

    //* Доп. метод (доп задача) чтобы можно было переключаться между последними каналами (Т.е. если вы были на 5 канале, а до этого были на 8, то при вызове этого метода, он должен переключить нас на 8 канал, если вызвать его еще раз, то на 5 канал)
    public void switchToPreviousChannel(){
        int sz=l.size();
        if(b) sz=--x; else x=sz;
        if(sz>1){
            switchChannelTo(l.get(sz-2));
        }
        b=true;
    }
}