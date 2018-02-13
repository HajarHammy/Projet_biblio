package com.dao.impl;

import com.bo.Rayon;
import com.dao.RayonDao;
import com.hajar.sos.dao.impl.GenericDaoImpl;

/**
 * 
 * Implémentation du DAO RayonDao. Cette classe hérite toutes les
 * fonctionnalités du DAO Generic en indiquant les valeurs de T et PK
 * 
 * 
 * @author boudaa
 *
 */
public class RayonDaoImpl extends GenericDaoImpl<Rayon, Long> implements
		RayonDao {

	public RayonDaoImpl() {

		// car on travail sur des objets de la classe Rayon, il y a des méthodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Rayon.class);
	}
}
