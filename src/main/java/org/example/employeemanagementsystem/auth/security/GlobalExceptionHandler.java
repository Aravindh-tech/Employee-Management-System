package org.example.employeemanagementsystem.auth.security;




import org.example.employeemanagementsystem.auth.exception.EmployeeNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGlobalException(Exception ex, WebRequest request) {
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("timestamp", LocalDateTime.now());
        responseBody.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        responseBody.put("error", "Internal Server Error");
        responseBody.put("message", ex.getMessage());
        responseBody.put("path", request.getDescription(false).replace("uri=", ""));

        return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private Throwable getRootCause(Throwable throwable) {
        Throwable cause = throwable.getCause();
        if (cause == null || cause == throwable) {
            return throwable;
        }
        return getRootCause(cause);
    }
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Object> handleDataIntegrityViolation(DataIntegrityViolationException ex,WebRequest request){
        String errorMessage= getRootCause(ex).getMessage();

        if (ex.getMessage()!=null && ex.getRootCause().getMessage().contains("email_unique")){
            errorMessage="Email Already Exists";
        }
        else if (ex.getMessage()!=null && ex.getRootCause().getMessage().contains("user_mobile_number_key")){
            errorMessage="Mobile Number Already Exists";
        }

        else if (ex.getMessage()!=null && ex.getRootCause().getMessage().contains("company_email_key")){
            errorMessage="Email Already Exists";
        }
        else if (ex.getMessage()!=null && ex.getRootCause().getMessage().contains("company_gstin_key")){
            errorMessage="Gstin Already Exists";
        }
        else if (ex.getMessage()!=null && ex.getRootCause().getMessage().contains("company_mobile_number_key")){
            errorMessage="Mobile Number Already Exists";
        }
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("timestamp", LocalDateTime.now());
        responseBody.put("status", HttpStatus.CONFLICT.value());
        responseBody.put("error", "Conflict");
        responseBody.put("message", errorMessage);
        responseBody.put("path", request.getDescription(false).replace("uri=", ""));

        return new ResponseEntity<>(responseBody, HttpStatus.CONFLICT);

    }


    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<String> handleEmployeeNotFound(EmployeeNotFoundException employeeNotFoundException){
        return new ResponseEntity<>(
                "Employee Id not found, Please enter correct Id.",
                HttpStatus.NOT_FOUND
        );
    }

}
