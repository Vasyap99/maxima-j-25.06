package dz25_06;

import java.util.List;
import java.util.Arrays;

import lombok.ToString;
import lombok.Builder;
import lombok.AllArgsConstructor;


@ToString(includeFieldNames = false)
@Builder
@AllArgsConstructor						//When you provide your own constructor then Lombok doesn't create a constructor with all args that @Builder is using. So you should just add annotation @AllArgsConstructor to your class
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

    //public String toString(){return name;}
}