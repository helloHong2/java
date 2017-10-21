package ex07;

public enum eList {
	
	BLACK("BLACK"),RED("RED"),BLUE("BLUE"),GREEN("GREEN"),CYAN("CYAN"),MAGENTA("MAGENTA"),YELLOW("YELLOW"),WHITE ("WHITE");

	private String color;
	
	eList(String color){
		 this.color = color;
	}
	 
    public String getColor(){
       return this.color;
    }
    public eList getRed(){
        return eList.RED;
    }
    public eList getGreen(){
        return eList.GREEN;
    }
    public eList getBlue(){
        return eList.BLUE;
    }
}
