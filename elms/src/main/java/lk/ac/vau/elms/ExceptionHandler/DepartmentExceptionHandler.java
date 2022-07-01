package lk.ac.vau.elms.ExceptionHandler;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lk.ac.vau.elms.Model.ErrorMsg;

@ControllerAdvice
public class DepartmentExceptionHandler {
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ErrorMsg>DeptNotFound(EntityNotFoundException exception ){
		ErrorMsg errorMsg = new ErrorMsg(exception.getMessage(),404,"http://lk.ac.vau/elms/help");
		return new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.NOT_FOUND);
	}
}
