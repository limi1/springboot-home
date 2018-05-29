package cn.boot.home.auth.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * 菜单实体类
 * 
 * @author limi
 *
 */
@Entity
@Table(name = "sys_home_auth")
public class AuthEntity {

	public AuthEntity() {
	}

	public AuthEntity(String auth_id, String auth_type, String auth_url, String auth_name, String parent_auth_id,
			String show_flag) {
		super();
		this.auth_id = auth_id;
		this.auth_type = auth_type;
		this.auth_url = auth_url;
		this.auth_name = auth_name;
		this.parent_auth_id = parent_auth_id;
		this.show_flag = show_flag;
	}

	@Id
	@GeneratedValue
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String auth_id;

	@Column(nullable = false)
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String auth_type;

	@Column(nullable = false)
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String auth_url;

	@Column(nullable = false)
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String auth_name;

	@Column(nullable = false)
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String parent_auth_id;

	@Column(nullable = false)
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String show_flag;

	protected String getAuth_id() {
		return auth_id;
	}

	protected void setAuth_id(String auth_id) {
		this.auth_id = auth_id;
	}

	protected String getAuth_type() {
		return auth_type;
	}

	protected void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}

	protected String getAuth_url() {
		return auth_url;
	}

	protected void setAuth_url(String auth_url) {
		this.auth_url = auth_url;
	}

	protected String getAuth_name() {
		return auth_name;
	}

	protected void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	protected String getParent_auth_id() {
		return parent_auth_id;
	}

	protected void setParent_auth_id(String parent_auth_id) {
		this.parent_auth_id = parent_auth_id;
	}

	protected String getShow_flag() {
		return show_flag;
	}

	protected void setShow_flag(String show_flag) {
		this.show_flag = show_flag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auth_id == null) ? 0 : auth_id.hashCode());
		result = prime * result + ((auth_name == null) ? 0 : auth_name.hashCode());
		result = prime * result + ((auth_type == null) ? 0 : auth_type.hashCode());
		result = prime * result + ((auth_url == null) ? 0 : auth_url.hashCode());
		result = prime * result + ((parent_auth_id == null) ? 0 : parent_auth_id.hashCode());
		result = prime * result + ((show_flag == null) ? 0 : show_flag.hashCode());
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
		AuthEntity other = (AuthEntity) obj;
		if (auth_id == null) {
			if (other.auth_id != null)
				return false;
		} else if (!auth_id.equals(other.auth_id))
			return false;
		if (auth_name == null) {
			if (other.auth_name != null)
				return false;
		} else if (!auth_name.equals(other.auth_name))
			return false;
		if (auth_type == null) {
			if (other.auth_type != null)
				return false;
		} else if (!auth_type.equals(other.auth_type))
			return false;
		if (auth_url == null) {
			if (other.auth_url != null)
				return false;
		} else if (!auth_url.equals(other.auth_url))
			return false;
		if (parent_auth_id == null) {
			if (other.parent_auth_id != null)
				return false;
		} else if (!parent_auth_id.equals(other.parent_auth_id))
			return false;
		if (show_flag == null) {
			if (other.show_flag != null)
				return false;
		} else if (!show_flag.equals(other.show_flag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AuthEntity [auth_id=" + auth_id + ", auth_type=" + auth_type + ", auth_url=" + auth_url + ", auth_name="
				+ auth_name + ", parent_auth_id=" + parent_auth_id + ", show_flag=" + show_flag + "]";
	}

}
