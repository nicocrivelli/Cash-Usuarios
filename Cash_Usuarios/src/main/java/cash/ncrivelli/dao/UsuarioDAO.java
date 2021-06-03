package cash.ncrivelli.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cash.ncrivelli.model.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>{

}
