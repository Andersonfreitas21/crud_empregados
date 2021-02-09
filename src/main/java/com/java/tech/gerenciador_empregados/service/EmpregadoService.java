package com.java.tech.gerenciador_empregados.service;

import com.java.tech.gerenciador_empregados.exception.EmpregadoNotFoundExeception;
import com.java.tech.gerenciador_empregados.model.Empregado;
import com.java.tech.gerenciador_empregados.repository.EmpregadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class EmpregadoService {
    private final EmpregadoRepository empregadoRepository;

    public Empregado addEmpregado(Empregado Empregado) {
        return empregadoRepository.save(Empregado);
    }

    public List<Empregado> findAllEmpregados() {
        return empregadoRepository.findAll();
    }

    public Empregado updateEmpregado(Empregado Empregado) {
        return empregadoRepository.save(Empregado);
    }

    public Empregado findEmpregadoById(UUID uuid) {
        return empregadoRepository.findEmpregadoByUuid(uuid)
                .orElseThrow(() -> new EmpregadoNotFoundExeception("Empregado com o id " + uuid + " não foi encontrado"));
    }

    public void deleteEmpregado(UUID uuid){
        empregadoRepository.deleteEmpregadoByUuid(uuid);
    }
}
