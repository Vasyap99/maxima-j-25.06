package dz25_06;

public abstract class AbstractPult implements Pult{
    private TVset ts=null;
    public TVset getTs(){return ts;}
    public void setTVset(TVset ts){
        this.ts=ts;
    }
    //* ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)
    public abstract void switchChannelTo(int i);

    //* ����� ��� ����������������� ������������ ������ (�.�. �� ������ �� 2 ������, ����� ������ ����� ������, ������������� �� 3 � �.�.)
    public void switchChannelForward(){
        if(ts!=null)
        if(ts.getCurrChannel()<ts.getChNum()) switchChannelTo(ts.getCurrChannel()+1);
    }
    //* ����� ��� ����������������� ������������ ����� (�.�. �� ������ �� 3 ������, ����� ������ ����� ������, ������������� �� 2 � �.�.)
    public void switchChannelBack(){
        if(ts!=null)
        if(ts.getCurrChannel()>1) switchChannelTo(ts.getCurrChannel()-1);
    }
    //* ���. ����� (��� ������) ����� ����� ���� ������������� ����� ���������� �������� (�.�. ���� �� ���� �� 5 ������, � �� ����� ���� �� 8, �� ��� ������ ����� ������, �� ������ ����������� ��� �� 8 �����, ���� ������� ��� ��� ���, �� �� 5 �����)
    public void switchToPreviousChannel(){switchChannelBack();}
}