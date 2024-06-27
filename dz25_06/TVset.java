package dz25_06;

import java.util.HashSet;
//import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class TVset{
    private HashSet<Pult> pults=new HashSet<>();
    private int currChannel=0;

    private Channel1[] channels;

    public TVset(Channel1... cs){
        channels=Arrays.copyOf(cs,cs.length);        
    }

    private void setCurrChannel(int i){
        if(i>=0 && i<channels.length) currChannel=i;
    }
    public int getCurrChannel(){
        return currChannel;
    }

    public void registerPult(Pult pult){
        pults.add(pult);
        pult.setTVset(this);
    }

    public void switchChannel(Pult pult,int i){
        if(pults.contains(pult)){
            setCurrChannel(i);
            System.out.println(channels[i].toString()); 
            System.out.println(channels[i].getCurrProgram().toString()); 
        }else{
            System.out.println("Error! Pult not registred!");
        }
    }
}