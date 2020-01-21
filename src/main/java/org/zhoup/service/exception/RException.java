package org.zhoup.service.exception;

public class RException extends RuntimeException{
    private String code;
    private String msc;

    public RException() {

    }

    public RException(String code) {
        this.code = code;
    }

    public RException(String code, String msc) {
        this.code = code;
        this.msc = msc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsc() {
        return msc;
    }

    public void setMsc(String msc) {
        this.msc = msc;
    }
}
