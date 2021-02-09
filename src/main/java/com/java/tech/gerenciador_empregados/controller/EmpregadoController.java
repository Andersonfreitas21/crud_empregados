package com.java.tech.gerenciador_empregados.controller;

import com.java.tech.gerenciador_empregados.model.Empregado;
import com.java.tech.gerenciador_empregados.service.EmpregadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/empregado/api/v1")
@AllArgsConstructor
public class EmpregadoController {

    private final EmpregadoService empregadoService;

    @GetMapping("/all")
    public ResponseEntity<List<Empregado>> getAllEmpregados () {
        List<Empregado> Empregados = empregadoService.findAllEmpregados();
        return new ResponseEntity<>(Empregados, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Empregado> getEmpregadoById (@PathVariable("id") UUID id) {
        Empregado Empregado = empregadoService.findEmpregadoById(id);
        return new ResponseEntity<>(Empregado, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Empregado> addEmpregado(@RequestBody Empregado Empregado) {
        Empregado newEmpregado = empregadoService.addEmpregado(Empregado);
        return new ResponseEntity<>(newEmpregado, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Empregado> updateEmpregado(@RequestBody Empregado Empregado) {
        Empregado updateEmpregado = empregadoService.updateEmpregado(Empregado);
        return new ResponseEntity<>(updateEmpregado, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmpregado(@PathVariable("id") UUID id) {
        empregadoService.deleteEmpregado(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
