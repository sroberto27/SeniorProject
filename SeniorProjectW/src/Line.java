import java.util.ArrayList;
import java.util.List;

public class Line {
String descrip;
String lineName;
String lineAcro;
int lineLength;
String lineType;
String direction;
String start;
String end;
List<Object> Stations;
int numberOfStation;
int Linecapacity;

	public Line (String name, String acro, String type, String dir, int length, String strSta, String endSta, int numSta, int capSta, String descr ) {
		 descrip=descr;
		 lineName=name;
		 lineAcro=acro;
		 lineLength=length;
		 lineType=type;
		 direction=dir;
		 start=strSta;
		 end=endSta;
		 numberOfStation=numSta;
		 Linecapacity=capSta;
		 Stations =  new ArrayList<Object>();
}
	public void setStations(List<Object> Stats) {
		Stations = Stats;
	}

}
