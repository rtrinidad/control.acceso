package py.edu.ucsa.control.acceso.core.mappers;

import java.util.List;

import py.edu.ucsa.control.acceso.core.domain.Cliente;

public interface ClienteMapper {
	public List<Cliente> listar();
	public Cliente listarById(long id);
	public void insertar(Cliente obj);
//	public void modificar(Cliente obj);
	public void eliminar(long id);
}
