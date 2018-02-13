package com.dao;

import java.util.List;

import com.bo.Lecteur;
import com.hajar.sos.dao.exceptions.EntityNotFoundException;
import com.hajar.sos.generic.dao.GenericDao;

public interface LecteurDAO extends GenericDao<Lecteur, Long> {
	
	public List<Lecteur> getLecteurByName(String pName)  throws EntityNotFoundException;
	
	
	
}
