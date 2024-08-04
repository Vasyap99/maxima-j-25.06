package dz25_06;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

import lombok.Getter;


public class TVset implements ITVset{
    private HashSet<Pult> pults=new HashSet<>();

    @Getter
    private int currChannel=1;

    private Channel1[] channels;

    public TVset(Channel1... cs){
        channels=Arrays.copyOf(cs,cs.length);        
    }

    private void setCurrChannel(int i){
        if(i>=1 && i<=channels.length) currChannel=i;
    }

    @Override
    public int getChNum(){
        return channels.length;
    }

    @Override
    public void registerPult(Pult pult){
        pults.add(pult);
        pult.setTVset(this);
    }

    @Override
    public void switchChannel(Pult pult,int i){
        if(pults.contains(pult)){
            setCurrChannel(i);
            System.out.println(channels[currChannel-1].toString()); 
            System.out.println(channels[currChannel-1].getCurrProgram().toString()); 
        }else{
            System.out.println("Error! Pult not registred!");
        }
    }
}