package org.lion.java.sqlite.demo.dao;

import org.lion.java.sqlite.demo.model.Monkey;
import org.lion.sqlite.BasicDAO;
import org.lion.sqlite.SQLiteDataBase;

public class MonkeyDAO extends BasicDAO<Monkey>{

	public static final String TABLE_NAME = Monkey.class.getSimpleName();
	
	public MonkeyDAO(SQLiteDataBase database) {
		super(database, TABLE_NAME);
	}
}
