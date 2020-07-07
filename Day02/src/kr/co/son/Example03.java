package kr.co.son;



/*
컬렉션 프레임워크

1. Collection : 모으다
2. Framework : 틀 -> 경기장이라고 설명

야구 프레임워크 -> 야구 경기장에서 야구 룰로 야구 경기를 진행

컬렉션 프레임워크 -> 자바가 준비한 객체를 모아낼 수 있는 룰로 객체를 모아낸다. 


 		  			   Collection(I)
	     List<E> 							  Set<E>
ArrayList<E>	LinkedList<E>	HashSet<E> 	  TreeSet<E>

		Map<K,V>
HashMap<K,V>	TreeMap<K,V>


List의 특징
- 원소가 저장되는 순서가 있다. 5-3-2-4-1 => 5-3-2-4-1  => 인덱스를 사용할 수 있다. 
- 중복된 원소를 저장할 수 있다. 

ArrayList<E> : 배열 기반 리스트
* 배열의 특징 : 배열의 길이는 불변... 2개짜리 배열을 만들면 1개가 저장되든, 2개가 저장되든 무조건 2개 만큼의 공간을 차지 
* 			 배열의 
* 

ArrayList와 LinkedList 는 사용하는 상황이 아예 다름 
ArrayList는 데이터가 자주 추가되는 로직에는 어울리지 않는다.  -> 추가되면 이전 리스트 삭제되고 새 리스트 생기는 방식으로 추가되기 때문에 
ArrayList는 배열 기반이기 때문에 참조가 빠르다. 데이터가 몇개가 있던 인덱스만 알고 있으면 해당 위치를 데이터를 바로 빼올 수가 있다. -> 목록을 만들 때 어울린다. 

채팅방처럼 유동적으로 변하는 구조는 LinkedList 쓰는게 좋음 
LinkedList는 데이터의 추가가 굉장히 빠르고 효율적이다. 
단점 : LinkedList의 인덱스틑 연결부를 몇 번 탈것인가를 의미한다. 
LinkedList는 목록을 만들고 사용자가 선택하는 형태로 만들기에는 적합하지 않다. 

Set - 집합
* 중복데이터 X
* 저장 순서 유지 X
- HashSet  ( 매우 빠른 검색속도 - Hash 알고리즘 )
- TreeSet  ( 개발자가 정한 정렬 알고리즘 (순서) )


Map 
- Key, Value를 집어 넣고 Key를 통해서 Value를 관리 (CRUD)

put("key", "value") => key 의 배치 방식에 따라서 HashMap과 TreeMap으로 나뉘게 된다. 
key : Set의 특징을 가지고 있음 
value : ArrayList의 특징을 가지고 있음 

Key의 배치를 hash알고리즘으로 하고 싶으면 HashMap 사용
		  Tree알고리즘으로 하고 싶으면 TreeMap 사용 




 */
public class Example03 {

	
}
