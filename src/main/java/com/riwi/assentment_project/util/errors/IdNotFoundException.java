package com.riwi.assentment_project.util.errors;

public class IdNotFoundException extends RuntimeException {
    
    private static final String ERROR_MESSAGE = "There are no records in the entity %s with the supplied id";
    public IdNotFoundException(String nameEntity) {
        super(String.format(ERROR_MESSAGE, nameEntity));
    }
    
}