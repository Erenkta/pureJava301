package pureJava301.Java8News.StreamAPI;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain3 {
	public static void main(String[] args) {
		ArrayList<Ogrenci> arrayList = new ArrayList();
		arrayList.add(new Ogrenci(1,"Ali",15));
		arrayList.add(new Ogrenci(2,"Ahmet",17));
		arrayList.add(new Ogrenci(3,"Yasar",19));
		arrayList.add(new Ogrenci(4,"Talip",12));
		arrayList.add(new Ogrenci(5,"Tayyar",15));
		arrayList.add(new Ogrenci(6,"Addo",15));
		arrayList.add(new Ogrenci(7,"Furkan",19));
		arrayList.add(new Ogrenci(8,"Faruk",17));
		
		List<Ogrenci> collect = arrayList.stream()
		.filter((t) -> t.getYas()>16 )
		.sorted( (t1,t2) -> t1.getYas() - t2.getYas())
		.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		System.out.println(" --- ---- --- ---- ---- ---- --- ----- ---- ---- ---- ----");
		Map<Integer,List<Ogrenci>> gruplama = //Gruplama yaptık
				arrayList.stream()
				.collect(Collectors.groupingBy((o) -> o.getYas()));
		Set<Integer> keySet = gruplama.keySet();
		
		Iterator iterator = keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " " + gruplama.get(iterator.next()));
		}
		
		double yasOrt =arrayList.stream()
		.collect(Collectors.averagingInt( o-> o.getYas()));
		System.out.println(yasOrt); //Collectors class'ına bak
		
		IntSummaryStatistics statics = arrayList.stream()
				.collect(Collectors.summarizingInt(o -> o.getYas()));
		System.out.println(" --- ---- --- ---- ---- ---- --- ----- ---- ---- ---- ----");
		System.out.println(statics);
				
		
	}
}
