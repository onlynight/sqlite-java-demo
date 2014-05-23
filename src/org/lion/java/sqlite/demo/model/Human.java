package org.lion.java.sqlite.demo.model;

import org.lion.database.annotation.Column;
import org.lion.database.annotation.Table;
import org.lion.database.annotation.Tables;
import org.lion.java.sqlite.demo.dao.ManDAO;
import org.lion.java.sqlite.demo.dao.WomanDAO;

/**
 * support one class to multi tables
 * @author lion
 *
 */
@Tables( { @Table( ManDAO.TABLE_NAME ) , @Table( WomanDAO.TABLE_NAME ) } )
public class Human extends Animal{

	@Column( notnull=true )
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
