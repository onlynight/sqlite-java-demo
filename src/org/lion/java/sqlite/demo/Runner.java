package org.lion.java.sqlite.demo;

import java.util.List;

import org.lion.java.sqlite.demo.dao.ManDAO;
import org.lion.java.sqlite.demo.database.DataBase;
import org.lion.java.sqlite.demo.model.Human;

public class Runner {

	public static void main(String[] args) {
		
		DataBase dataBase = new DataBase();
		ManDAO dao = new ManDAO(dataBase);
		insert(dao);
//		update(dao);
//		select(dao);
//		delete(dao);
//		insert(dao);
//		count(dao);
		dataBase.close();
	}
	
	public static void insert( ManDAO dao ){
		Human man = new Human();
		man.setName( "张文达" );
		man.setPhone( "18990140382" );
		dao.insert(man);
	}
	
	public static void delete( ManDAO dao ){
		Human man = new Human();
		man.setId( 1 );
		dao.delete(man);
	}
	
	public static void update( ManDAO dao ){
		Human man = new Human();
		man.setId( 1 );
		man.setName( "唯夜" );
		man.setPhone( "18990140382" );
		dao.update(man);
	}
	
	public static void select( ManDAO dao ){
//		List<Human> res = dao.select( "name" , "张文达" );
		Human entity = new Human();
		entity.setId( 2 );
		List<Human> res = dao.select(entity);
		for (Human human : res) {
			System.out.println( human.getName() );
		}
	}
	
	public static void count( ManDAO dao ){
		System.out.println( dao.count() );
	}
}
