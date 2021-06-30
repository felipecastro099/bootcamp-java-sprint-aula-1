package br.com.meli.apirest.controllers;

import br.com.meli.apirest.Morse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/morse")
public class MorseController {

    @GetMapping("/encode/{s}")
    public String encode(@PathVariable String s){
        return Morse.string2morse(s);
    }

    @GetMapping("/decode/{s}")
    public String decode(@PathVariable String s){
        return Morse.morse2string(s);
    }
}
