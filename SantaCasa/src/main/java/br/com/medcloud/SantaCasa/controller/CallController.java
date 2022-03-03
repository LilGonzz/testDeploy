package br.com.medcloud.SantaCasa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("LaudoPDF")
public class CallController {

    @GetMapping("/{test}")
    public ResponseEntity<String> Test(@PathVariable String test){
        String send = "testando app: " + test;
        return new ResponseEntity<String>(send, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> CallWebservice(@RequestBody String data){
        String response = data;
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
