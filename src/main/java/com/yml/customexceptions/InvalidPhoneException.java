package com.yml.customexceptions;

public class InvalidPhoneException extends Exception {
    public InvalidPhoneException(String msg) {
        super(msg);
    }
}
