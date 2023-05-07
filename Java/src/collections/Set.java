package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Set {
public static void main(String[] args) {
	List<Character> characters=List.of('a','z','a','b','z','f');
	//unique-Set
	//Tree
	//Hash
	//LinkedHash
	
	TreeSet<Character> treeSet=new TreeSet<Character>(characters);
	System.out.println(treeSet);
	
	LinkedHashSet<Character> linkedHashSet=new LinkedHashSet<Character>(characters);
	System.out.println(linkedHashSet);
	
	HashSet<Character> hashSet=new HashSet<Character>(characters);
	System.out.println(hashSet);
}
}
