import java.util.ArrayList;
import java.util.List;

public class Line {
String descrip;
String lineName;
String lineAcro;
float lineLength;
String lineType;
String direction;
String start;
String end;
List<Object> Stations;
int numberOfStation;
int Linecapacity;

	public Line (String name, String acro, String type, String dir, float length, String strSta, String endSta, int numSta, int capSta, String descr ) {
		 descrip=descr;
		 lineName=name;
		 lineAcro=acro;
		 lineLength=length;
		 lineType=type;
		 direction=descr;
		 start=strSta;
		 end=endSta;
		 numberOfStation=numSta;
		 Linecapacity=capSta;
		 Stations =  new ArrayList<Object>();
}

}
