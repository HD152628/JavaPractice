/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 		|_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author	:insu
 * @version	: 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String databases){
		if(databases.equals(ORACLE_DATABASE))
			return new OracleDB();
		else if(databases.equals(SYBASE_DATABASE))
			return new SybaseDB();
		else
			return null;
	}
}
