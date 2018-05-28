package cn.boot.home.manage.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * 权限实体类
 * 
 * @author limi
 *
 */
//@Entity
//@Table(name = "sys_home_manage")
public class ManageEntity {

	@Id
    @GeneratedValue
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String manage_id;

	@Column
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String manage_name;

	@Column
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String manage_desc;

	@Column
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String manage_lock;

	@Column
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String found_date;

	@Column
	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String found_time;

	protected String getManage_id() {
		return manage_id;
	}

	protected void setManage_id(String manage_id) {
		this.manage_id = manage_id;
	}

	protected String getManage_name() {
		return manage_name;
	}

	protected void setManage_name(String manage_name) {
		this.manage_name = manage_name;
	}

	protected String getManage_desc() {
		return manage_desc;
	}

	protected void setManage_desc(String manage_desc) {
		this.manage_desc = manage_desc;
	}

	protected String getManage_lock() {
		return manage_lock;
	}

	protected void setManage_lock(String manage_lock) {
		this.manage_lock = manage_lock;
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
		result = prime * result + ((manage_desc == null) ? 0 : manage_desc.hashCode());
		result = prime * result + ((manage_id == null) ? 0 : manage_id.hashCode());
		result = prime * result + ((manage_lock == null) ? 0 : manage_lock.hashCode());
		result = prime * result + ((manage_name == null) ? 0 : manage_name.hashCode());
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
		ManageEntity other = (ManageEntity) obj;
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
		if (manage_desc == null) {
			if (other.manage_desc != null)
				return false;
		} else if (!manage_desc.equals(other.manage_desc))
			return false;
		if (manage_id == null) {
			if (other.manage_id != null)
				return false;
		} else if (!manage_id.equals(other.manage_id))
			return false;
		if (manage_lock == null) {
			if (other.manage_lock != null)
				return false;
		} else if (!manage_lock.equals(other.manage_lock))
			return false;
		if (manage_name == null) {
			if (other.manage_name != null)
				return false;
		} else if (!manage_name.equals(other.manage_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ManageEntity [manage_id=" + manage_id + ", manage_name=" + manage_name + ", manage_desc=" + manage_desc
				+ ", manage_lock=" + manage_lock + ", found_date=" + found_date + ", found_time=" + found_time + "]";
	}

}
