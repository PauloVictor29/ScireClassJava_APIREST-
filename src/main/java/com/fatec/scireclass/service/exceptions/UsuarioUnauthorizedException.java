package com.fatec.scireclass.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UsuarioUnauthorizedException extends RuntimeException {
    public UsuarioUnauthorizedException(String ex){
        super(ex);
    }
    
}
