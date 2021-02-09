package com.java.tech.gerenciador_empregados.repository;

import com.java.tech.gerenciador_empregados.model.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, UUID> {
    void deleteEmpregadoByUuid(UUID uuid);
    Optional<Empregado> findEmpregadoByUuid(UUID uuid);
}
