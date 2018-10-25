package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.WorkflowConfig;
import java.util.*;
import com.viafirma.documents.sdk.java.model.WorkflowTask;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class WorkflowManager  {
  
  private List<WorkflowConfig> workflows = new ArrayList<WorkflowConfig>() ;
  private List<WorkflowTask> tasks = new ArrayList<WorkflowTask>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("workflows")
  public List<WorkflowConfig> getWorkflows() {
    return workflows;
  }
  public void setWorkflows(List<WorkflowConfig> workflows) {
    this.workflows = workflows;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("tasks")
  public List<WorkflowTask> getTasks() {
    return tasks;
  }
  public void setTasks(List<WorkflowTask> tasks) {
    this.tasks = tasks;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowManager {\n");
    
    sb.append("  workflows: ").append(workflows).append("\n");
    sb.append("  tasks: ").append(tasks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
