/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Action implements Serializable
{

    //@OneToOne(mappedBy="action")
    private PipeTasks pipeTasks;
    @Id
    @GeneratedValue
    private Long id;
    private String action_name;
    /*private List<Print> print;
    private List<RandomVal> random;
    private List<Completed> completed;
    private List<Delayed> delayed;*/


}
