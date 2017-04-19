package py.edu.ucsa.control.acceso.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.ucsa.control.acceso.core.domain.Cliente;
import py.edu.ucsa.control.acceso.core.services.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listar() {
		List<Cliente> respuesta = clienteServ.listar(); 
		return new ResponseEntity<List<Cliente>>(respuesta, HttpStatus.OK);	
	}
	
	@RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Cliente> insertar(@RequestBody Cliente obj){		
		clienteServ.insertar(obj);
        return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
    }

	@RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> modificar(@RequestBody Cliente obj){
		
		clienteServ.modificar(obj);
        ResponseEntity<Object> response = new ResponseEntity<Object>(clienteServ, HttpStatus.OK);
        return response;
    }

    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> borrar(@PathVariable("id") Long id){
        
    	clienteServ.eliminar(id);
        ResponseEntity<Object> response = new ResponseEntity<Object>(id, HttpStatus.OK);
        return response;
    }
}
