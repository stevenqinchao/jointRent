package com.unique.jointrent.util;

public class BusinessException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String code;
    
    public BusinessException(String code, String message) {  
        super(message);  
        this.code = code;  
    } 

}
