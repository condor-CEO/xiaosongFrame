package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTblVisitorRecordMaxid<M extends BaseTblVisitorRecordMaxid<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setPospId(java.lang.Integer pospId) {
		set("pospId", pospId);
		return (M)this;
	}
	
	public java.lang.Integer getPospId() {
		return getInt("pospId");
	}

	public M setMaxVisitorId(java.lang.Integer maxVisitorId) {
		set("maxVisitorId", maxVisitorId);
		return (M)this;
	}
	
	public java.lang.Integer getMaxVisitorId() {
		return getInt("maxVisitorId");
	}

	public M setTempId(java.lang.Integer tempId) {
		set("tempId", tempId);
		return (M)this;
	}
	
	public java.lang.Integer getTempId() {
		return getInt("tempId");
	}

}
