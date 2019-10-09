package izzi.gestionoperaciones.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class user_app implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -5936673529777664976L;
	
	@Id
	private Long id;
	
	@Column (length = 30, unique = true, nullable = false)
	private String numero_empleado;
	
	@Column(length = 50, unique = true, nullable = false)
	private String wa;
	
	@Column(length = 50, nullable = false)
	private String nombre;
	
	@Column(length = 50, nullable = false)
	private String ap_paterno;
	
	@Column(length = 50, nullable = true)
	private String ap_materno;
	
	@Column(length = 12, nullable = false)
	private String contraena;
	
	@Transient
	private String confirmaContrasena;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles",
	joinColumns = @JoinColumn(name="user_app_id"),
	inverseJoinColumns = @JoinColumn(name="cerco_id"))
	private Set<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero_empleado() {
		return numero_empleado;
	}

	public void setNumero_empleado(String numero_empleado) {
		this.numero_empleado = numero_empleado;
	}

	public String getWa() {
		return wa;
	}

	public void setWa(String wa) {
		this.wa = wa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_paterno() {
		return ap_paterno;
	}

	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}

	public String getAp_materno() {
		return ap_materno;
	}

	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}

	public String getContraena() {
		return contraena;
	}

	public void setContraena(String contraena) {
		this.contraena = contraena;
	}

	public String getConfirmaContrasena() {
		return confirmaContrasena;
	}

	public void setConfirmaContrasena(String confirmaContrasena) {
		this.confirmaContrasena = confirmaContrasena;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "user_app [id=" + id + ", numero_empleado=" + numero_empleado + ", wa=" + wa + ", nombre=" + nombre
				+ ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", contraena=" + contraena
				+ ", confirmaContrasena=" + confirmaContrasena + ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ap_materno == null) ? 0 : ap_materno.hashCode());
		result = prime * result + ((ap_paterno == null) ? 0 : ap_paterno.hashCode());
		result = prime * result + ((confirmaContrasena == null) ? 0 : confirmaContrasena.hashCode());
		result = prime * result + ((contraena == null) ? 0 : contraena.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numero_empleado == null) ? 0 : numero_empleado.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((wa == null) ? 0 : wa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		user_app other = (user_app) obj;
		if (ap_materno == null) {
			if (other.ap_materno != null)
				return false;
		} else if (!ap_materno.equals(other.ap_materno))
			return false;
		if (ap_paterno == null) {
			if (other.ap_paterno != null)
				return false;
		} else if (!ap_paterno.equals(other.ap_paterno))
			return false;
		if (confirmaContrasena == null) {
			if (other.confirmaContrasena != null)
				return false;
		} else if (!confirmaContrasena.equals(other.confirmaContrasena))
			return false;
		if (contraena == null) {
			if (other.contraena != null)
				return false;
		} else if (!contraena.equals(other.contraena))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numero_empleado == null) {
			if (other.numero_empleado != null)
				return false;
		} else if (!numero_empleado.equals(other.numero_empleado))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (wa == null) {
			if (other.wa != null)
				return false;
		} else if (!wa.equals(other.wa))
			return false;
		return true;
	}

	
	
	  
	 
}
