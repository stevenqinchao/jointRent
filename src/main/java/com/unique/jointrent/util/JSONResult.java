package com.unique.jointrent.util;

public class JSONResult {

    private boolean success;

    private String content;

    private String place;

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success
     *            the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * method description goes here
     * 
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * method description goes here
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * method description goes here
     * 
     * @return
     */
    public String getPlace() {
        return place;
    }

    /**
     * method description goes here
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

}

