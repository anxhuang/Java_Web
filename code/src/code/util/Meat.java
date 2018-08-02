package code.util;

public class Meat {
	
	private	String	title;
	private Boolean	roasted=false;
	
	public	void	Meat(){
		
	}
	
	public	void	setTitle(String	title){
		this.title = title;
	}

	public	String	getTitle(){
		return	this.title;
	}
	
	public	void	setRoasted(Boolean	roasted){
		this.roasted = roasted;
	}
	
	public	boolean	isRoasted(){
		return	this.roasted;
	}
}
