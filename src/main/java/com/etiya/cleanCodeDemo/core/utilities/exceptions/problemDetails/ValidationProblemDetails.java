package com.etiya.cleanCodeDemo.core.utilities.exceptions.problemDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


@Data
public class ValidationProblemDetails extends ProblemDetails{
    public ValidationProblemDetails() {
        setTitle("Validation Rule Violation");
        setDetail("Validation Problem");
        setType("http://etiya.com/exceptions/validation");
        setStatus("400");
    }

    private Map<String,String> errors;
}
