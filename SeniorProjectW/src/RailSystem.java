import java.util.List;

public class RailSystem {
	List<Line> Lines;
	List<ClassifYard> classifYards;
	List<IndusYard> indusYard;
	List<InterYard> interYard;
	public RailSystem() {
		
	}
	public void addLine(String name, String acro, String type, String dir, float length, String strSta, String endSta, int numSta, int capSta, String descr ) {
		Line temp = new Line(name, acro, type, dir,length, strSta, endSta, numSta, capSta, descr);
		Lines.add(temp);
	}
}
