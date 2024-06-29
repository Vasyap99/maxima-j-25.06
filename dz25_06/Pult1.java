package dz25_06;

import java.util.LinkedList;


public class Pult1 extends AbstractPult implements Pult{
    //* ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)

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

    //* ���. ����� (��� ������) ����� ����� ���� ������������� ����� ���������� �������� (�.�. ���� �� ���� �� 5 ������, � �� ����� ���� �� 8, �� ��� ������ ����� ������, �� ������ ����������� ��� �� 8 �����, ���� ������� ��� ��� ���, �� �� 5 �����)
    public void switchToPreviousChannel(){
        int sz=l.size();
        if(b) sz=--x; else x=sz;
        if(sz>1){
            switchChannelTo(l.get(sz-2));
        }
        b=true;
    }
}