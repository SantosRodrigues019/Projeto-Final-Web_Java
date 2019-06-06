package br.com.etechoracio.feriadoapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.etechoracio.feriados.Cadastrar_Feriado;

public interface FeriadoDAO extends JpaRepository<Cadastrar_Feriado, Long>{

}

