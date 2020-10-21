package com.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="producttab")
public class Product {
	@Id
	@Column(name="pid")
	@GeneratedValue(generator="id")
	@GenericGenerator(name="id",strategy="com.app.generator.IdGenerator")
	private Integer id;
	
	@Column(name="pcode")
	private String code;
	@Column(name="pname")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="valid")
	private String isValid;
	@Column(name="type")
	@ElementCollection
	private List<String> type;
	@Column(name="pcost")
	private Double cost;
	@Column(name="pgst")
	private Integer gst;
	
	@Column(name="pnote")
	private String note;

	public Product() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsValid() {
		return isValid;
	}
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getGst() {
		return gst;
	}
	public void setGst(Integer gst) {
		this.gst = gst;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", password=" + password + ", isValid="
				+ isValid + ", type=" + type + ", cost=" + cost + ", gst=" + gst + ", note=" + note + "]";
	}
   
}
