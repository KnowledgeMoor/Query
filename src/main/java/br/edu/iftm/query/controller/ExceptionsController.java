package br.edu.iftm.query.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.edu.iftm.query.service.exceptions.NaoAcheiException;

@ControllerAdvice
public class ExceptionsController {

        @ExceptionHandler(NaoAcheiException.class)
        public ResponseEntity<?> naoAchei(NaoAcheiException e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
}