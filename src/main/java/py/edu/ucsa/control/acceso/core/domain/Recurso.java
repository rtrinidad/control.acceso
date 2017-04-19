package py.edu.ucsa.control.acceso.core.domain;

import java.util.Date;

public class Recurso {

	private int id_recurso;
	private String nombre;
	private boolean activo;
	private int id_sesion;
	private Date fecha_creacion;
	private String usuario_creacion;
	private Date ultima_modificacion;
	private int keykwf;
	public int getId_recurso() {
		return id_recurso;
	}
	public void setId_recurso(int id_recurso) {
		this.id_recurso = id_recurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public int getId_sesion() {
		return id_sesion;
	}
	public void setId_sesion(int id_sesion) {
		this.id_sesion = id_sesion;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public String getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(String usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	public Date getUltima_modificacion() {
		return ultima_modificacion;
	}
	public void setUltima_modificacion(Date ultima_modificacion) {
		this.ultima_modificacion = ultima_modificacion;
	}
	public int getKeykwf() {
		return keykwf;
	}
	public void setKeykwf(int keykwf) {
		this.keykwf = keykwf;
	}
	
	
	
	
}
