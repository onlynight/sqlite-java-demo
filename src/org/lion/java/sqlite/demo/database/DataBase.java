package org.lion.java.sqlite.demo.database;

import org.lion.sqlite.SQLiteDataBase;

public class DataBase extends SQLiteDataBase{

	public static final String DB_NAME = "D://demo.sqlite";
	/**
	 * the package to scan the model
	 */
	private static final String PACKATE_TO_SCAN = "org.lion.java.sqlite.demo.model";
	
	public DataBase() {
		super(DB_NAME, PACKATE_TO_SCAN);
	}
	
}
