/**
 * 
 */
package org.dimigo.excepion;

/**
 * <pre>
 * org.dimigo.excepion
 * 		|_ AgeCheckException
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author	:insu
 * @version	: 1.0
 */
public class AgeCheckException extends Exception{
	public AgeCheckException(){
		
	}
	
	public AgeCheckException(Movie movie){
		super(movie.getTitle()+"은/는 " + movie.getLimitAge() +"세 이상 관람가 입니다.");
	}
}
