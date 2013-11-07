package com.unique.jointrent.util;

public class ParameterException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -4910089946121184497L;
    
    public ParameterException() {  
        super();  
    }  
  
    public ParameterException(String message) {  
        super(message);  
    }  
  
    public ParameterException(Throwable cause) {  
        super(cause);  
    }  
  
    public ParameterException(String message, Throwable cause) {  
        super(message, cause);  
    }  
    
}
