package com.bruno.todo.resources.exceptions;

import java.io.Serializable;

/**
 * StandardError
 */
public class StandardError implements Serializable{

    
    private long timestamp;
    private String message;
    private Integer status;
    
    public StandardError (){
        super();
    }
    
    public StandardError(long timestamp, String message, Integer status) {
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
    }

    
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

}