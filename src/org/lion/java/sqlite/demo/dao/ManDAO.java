package org.lion.java.sqlite.demo.dao;

import org.lion.java.sqlite.demo.model.Human;
import org.lion.sqlite.BasicDAO;
import org.lion.sqlite.SQLiteDataBase;

public class ManDAO extends BasicDAO<Human>{

	public static final String TABLE_NAME = "Man";
	
	public ManDAO(SQLiteDataBase database) {
		super(database, TABLE_NAME);
	}

}
