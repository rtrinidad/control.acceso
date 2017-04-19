package py.edu.ucsa.control.acceso.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import py.edu.ucsa.control.acceso.core.domain.Cliente;

@Service
public interface ClienteService {
	public List<Cliente> listar();
	public Cliente listarById(long id);
	public void insertar(Cliente obj);
	public void modificar(Cliente obj);
	public void eliminar(long id);
}
