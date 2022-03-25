
public class Station {
	Line stationLine;
	String statType;
	String stationName;
	String stationAcro;
	Station ahead;
	Station atail;
	String stationDirection;
	int numberLines;
	int carsPerLine;
	float maxCapacity;
	Cars LinesArr[][];
	public Station(Line stline, String type, String name, String acro,String direct, Station head, Station tail, int numLines, int numCars) {
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
