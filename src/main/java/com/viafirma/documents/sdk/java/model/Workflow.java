package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.EventHistory;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@ApiModel(description = "")
public class Workflow {

	private String code = null;
	private String current = null;
	private String next = null;
	private List<EventHistory> history = new ArrayList<EventHistory>();
	private Date initiate = null;
	private Date lastUpdated = null;
	private Date expires = null;
	private String referenceCode = null;
	private Integer  step;
	private Integer  steps;
	private String  previousMessageCode;
	private Boolean  workflowFinished;

	public enum TypeEnum {
		APP, WEB, PRESENTIAL,
	};

	private TypeEnum type = null;

	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 **/
	@ApiModelProperty(required = false, value = "")
	@JsonProperty("current")
	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	/**
	 **/
	@ApiModelProperty(required = false, value = "")
	@JsonProperty("next")
	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	/**
	 **/
	@ApiModelProperty(required = false, value = "")
	@JsonProperty("history")
	public List<EventHistory> getHistory() {
		return history;
	}

	public void setHistory(List<EventHistory> history) {
		this.history = history;
	}

	/**
	 **/
	@ApiModelProperty(required = false, value = "")
	@JsonProperty("initiate")
	public Date getInitiate() {
		return initiate;
	}

	public void setInitiate(Date initiate) {
		this.initiate = initiate;
	}

	/**
	 **/
	@ApiModelProperty(required = false, value = "")
	@JsonProperty("lastUpdated")
	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 **/
	@ApiModelProperty(required = false, value = "")
	@JsonProperty("expires")
	public Date getExpires() {
		return expires;
	}

	public void setExpires(Date expires) {
		this.expires = expires;
	}

	/**
	 **/
	@ApiModelProperty(required = false, value = "")
	@JsonProperty("type")
	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@ApiModelProperty(required = false, value = "")
	@JsonProperty("referenceCode")
	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}
	
	
	@ApiModelProperty(required = false)
	@JsonProperty("step")
	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	@ApiModelProperty(required = false)
	@JsonProperty("steps")
	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	@ApiModelProperty(required = false)
	@JsonProperty("previousMessageCode")
	public String getPreviousMessageCode() {
		return previousMessageCode;
	}

	public void setPreviousMessageCode(String previousMessageCode) {
		this.previousMessageCode = previousMessageCode;
	}

	@ApiModelProperty(required = false, value = "false")
	@JsonProperty("workflowFinished")
	public Boolean getWorkflowFinished() {
		return workflowFinished;
	}

	public void setWorkflowFinished(Boolean workflowFinished) {
		this.workflowFinished = workflowFinished;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Workflow {\n");

		sb.append("  code: ").append(code).append("\n");
		sb.append("  current: ").append(current).append("\n");
		sb.append("  next: ").append(next).append("\n");
		sb.append("  history: ").append(history).append("\n");
		sb.append("  initiate: ").append(initiate).append("\n");
		sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
		sb.append("  expires: ").append(expires).append("\n");
		sb.append("  type: ").append(type).append("\n");
		sb.append("}\n");
		return sb.toString();
	}


}
