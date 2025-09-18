package br.com.proprietario.Proprietario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.proprietario.Proprietario.entity.Proprietario;
import br.com.proprietario.Proprietario.service.ProprietarioService;

@Controller
@RequestMapping("/proprietarios")
public class proprietarioController {

    @Autowired
    private ProprietarioService proprietarioService;

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Proprietario proprietario) {
        proprietarioService.save(proprietario);
        return "redirect:/proprietarios/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Proprietario> proprietarios = proprietarioService.findAll();
        model.addAttribute("proprietarios", proprietarios);
        return "Proprietario/listaProprietario"; 
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        return "Proprietario/formularioProprietario";
    }
    
    @GetMapping("/excluir/{id}")
public String excluir(@PathVariable Integer id) {
    proprietarioService.deleteById(id);
    return "redirect:/proprietarios/listar";
}
 @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Proprietario proprietario = proprietarioService.findById(id);
        model.addAttribute("proprietario", proprietario);
        return "Proprietario/formularioProprietario"; 
    }
}