package cn.boot.home.role.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * 角色实体类
 * 
 * @author limi
 *
 */
public class RoleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String role_id;
	
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String role_name;
	
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String role_desc;
	
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String role_lock;
	
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String found_date;
	
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String found_time;

	protected String getRole_id() {
		return role_id;
	}

	protected void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	protected String getRole_name() {
		return role_name;
	}

	protected void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	protected String getRole_desc() {
		return role_desc;
	}

	protected void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}

	protected String getRole_lock() {
		return role_lock;
	}

	protected void setRole_lock(String role_lock) {
		this.role_lock = role_lock;
	}

	protected String getFound_date() {
		return found_date;
	}

	protected void setFound_date(String found_date) {
		this.found_date = found_date;
	}

	protected String getFound_time() {
		return found_time;
	}

	protected void setFound_time(String found_time) {
		this.found_time = found_time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((found_date == null) ? 0 : found_date.hashCode());
		result = prime * result + ((found_time == null) ? 0 : found_time.hashCode());
		result = prime * result + ((role_desc == null) ? 0 : role_desc.hashCode());
		result = prime * result + ((role_id == null) ? 0 : role_id.hashCode());
		result = prime * result + ((role_lock == null) ? 0 : role_lock.hashCode());
		result = prime * result + ((role_name == null) ? 0 : role_name.hashCode());
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
		RoleEntity other = (RoleEntity) obj;
		if (found_date == null) {
			if (other.found_date != null)
				return false;
		} else if (!found_date.equals(other.found_date))
			return false;
		if (found_time == null) {
			if (other.found_time != null)
				return false;
		} else if (!found_time.equals(other.found_time))
			return false;
		if (role_desc == null) {
			if (other.role_desc != null)
				return false;
		} else if (!role_desc.equals(other.role_desc))
			return false;
		if (role_id == null) {
			if (other.role_id != null)
				return false;
		} else if (!role_id.equals(other.role_id))
			return false;
		if (role_lock == null) {
			if (other.role_lock != null)
				return false;
		} else if (!role_lock.equals(other.role_lock))
			return false;
		if (role_name == null) {
			if (other.role_name != null)
				return false;
		} else if (!role_name.equals(other.role_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RoleEntity [role_id=" + role_id + ", role_name=" + role_name + ", role_desc=" + role_desc
				+ ", role_lock=" + role_lock + ", found_date=" + found_date + ", found_time=" + found_time + "]";
	}

}
