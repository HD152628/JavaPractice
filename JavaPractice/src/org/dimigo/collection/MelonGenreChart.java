/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author	:insu
 * @version	: 1.0
 */
public class MelonGenreChart {
	public static void main(String args[]){
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> balladArrayList = new ArrayList<>();
		List<Music> danceArrayList = new ArrayList<>();
		
		balladArrayList.add(new Music("팔레트","아이유"));
		danceArrayList.add(new Music("I LUV IT","PSY"));
		danceArrayList.add(new Music("맞지?","언니쓰"));
		
		map.put("발라드",balladArrayList);
		map.put("댄스", danceArrayList);
		
		System.out.println("--<<멜론 장르별 챠트>>--");
		printMap(map);
		
		System.out.println("--<<댄스 2위 곡 변경>>--");
		danceArrayList.set(1,new Music("SIGNAL","트와이스"));
		map.put("댄스", danceArrayList);
		printMap(map);
		
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		danceArrayList.remove(0);
		map.put("댄스", danceArrayList);
		printMap(map);
		
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
	}
	public static void printMap(Map<String,List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			int cnt = 1;
			for(Music music : map.get(key)){
				System.out.println(cnt + ". " + music);
				cnt++;
			}
		}
		System.out.println();
	}
}
