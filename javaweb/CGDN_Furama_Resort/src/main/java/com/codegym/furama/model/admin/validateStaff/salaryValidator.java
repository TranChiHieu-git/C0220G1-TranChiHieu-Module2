package com.codegym.furama.model.validateStaff;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotEmpty;

public class salaryValidator implements ConstraintValidator<salaryAnnotation, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null) {
            if (!value.equals("")) {
                int salary = Integer.parseInt(value);
                if (salary > 0 && value.charAt(0) != '0') {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
