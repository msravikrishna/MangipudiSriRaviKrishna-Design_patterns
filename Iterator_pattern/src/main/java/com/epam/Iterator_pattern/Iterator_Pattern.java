package com.epam.Iterator_pattern;
//Behavioral Patterns

interface Initialize_Interface {
	public Iterator_Interface getIterator();
}

interface Iterator_Interface {
	public boolean hasNext();
	public Object next();
}
class Iterator_Methods implements Iterator_Interface {
	int index = 0;
	public static String details[] = {"Name : Raju","Age : 20" ,"Gender : Male","Name : Ramesh","Age : 22" ,"Gender : Male"};
	public boolean hasNext() {		
		if(index < details.length){
			return true;
		}
		return false;
	}
	public Object next() {
		if(this.hasNext()){
			return details[index++];
		}
		return null;
	}
}
class Initialize_Iterator implements Initialize_Interface {
	public Iterator_Interface getIterator() {
		return new Iterator_Methods();
	}
}
public class Iterator_Pattern {
	public static void main(String[] args) {
		Initialize_Iterator initialize_Iterator=new Initialize_Iterator();
		for(Iterator_Interface iter=initialize_Iterator.getIterator();iter.hasNext();){
			String name = (String)iter.next();
			System.out.println(name);
		} 
	}
}

