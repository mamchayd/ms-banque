package org.enset.msbanque.web;

import org.enset.msbanque.entities.Compte;
import org.enset.msbanque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banque")
public class CompteRestController {
    @Autowired
    private CompteRepository compteRepository;

    @GetMapping(path="/comptes",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Compte> compteList(){

        return compteRepository.findAll();
    }


    @GetMapping(path="/comptes/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Compte getOne(@PathVariable(value = "id") Long id){
        return compteRepository.findById(id).get();
    }

    @PostMapping(path="/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }


    @PutMapping(path="/comptes/{id}")
    public Compte update(@RequestBody Compte compte,@PathVariable("id") Long id){
      compte.setId(id);
        return compteRepository.save(compte);
    }

    @DeleteMapping(path="/comptes/{id}")
    public void delete(@PathVariable("id") Long id){
       compteRepository.deleteById(id);
    }




}
