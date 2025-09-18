package br.com.proprietario.Proprietario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/Proprietario")
public class ProoprietarioController {

    @GetMapping
    public String index(Model model) {
        //retorna a  página index.html
        return "index";
    }
    
    
}
