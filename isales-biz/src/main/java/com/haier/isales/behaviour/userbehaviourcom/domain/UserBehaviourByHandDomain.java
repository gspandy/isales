package com.haier.isales.behaviour.userbehaviourcom.domain;

import java.io.Serializable;

public class UserBehaviourByHandDomain implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /** 
    * @Fields userId : id
    */
    private long id;
    /** 
    * @Fields isRecording : 是否行为记录，默认是启动
    */
    private String isRecording;
    
    private String type;
    
    private String reason;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getIsRecording() {
        return isRecording;
    }
    public void setIsRecording(String isRecording) {
        this.isRecording = isRecording;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "UserBehaviourByHandDomain [id=" + id + ", isRecording=" + isRecording + ", type=" + type + ", reason="
                + reason + "]";
    }
}
