package by.pipeline.jar.model;

import com.sun.javafx.collections.MappingChange.Map;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.context.annotation.ComponentScan;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ComponentScan
public class PipeLine implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    //@OneToMany (mappedBy="pipeline")
    private PipeTasks task;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

   
}
