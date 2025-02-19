
public class Drink {
		private int type;
		private char size;
		
	
	Drink(int type, char size){
		this.type=type;
		this.size = size;
	}
	Drink(){
		this(0,' ');
	}
	public String getTypeName() {
		if (type==1) {
			return "Hots";
		}else if (type==2) {
		return "cold";
		}else {
		return null;
		}
	}
	public int getTypePrice() {
		
	}
	public String getSizeName() {
		
	}
	public int getSizePrice() {
		
	}
	public int getTotalPrice() {
		
	}
}
