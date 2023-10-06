package ex11;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;


public class LinkedListQueue {
	public static void main(String[] args) {
		//Queue<String> queue = new LinkedList<String>();			//LinkedList를 가장 많이 사용.
		//Queue<String> queue = new ArrayDeque<String>();
		Queue<String> queue = new LinkedTransferQueue<String>();	//결과는 똑같음.
		
		queue.add("Toy");
		queue.offer("Box");
		queue.offer("Robot");
		queue.offer("Toy");
		
		System.out.println(queue.poll());	//꺼내면서 버퍼 밖으로.
		System.out.println(queue.poll());	//선입선출
		
		System.out.println("=======================");
		
		for(String s : queue) {
			System.out.println(s); 		//들어온 순서대로 출력
		}
		
		System.out.println("=======================");
		
		for(String s : queue) {
			System.out.println(s); 		
		}
		
		System.out.println("=======================");
		
		System.out.println(queue.peek());	//다음에 출력할 대상.
	}
}
