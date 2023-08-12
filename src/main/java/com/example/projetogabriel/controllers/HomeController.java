package com.example.projetogabriel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetogabriel.model.Individuo;
import com.example.projetogabriel.repository.IndividuoRepository;

@RestController
@RequestMapping("/Individuos")
public class HomeController {
@Autowired
private IndividuoRepository IndividuoRepository;
@GetMapping
public List<Individuo> listarIndividuo() {
return IndividuoRepository.findAll();
}
@PostMapping
public Individuo adicionarIndividuo(@RequestBody Individuo Individuo) {
return IndividuoRepository.save(Individuo);
}
@DeleteMapping("/{id}")
public void apagarIndividuo(@PathVariable long id) {
IndividuoRepository.deleteById(id);
}
@PutMapping("/{id}")
public void updateIndividuo (@PathVariable long id, @RequestBody
Individuo Individuo) {
 var i = IndividuoRepository.findById(id);
 var iAlterado = i.get();
 iAlterado.setNome(Individuo.getNome());
 iAlterado.setCpf(Individuo.getDocumento());
 iAlterado.setTelefone(Individuo.getCelular());
 IndividuoRepository.save(iAlterado);
}
}