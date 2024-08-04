package dz25_06;

import lombok.Setter;

public class ChildPult implements Pult{
    @Setter
    private ITVset ts=null;
    
    public void switchChannelTo(int i){
        ts.switchChannel(this,i);
    }
    
    public void switchChannelForward(){
        ts.switchChannel(this,ts.getCurrChannel()+1);
    }
    
    public void switchChannelBack(){
        ts.switchChannel(this,ts.getCurrChannel()-1);
    }
    
    public void switchToPreviousChannel(){
        switchChannelBack();
    }
}