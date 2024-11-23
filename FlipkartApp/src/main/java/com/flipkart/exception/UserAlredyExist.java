package com.flipkart.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class UserAlredyExist  extends RuntimeException{

    public String message;
    static final long serialVersionUID = -7034897190745766939L;

}
