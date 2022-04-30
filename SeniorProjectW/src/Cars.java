  
public class Cars {
	String car_type;
	String carsLine;
	String start;
	String end;
	String carCode;
	int positionX;
	int positionY;
	int carWeight;
	 
	 public Cars(String line, String type, String str, String en, String code, int w) {
		 	 car_type = type;
			 carsLine = line;
			 start = str;
			 end = en;
			 carCode = code;
			 carWeight = w;
			 
	 }
	 public void setPos(int x, int y) {
		 positionX=x;
		 positionY=y;
	 }
}
