package net.javaguides.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)


public class ResourceNotFoudException extends RuntimeException{
    public ResourceNotFoudException(String messege){
        super(messege);
    }
}
