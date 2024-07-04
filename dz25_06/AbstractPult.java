package dz25_06;


public abstract class AbstractPult implements Pult{
    private ITVset ts=null;
    public ITVset getTs(){return ts;}
    public void setTVset(ITVset ts){
        this.ts=ts;
    }

    //* Метод для переключения по цифрам (Т.е. ввел цифру 5 - включился 5 канал, цифру 8 - включился 8 и т.д.)
    @Override
    public abstract void switchChannelTo(int i);

    //* Метод для последовательного переключения вперед (Т.е. вы сейчас на 2 канале, после вызова этого метода, переключились на 3 и т.д.)
    @Override
    public void switchChannelForward(){
        if(ts!=null)
        if(ts.getCurrChannel()<ts.getChNum()) switchChannelTo(ts.getCurrChannel()+1);
    }
    //* Метод для последовательного переключения назад (Т.е. вы сейчас на 3 канале, после вызова этого метода, пеерключились на 2 и т.д.)
    @Override
    public void switchChannelBack(){
        if(ts!=null)
        if(ts.getCurrChannel()>1) switchChannelTo(ts.getCurrChannel()-1);
    }
    //* Доп. метод (доп задача) чтобы можно было переключаться между последними каналами (Т.е. если вы были на 5 канале, а до этого были на 8, то при вызове этого метода, он должен переключить нас на 8 канал, если вызвать его еще раз, то на 5 канал)
    @Override
    public void switchToPreviousChannel(){switchChannelBack();}
}