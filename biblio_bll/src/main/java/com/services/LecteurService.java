package com.services;

import com.bo.Lecteur;
import com.hajar.sos.dao.exceptions.EntityNotFoundException;

public interface LecteurService {

	public void addLecteur(Lecteur pLecteur);

	public void deleteLecteur(Long idLecteur) throws EntityNotFoundException;

	public void findLecteurByName(String pName) throws EntityNotFoundException;

}
