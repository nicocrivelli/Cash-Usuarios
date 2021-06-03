package cash.ncrivelli.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cash.ncrivelli.dao.UsuarioDAO;
import cash.ncrivelli.model.Usuario;

@RestController
@RequestMapping("usuario")
public class UsuarioRest {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@PostMapping("/save")
	public void save(@RequestBody Usuario usuario) {
		usuarioDAO.save(usuario);
	}
	
	@GetMapping("/showAll")
	public List<Usuario> showAll(){
		return usuarioDAO.findAll();
	}
	
	@GetMapping("/show/{id}")
	public Optional<Usuario> show(@PathVariable("id") Integer id) {
		return usuarioDAO.findById(id);
	}
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		usuarioDAO.deleteById(id);
	}

}
