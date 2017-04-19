package py.edu.ucsa.control.acceso.core.domain;

import java.util.Date;

public class Sector {
	
	private int id_sector;
	private String nombre;
	private boolean activo;
	private int id_sesion;
	private Date fecha_creacion;
	private String usuario_creacion;
	private Date fecha_modificacion;
	private String usuario_modificacion;
	private Date ultima_modificacion;
	private int keykwf;
	
	public int getId_sector() {
		return id_sector;
	}
	public void setId_sector(int id_sector) {
		this.id_sector = id_sector;
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
	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}
	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}
	public String getUsuario_modificacion() {
		return usuario_modificacion;
	}
	public void setUsuario_modificacion(String usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
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
