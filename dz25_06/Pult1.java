package dz25_06;

public class Pult1 extends AbstractPult implements Pult{
    //* ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)
    public void switchChannelTo(int i){
        getTs().switchChannel(this,i);
    }
}