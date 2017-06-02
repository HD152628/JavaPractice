/**
 * 
 */
package org.dimigo.excepion;

/**
 * <pre>
 * org.dimigo.excepion
 * 		|_ Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author :insu
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;

	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}

	public void buytTicket(int age) throws Exception {
		try {
			if (age < limitAge) {
				throw new AgeCheckException(this);
			} else {
				System.out.println(this.title + " 즐감하세요.");
			}
		} catch (AgeCheckException ace) {
			throw ace;
		}
	}
}
