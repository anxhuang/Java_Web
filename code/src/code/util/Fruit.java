package code.util;

public class Fruit {
	
	//instance variables
	private String title;
	
	public Fruit(){
		
	}
	
	//for JSTL/JavaBean, the name of setter() "must" be "set+Name()"
	public void setTitle(String title){ //local variables
		this.title = title;
	}
	
	//for JSTL/JavaBean, the name of getter() "must" be "get+Name()"
	public String getTitle(){
		return this.title;
	}

}
