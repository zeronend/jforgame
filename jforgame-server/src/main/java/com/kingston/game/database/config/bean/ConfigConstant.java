package com.kingston.game.database.config.bean;

import com.kingston.orm.annotation.Column;
import com.kingston.orm.annotation.Entity;
import com.kingston.orm.annotation.Id;

/**
 * 常量配置表
 * @author kingston
 */
@Entity(readOnly = true)
public class ConfigConstant {

	@Column
	@Id
	private int id;
	@Column
	private int intValue;
	@Column
	private String stringValue;
	/** 功能描述 */
	@Column
	private String description;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}