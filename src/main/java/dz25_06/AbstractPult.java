package dz25_06;

import lombok.Setter;
import lombok.Getter;

public abstract class AbstractPult implements Pult{
    @Setter
    @Getter
    private ITVset ts=null;

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