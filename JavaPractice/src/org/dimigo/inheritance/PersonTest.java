/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author	:insu
 * @version	: 1.0
 */
public class PersonTest {
	
	public static void main(String args[]){
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		
		System.out.println(p);
		System.out.println(k);
		System.out.println(j);
		System.out.println(c);
				
		System.out.println();
		
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		System.out.println();
		
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
	}
	
}
