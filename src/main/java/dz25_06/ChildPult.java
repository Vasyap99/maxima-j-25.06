package dz25_06;

public class ChildPult implements Pult{
    private ITVset ts=null;

    public void setTVset(ITVset ts){
        this.ts=ts;
    }
    
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