package py.edu.ucsa.control.acceso.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.ucsa.control.acceso.core.domain.Cliente;
import py.edu.ucsa.control.acceso.core.mappers.ClienteMapper;
import py.edu.ucsa.control.acceso.core.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteMapper clienteMapper;

	@Override
	public List<Cliente> listar() {
		return clienteMapper.listar();
	}
	
	@Override
	public Cliente listarById(long id) {
		return clienteMapper.listarById(id);
	}
	
	@Override
	public void insertar(Cliente obj) {
		clienteMapper.insertar(obj);
		
	}

	@Override
	public void modificar(Cliente obj) {
//		clienteMapper.modificar(obj);
	}

	@Override
	public void eliminar(long id) {
		clienteMapper.eliminar(id);
	}

}
