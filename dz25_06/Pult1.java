package dz25_06;

import java.util.LinkedList;


public class Pult1 extends AbstractPult implements Pult{
    //* ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)

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