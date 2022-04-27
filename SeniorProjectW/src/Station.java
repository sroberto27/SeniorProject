
public class Station {
	String stationLine;
	String statType;
	String stationName;
	String stationAcro;
	String ahead;
	String atail;
	String stationDirection;
	int numberLines;
	int carsPerLine;
	float maxCapacity;
	Cars LinesArr[][];
	public Station(String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars) {
		stationLine = stline;
		statType = type;
		stationName = name;
		stationAcro = acro;
		stationDirection = direct;
		ahead = head;
		atail = tail;
		numberLines = numLines;
		carsPerLine= numCars;
		maxCapacity = numCars * numCars;
		LinesArr = new Cars [numLines][numCars];
	}
}
