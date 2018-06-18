package by.pipeline.jar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class Print implements Serializable{
    @JsonProperty("action")
    private String name;

    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    
    
   
    
    
        
}
