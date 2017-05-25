/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 		|_ OracleDB
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author	:insu
 * @version	: 1.0
 */
public class SybaseDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println("Sybase DB 저장");
	}

	@Override
	public void search() {
		System.out.println("Sybase DB 조회");
	}

	@Override
	public void update() {
		System.out.println("Sybase DB 변경");
	}

	@Override
	public void delete() {
		System.out.println("Sybase DB 삭제");
		
	}
	
}
