package br.com.proprietario.Proprietario.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.proprietario.Proprietario.entity.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Integer> {
}