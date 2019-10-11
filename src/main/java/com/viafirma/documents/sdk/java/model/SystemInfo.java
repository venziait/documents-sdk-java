package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class SystemInfo  {
  
  private String loadAverage = null;
  private String memory = null;
  private String cpu = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("loadAverage")
  public String getLoadAverage() {
    return loadAverage;
  }
  public void setLoadAverage(String loadAverage) {
    this.loadAverage = loadAverage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("memory")
  public String getMemory() {
    return memory;
  }
  public void setMemory(String memory) {
    this.memory = memory;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("cpu")
  public String getCpu() {
    return cpu;
  }
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("  loadAverage: ").append(loadAverage).append("\n");
    sb.append("  memory: ").append(memory).append("\n");
    sb.append("  cpu: ").append(cpu).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
