package com.raven.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.raven.springboot.web.app.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
}
