package dz25_06;

public class Pult1 extends AbstractPult{
    //* ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)
    public void switchChannelTo(int i){
        getTs().switchChannel(this,i);
    }
}