package com.empresa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_medicamento")
public class Medicamento {
	@Id	
	@Column(name="cod_med")
	private int cod_med;
	@Column(name="des_med")
	private String des_med;
	@Column(name="pre_med")
	private String pre_med;
	@Column(name="can_med")
	private String can_med;
	@Column(name="fecha_elab")
	private String fecha_elab;
	@Column(name="nom_marca")
	private String nom_marca;
	public int getCod_med() {
		return cod_med;
	}
	public void setCod_med(int cod_med) {
		this.cod_med = cod_med;
	}
	public String getDes_med() {
		return des_med;
	}
	public void setDes_med(String des_med) {
		this.des_med = des_med;
	}
	public String getPre_med() {
		return pre_med;
	}
	public void setPre_med(String pre_med) {
		this.pre_med = pre_med;
	}
	public String getCan_med() {
		return can_med;
	}
	public void setCan_med(String can_med) {
		this.can_med = can_med;
	}
	public String getFecha_elab() {
		return fecha_elab;
	}
	public void setFecha_elab(String fecha_elab) {
		this.fecha_elab = fecha_elab;
	}
	public String getNom_marca() {
		return nom_marca;
	}
	public void setNom_marca(String nom_marca) {
		this.nom_marca = nom_marca;
	}
	public Medicamento(int cod_med, String des_med, String pre_med, String can_med, String fecha_elab, String nom_marca) {
		super();
		this.cod_med = cod_med;
		this.des_med = des_med;
		this.pre_med = pre_med;
		this.can_med = can_med;
		this.fecha_elab = fecha_elab;
		this.nom_marca = nom_marca;
	}
	public Medicamento() {
		
	}
	
	
	
	
	
}
