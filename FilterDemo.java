import java.util.*;
import java.util.function.*;


class FilterDemo<T>{

	List<T> list;
	
	
	List<T> filter(Predicate<T> predicate){
		 
		for (T element : this.list) {
		if (predicate.test(element)) {
			list.add(element);
		}
		}
		return this.list;
	}
	
	
	public static void main(String args[]){
		FilterDemo<String> s = new FilterDemo<>();
		s.list = new ArrayList<>();
		s.list.addAll(Arrays.asList("hi", "he","hello", "him"));
		List<String> newList = s.filter((t)-> t.length()==2);
		System.out.println(newList);
	}
}

