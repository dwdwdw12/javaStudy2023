package ex01;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 미국환율 {
	public static void main(String[] args) throws IOException {
		
		Document doc 
		= Jsoup.connect("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%AF%B8%EA%B5%AD+%ED%99%98%EC%9C%A8").get();
		
		//System.out.println(doc); 	//f12의 페이지 소스.
		
		Elements value = doc.getElementsByAttributeValue("class", "input_box _input_box");
		System.out.println(value);
		
		System.out.println(value.get(0).text());
		System.out.println(value.get(1).text());		
		
		Element value2 = doc.getElementById("ds_to_money");
//		System.out.println(value2);
		
		
		
		Elements value3 = doc.getElementsByAttributeValue("class", "recite _recite");
//		System.out.println(value3);
		
		
		
	}
}
