package db.Controller;

import com.sun.xml.bind.v2.model.runtime.RuntimeEnumLeafInfo;
import db.service.NoSuchEntityExceotion;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponsentityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value= NoSuchEntityExceotion.class)
    protected ResponseEntity<Object> handleNoSuchElement(NoSuchEntityExceotion ex, WebRequest request){
        return handleExceptionInternal(ex,ex.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
