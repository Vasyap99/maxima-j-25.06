package dz25_06;


public abstract class AbstractPult implements Pult{
    private ITVset ts=null;
    public ITVset getTs(){return ts;}
    public void setTVset(ITVset ts){
        this.ts=ts;
    }


    @Override
    public abstract void switchChannelTo(int i);


    @Override
    public void switchChannelForward(){
        if(ts!=null)
        if(ts.getCurrChannel()<ts.getChNum()) switchChannelTo(ts.getCurrChannel()+1);
    }

    @Override
    public void switchChannelBack(){
        if(ts!=null)
        if(ts.getCurrChannel()>1) switchChannelTo(ts.getCurrChannel()-1);
    }

    @Override
    public void switchToPreviousChannel(){switchChannelBack();}
}