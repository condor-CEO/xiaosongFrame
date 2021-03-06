package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTblDevices<M extends BaseTblDevices<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setDeviceName(java.lang.String deviceName) {
		set("deviceName", deviceName);
		return (M)this;
	}
	
	public java.lang.String getDeviceName() {
		return getStr("deviceName");
	}

	public M setDeviceIp(java.lang.String deviceIp) {
		set("deviceIp", deviceIp);
		return (M)this;
	}
	
	public java.lang.String getDeviceIp() {
		return getStr("deviceIp");
	}

	public M setDevicePort(java.lang.String devicePort) {
		set("devicePort", devicePort);
		return (M)this;
	}
	
	public java.lang.String getDevicePort() {
		return getStr("devicePort");
	}

	public M setFqTurnover(java.lang.String fqTurnover) {
		set("FQ_turnover", fqTurnover);
		return (M)this;
	}
	
	public java.lang.String getFqTurnover() {
		return getStr("FQ_turnover");
	}

	public M setEOut(java.lang.String eOut) {
		set("E_out", eOut);
		return (M)this;
	}
	
	public java.lang.String getEOut() {
		return getStr("E_out");
	}

	public M setExpt1(java.lang.String expt1) {
		set("expt1", expt1);
		return (M)this;
	}
	
	public java.lang.String getExpt1() {
		return getStr("expt1");
	}

	public M setExpt2(java.lang.String expt2) {
		set("expt2", expt2);
		return (M)this;
	}
	
	public java.lang.String getExpt2() {
		return getStr("expt2");
	}

}
