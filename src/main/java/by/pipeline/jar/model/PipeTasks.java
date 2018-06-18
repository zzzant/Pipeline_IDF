package by.pipeline.jar.model;



import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ComponentScan
public class PipeTasks implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String task_name;
    private String task_description;
    //@OneToOne (mappedBy="pipetasks")
    private Action action;
    //@ManyToOne
    private PipeLine pipeline;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public Action getAction() {
    return action;
    }
    
    public void setAction(Action action) {
    this.action = action;
    }
}

   

