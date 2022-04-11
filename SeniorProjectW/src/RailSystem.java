import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.ibm.icu.impl.number.AffixPatternProvider.Flags;

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
		if(type == "ClassificationYard") {
			System.out.print("testing enters");
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
	public void editStation(int index,String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String industreName, String descrip, String station1, String station2) {
		if(type == "ClassificationYard") {
			System.out.print("testing enters");
			classifYards.set(index, new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars)) ;
			
		}else
			if(type == "InterchangeYard") {
				interYard.set(index, new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2));
			}else
				if(type == "IndustrysupportYard") {
					indusYard.set(index, new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip));
				}
	}
	
	public void addCar(String line, String type, String str, String en, String code, float w) {
		Cars temp = new Cars(line,type,str,en,code,w);
		cars.add(temp);
	}
	
	public boolean searchLine(String lineN, JPanel pfound, JPanel pNoFound) {
		boolean flag = false;
		for (Line line : Lines) {
			if (line.lineName.equals(lineN) || line.lineAcro.equals(lineN)) {
				flag = true;
				break;
			}else {
				flag = false;
			}
		}
		if (flag) {
			System.out.print("got in the tru");
			pfound.setVisible(true);
			pNoFound.setVisible(false);
		}else {
			System.out.print("got in the false");
			pfound.setVisible(false);
			pNoFound.setVisible(true);
		}
		return flag;
	}
	public boolean searchStation(String stationN, String typeOfSt, int index,JPanel pfound, JPanel pNoFound , JPanel normal, JPanel industry, JPanel inter) {
		boolean flag = false;
		String typeSt = "";
		int  x = 0 ;
		for (InterYard st : interYard) {
			x++;
			if (st.stationName.equals(stationN) || st.stationAcro.equals(stationN)) {
				flag = true;
				typeSt = st.statType;
				index= x;
				break;
			}else {
				flag = false;
			}
		}
		x=0;
		for (ClassifYard st : classifYards) {
			System.out.print(st.stationName);
			x++;
			if (st.stationName.equals(stationN) || st.stationAcro.equals(stationN)) {
				System.out.print("Found calssyard");
				flag = true;
				typeSt = st.statType;
				index=  x;
				break;
			}else {
				flag = false;
			}
		}
		x=0;
		for (IndusYard st : indusYard) {
			x++;
			if (st.stationName.equals(stationN) || st.stationAcro.equals(stationN)) {
				flag = true;
				typeSt = st.statType;
				index=  x;
				break;
			}else {
				flag = false;
			}
		}
		if (flag) {
			pfound.setVisible(true);
			System.out.print("IIIIIII");
			if (typeSt == "ClassificationYard") {
				System.out.print("VVVVV");
				 pNoFound.setVisible(false);
				 normal.setVisible(true);
				 industry.setVisible(false);  
				 inter.setVisible(false);
			}else {
				if (typeSt == "InterchangeYard") {
					pNoFound.setVisible(false);
					 normal.setVisible(false);
					 industry.setVisible(false);  
					 inter.setVisible(true);
					
				}else {
					if (typeSt == "IndustrysupportYard") {
						pNoFound.setVisible(false);
						 normal.setVisible(false);
						 industry.setVisible(true);  
						 inter.setVisible(false);
					}
				}
			}
		}else {
			pfound.setVisible(false);
			pNoFound.setVisible(true);
			 normal.setVisible(true);
			 industry.setVisible(false);  
			 inter.setVisible(false);
		}
		typeOfSt = typeSt;
		return flag;
	}
	public void setTempStationData(String searchType,int index,
			String classTypeSelected,
			String stlineTemp,
			String typeTemp,
			String nameTemp,
			String acroTemp,
			String directTemp,
			String headTemp,
			String tailTemp, 
			int numLinesTemp,
			int numCarsTemp,
			String industreNameTemp,
			String descriptionTempStation,
			String station1Temp,
			String station2Temp) {
		if (searchType == ("ClassificationYard")) {
			 stlineTemp=classifYards.get(index).stationLine;
			 typeTemp=classifYards.get(index).statType;
			 nameTemp=classifYards.get(index).stationName;
			 acroTemp=classifYards.get(index).stationAcro;
			 directTemp=classifYards.get(index).stationDirection;
			 headTemp=classifYards.get(index).ahead;
			 tailTemp= classifYards.get(index).atail;
			 numLinesTemp=classifYards.get(index).numberLines;
			 numCarsTemp=classifYards.get(index).carsPerLine;
			 industreNameTemp="nothing";
			 descriptionTempStation="nothing";
			 station1Temp="nothing";
			 station2Temp="nothing";
		}
		if (searchType==( "InterchangeYard")) {
			 stlineTemp=interYard.get(index).stationLine;
			 typeTemp=interYard.get(index).statType;
			 nameTemp=interYard.get(index).stationName;
			 acroTemp=interYard.get(index).stationAcro;
			 directTemp=interYard.get(index).stationDirection;
			 headTemp=interYard.get(index).ahead;
			 tailTemp= interYard.get(index).atail;
			 numLinesTemp=interYard.get(index).numberLines;
			 numCarsTemp=interYard.get(index).carsPerLine;
			 industreNameTemp= "nothing";
			 descriptionTempStation="nothing";
			 station1Temp=interYard.get(index).station1;
			 station2Temp=interYard.get(index).station2;
		}
		if (searchType==("IndustrysupportYard")) {
			 stlineTemp=indusYard.get(index).stationLine;
			 typeTemp=indusYard.get(index).statType;
			 nameTemp=indusYard.get(index).stationName;
			 acroTemp=indusYard.get(index).stationAcro;
			 directTemp=indusYard.get(index).stationDirection;
			 headTemp=indusYard.get(index).ahead;
			 tailTemp= indusYard.get(index).atail;
			 numLinesTemp=indusYard.get(index).numberLines;
			 numCarsTemp=indusYard.get(index).carsPerLine;
			 industreNameTemp=indusYard.get(index).industryName;
			 descriptionTempStation=indusYard.get(index).descrip;
			 station1Temp="nothing";
			 station2Temp="nothing";
		}

		 
		
		
		
	}
	public void setTempLineData(String lineNameTemp, String lineAcroTemp,	float lineLengthTemp,	String lineTypeTemp, String directionTemp,	String descripTemp) {
		for (Line line : Lines) {
			if (line.lineName.equals(lineNameTemp) || line.lineAcro.equals(lineNameTemp)) {
				 descripTemp = line.descrip;
				 lineNameTemp =line.lineName;
				 lineAcroTemp =line.lineAcro;
				 lineLengthTemp =line.lineLength;
				 lineTypeTemp =line.lineType;
				 directionTemp =line.lineType;
				
				break;
			}
		}
		
	}
	public int getArrayIndex( String[] array , String selected) {
		int index = -1;
		for (int x = 0 ; x< array.length; x++) {
			if (array[x].equals(selected)) {
				index = x;
			}
		}
	return index;
	}
	public void printLineData() {
		for (Line line : Lines) {
			System.out.print(line.lineName +",  "+line.lineAcro);
		}
	}
	
}
