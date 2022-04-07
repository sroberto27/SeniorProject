import java.util.ArrayList;
import java.util.List;

public class RailSystem {
	List<Line> Lines;
	List<ClassifYard> classifYards;
	List<IndusYard> indusYard;
	List<InterYard> interYard;
	List<Cars> cars;
	public RailSystem() {
		Lines = new ArrayList<Line>();
		classifYards = new ArrayList<ClassifYard>();
		indusYard = new ArrayList<IndusYard>();
		interYard = new ArrayList<InterYard>();
		cars = new ArrayList<Cars>();
	}
	public void addLine(String name, String acro, String type, String dir, float length, String strSta, String endSta, int numSta, int capSta, String descr ) {
		Line temp = new Line(name, acro, type, dir,length, strSta, endSta, numSta, capSta, descr);
		Lines.add(temp);
	}
	public void addStation(String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String industreName, String descrip, String station1, String station2) {
		if(type == "ClassificatioYard") {
			ClassifYard temp = new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars);
			classifYards.add(temp);
		}else
			if(type == "InterchangeYard") {
				InterYard temp = new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2);
				interYard.add(temp);
			}else
				if(type == "IndustrysupportYard") {
					IndusYard temp = new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip);
					indusYard.add(temp);
				}
	}
	
	public void addCar(String line, String type, String str, String en, String code, float w) {
		Cars temp = new Cars(line,type,str,en,code,w);
		cars.add(temp);
	}
	
}
