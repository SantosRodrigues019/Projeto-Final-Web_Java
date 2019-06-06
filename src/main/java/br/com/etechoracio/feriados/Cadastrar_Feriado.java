package br.com.etechoracio.feriados;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="Etec_feriados")
@Entity
public class Cadastrar_Feriado {

	@Id
	@Column(name="id_feriado")
	@GeneratedValue
	private long id_feriado;
	
	
	@Column(name="tipo_feriado")
	@Enumerated(EnumType.STRING)
	private TipoFeriadoEnum TipoFeriado;
	
	
	@Column(name="dsc_feriado")
	private String dsc_feriado;
	
	
	@Column(name="dt_feriado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_feriado;


	public long getId_feriado() {
		return id_feriado;
	}


	public void setId_feriado(long id_feriado) {
		this.id_feriado = id_feriado;
	}


	public TipoFeriadoEnum getTipoFeriado() {
		return TipoFeriado;
	}


	public void setTipoFeriado(TipoFeriadoEnum tipoFeriado) {
		TipoFeriado = tipoFeriado;
	}


	public String getDsc_feriado() {
		return dsc_feriado;
	}


	public void setDsc_feriado(String dsc_feriado) {
		this.dsc_feriado = dsc_feriado;
	}


	public Date getDt_feriado() {
		return dt_feriado;
	}


	public void setDt_feriado(Date dt_feriado) {
		this.dt_feriado = dt_feriado;
	}
	
	
	
}
	