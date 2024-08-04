package dz25_06;

import java.util.List;
import java.util.Arrays;

import lombok.ToString;

@ToString(includeFieldNames = false)
public class Channel1{
    @ToString.Exclude
    private final List<Program> programs;

    public Channel1(String name,Program ... ps){
        programs=Arrays.asList(ps);
        this.name=name;
    }

    public String getCurrProgram(){
        try{
            return programs.get(0).toString();
        }catch(Exception e){
            return "(no programs!)";
        }
    }

    private final String name;
}