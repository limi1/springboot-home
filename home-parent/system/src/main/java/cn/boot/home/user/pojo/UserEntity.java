package cn.boot.home.user.pojo;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * 用户实体类
 * 
 * @author limi
 *
 */
@EntityScan
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String user_id;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String user_name;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String user_sex;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String user_tel;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String user_address;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String user_password;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String organi_id; // 机构号

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String user_lock; // 是否可用

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String found_date;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String found_time;

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String login_date; // 最后登陆时间

	@SuppressWarnings("deprecation")
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String login_ip; // 最后登陆ip

	protected String getUser_id() {
		return user_id;
	}

	protected void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	protected String getUser_name() {
		return user_name;
	}

	protected void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	protected String getUser_sex() {
		return user_sex;
	}

	protected void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	protected String getUser_tel() {
		return user_tel;
	}

	protected void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	protected String getUser_address() {
		return user_address;
	}

	protected void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	protected String getUser_password() {
		return user_password;
	}

	protected void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	protected String getOrgani_id() {
		return organi_id;
	}

	protected void setOrgani_id(String organi_id) {
		this.organi_id = organi_id;
	}

	protected String getUser_lock() {
		return user_lock;
	}

	protected void setUser_lock(String user_lock) {
		this.user_lock = user_lock;
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

	protected String getLogin_date() {
		return login_date;
	}

	protected void setLogin_date(String login_date) {
		this.login_date = login_date;
	}

	protected String getLogin_ip() {
		return login_ip;
	}

	protected void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}

	@Override
	public String toString() {
		return "UserEntity [user_id=" + user_id + ", user_name=" + user_name + ", user_sex=" + user_sex + ", user_tel="
				+ user_tel + ", user_address=" + user_address + ", user_password=" + user_password + ", organi_id="
				+ organi_id + ", user_lock=" + user_lock + ", found_date=" + found_date + ", found_time=" + found_time
				+ ", login_date=" + login_date + ", login_ip=" + login_ip + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((found_date == null) ? 0 : found_date.hashCode());
		result = prime * result + ((found_time == null) ? 0 : found_time.hashCode());
		result = prime * result + ((login_date == null) ? 0 : login_date.hashCode());
		result = prime * result + ((login_ip == null) ? 0 : login_ip.hashCode());
		result = prime * result + ((organi_id == null) ? 0 : organi_id.hashCode());
		result = prime * result + ((user_address == null) ? 0 : user_address.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((user_lock == null) ? 0 : user_lock.hashCode());
		result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + ((user_sex == null) ? 0 : user_sex.hashCode());
		result = prime * result + ((user_tel == null) ? 0 : user_tel.hashCode());
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
		UserEntity other = (UserEntity) obj;
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
		if (login_date == null) {
			if (other.login_date != null)
				return false;
		} else if (!login_date.equals(other.login_date))
			return false;
		if (login_ip == null) {
			if (other.login_ip != null)
				return false;
		} else if (!login_ip.equals(other.login_ip))
			return false;
		if (organi_id == null) {
			if (other.organi_id != null)
				return false;
		} else if (!organi_id.equals(other.organi_id))
			return false;
		if (user_address == null) {
			if (other.user_address != null)
				return false;
		} else if (!user_address.equals(other.user_address))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (user_lock == null) {
			if (other.user_lock != null)
				return false;
		} else if (!user_lock.equals(other.user_lock))
			return false;
		if (user_name == null) {
			if (other.user_name != null)
				return false;
		} else if (!user_name.equals(other.user_name))
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (user_sex == null) {
			if (other.user_sex != null)
				return false;
		} else if (!user_sex.equals(other.user_sex))
			return false;
		if (user_tel == null) {
			if (other.user_tel != null)
				return false;
		} else if (!user_tel.equals(other.user_tel))
			return false;
		return true;
	}
}
