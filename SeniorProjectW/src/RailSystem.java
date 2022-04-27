import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.eclipse.swt.internal.win32.CREATESTRUCT;

import com.ibm.icu.impl.number.AffixPatternProvider.Flags;

public class RailSystem extends GlobalVars{
	List<Line> Lines;
	public String searchTypeGlobalString="";
	public String searchStNameGlobalString="";
	public String searchLnNameGlobalString="";
	public int searchIndexGlobalIntStation=-1;
	public int searchIndexGlobalIntLine=-1;
	public int carGlobalXindex=-1;
	public int carGlobalYindex=-1;
	
	public RailSystem() {
		Lines = new ArrayList<Line>();
	}
	public void addLine(String name, String acro, String type, String dir, float length, String strSta, String endSta, int numSta, int capSta, String descr ) {
		Line temp = new Line(name, acro, type, dir,length, strSta, endSta, numSta, capSta, descr);
		Lines.add(temp);
	}
	public void editLine(int index, String name, String acro, String type, String dir, float length, String strSta, String endSta, int numSta, int capSta, String descr){
		
		Lines.set(index, new Line(name, acro, type, dir,length, Lines.get(index).start, Lines.get(index).end, Lines.get(index).numberOfStation, capSta, descr)) ;
	
	}
	public void deleteLine(int index) {
		Lines.remove(index);
	}
	public int getLineIndex(String name) {
		int x=0;
		for(Line line : Lines) {
			if (line.lineName.equals(name)) {
				break;
			}
			x++;
		}
		return x;
	}
	public void addStation(String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String industreName, String descrip, String station1, String station2) {
		if(type == "ClassificationYard") {
			//System.out.print("testing enters");
			ClassifYard temp = new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars);
System.out.print("Index of add station: "+ getLineIndex(stline));
			Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
			Lines.get(getLineIndex(stline)).numberOfStation+=1;
		}else
			if(type == "InterchangeYard") {
				InterYard temp = new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2);
				Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
				Lines.get(getLineIndex(stline)).numberOfStation+=1;
			}else
				if(type == "IndustrysupportYard") {
					IndusYard temp = new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip);
					Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
					Lines.get(getLineIndex(stline)).numberOfStation+=1;
				}
	}
	// have to modify this to work with the lines.stations
	public void editStation(int index,String namelook, String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String industreName, String descrip, String station1, String station2) {
//		if(type == "ClassificationYard") {
//			//System.out.print("testing enters");
//			classifYards.set(index, new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars)) ;
//			
//		}else
//			if(type == "InterchangeYard") {
//				interYard.set(index, new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2));
//			}else
//				if(type == "IndustrysupportYard") {
//					indusYard.set(index, new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip));
//				}
		if(type == "ClassificationYard") {
			//System.out.print("testing enters");
			ClassifYard temp = new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars);

			
			int idx = getStationIndex(namelook,Lines.get(getLineIndex(stline)));
		//	System.out.print("Index line of add station: "+ getLineIndex(stline));
		//	System.out.print("Index of add station: "+ idx);
			Lines.get(getLineIndex(stline)).Stations.add(idx,temp);
			Lines.get(getLineIndex(stline)).Stations.remove(idx+1);
		}else
			if(type == "InterchangeYard") {
				InterYard temp = new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2);

				int idx = getStationIndex(namelook,Lines.get(getLineIndex(stline)));
				Lines.get(getLineIndex(stline)).Stations.add(idx,temp);
				Lines.get(getLineIndex(stline)).Stations.remove(idx+1);
			}else
				if(type == "IndustrysupportYard") {
					IndusYard temp = new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip);

					int idx = getStationIndex(namelook,Lines.get(getLineIndex(stline)));
					Lines.get(getLineIndex(stline)).Stations.add(idx,temp);
					Lines.get(getLineIndex(stline)).Stations.remove(idx+1);
				}
	}
	public void deleteStation(int index, String stline, String type,String name) {
//		if(type == "ClassificationYard") {
//			//System.out.print("testing enters");
//			classifYards.remove(index) ;
//			
//		}else
//			if(type == "InterchangeYard") {
//				interYard.remove(index);
//			}else
//				if(type == "IndustrysupportYard") {
//					indusYard.remove(index);
//				}
		if(type == "ClassificationYard") {

			//testing to be deleted
			//classifYards.remove(index);
//System.out.print("Index of add station: "+ getLineIndex(stline));
			Lines.get(getLineIndex(stline)).Stations.remove(getStationIndex(name,Lines.get(getLineIndex(stline))));
			Lines.get(getLineIndex(stline)).numberOfStation-=1;
		}else
			if(type == "InterchangeYard") {
				//testing to be deleted
			//	interYard.remove(index) ;
				Lines.get(getLineIndex(stline)).Stations.remove(getStationIndex(name,Lines.get(getLineIndex(stline))));
				Lines.get(getLineIndex(stline)).numberOfStation-=1;
			}else
				if(type == "IndustrysupportYard") {
					//testing to be deleted
				//	indusYard.remove(index);
					Lines.get(getLineIndex(stline)).Stations.remove(getStationIndex(name,Lines.get(getLineIndex(stline))));
					Lines.get(getLineIndex(stline)).numberOfStation-=1;
				}
	}
	public int getStationIndex(String name, Line line) {
		int x=0;
//		System.out.print(name+ "  --nameeeee");
		for(Object tempObject : line.Stations) {
			if (tempObject.getClass() == InterYard.class) {
				InterYard tempInterYard = (InterYard) tempObject;
				if (tempInterYard.stationName.equals(name)) {
					return x;
				}
				
			}
			if (tempObject.getClass() == IndusYard.class) {
				IndusYard tempIndusYard= (IndusYard) tempObject;
				if (tempIndusYard.stationName.equals(name)) {
					return x;
				}
			}
			if (tempObject.getClass() == ClassifYard.class) {
				ClassifYard tempClassifYard = (ClassifYard) tempObject;
//				System.out.print("\n found station: " + x+" name: "+tempClassifYard.stationName);
				if (tempClassifYard.stationName.equals(name)) {
	//				System.out.print("\n found station");
					return x;
				}
			}
			
		x++;}
		return x;
	}
	public void printCarsInSatation(String name, Line line) {
		for(Object tempObject : line.Stations) {
			if (tempObject.getClass() == InterYard.class) {
				InterYard tempInterYard = (InterYard) tempObject;
				if (tempInterYard.stationName.equals(name)) {
					System.out.print("name of station inter print: "+tempInterYard.stationName+"\n");
					for(int x=0; x< tempInterYard.numberLines;x++) {
						for(int y=0;y<tempInterYard.carsPerLine;y++) {
							if(tempInterYard.LinesArr[x][y]!=null)
							System.out.print("S:"+tempInterYard.LinesArr[x][y].start+" C:"+tempInterYard.LinesArr[x][y].carCode + " E:"+tempInterYard.LinesArr[x][y].end+ " -- ");
						}
						System.out.print("\n");
					}
					break;
				}
				
			}
			if (tempObject.getClass() == IndusYard.class) {
				IndusYard tempIndusYard= (IndusYard) tempObject;
				if (tempIndusYard.stationName.equals(name)) {
					System.out.print("name of station industry print: "+tempIndusYard.stationName+"\n");
					for(int x=0; x< tempIndusYard.numberLines;x++) {
						for(int y=0;y<tempIndusYard.carsPerLine;y++) {
							if(tempIndusYard.LinesArr[x][y]!=null)
								System.out.print("S:"+tempIndusYard.LinesArr[x][y].start+" C:"+tempIndusYard.LinesArr[x][y].carCode + " E:"+tempIndusYard.LinesArr[x][y].end+ " -- ");
						}
						System.out.print("\n");
					}
					break;
				}
			}
			if (tempObject.getClass() == ClassifYard.class) {
				ClassifYard tempClassifYard = (ClassifYard) tempObject;
				if (tempClassifYard.stationName.equals(name)) {
					System.out.print("name of station classification print: "+tempClassifYard.stationName+"\n");
					for(int x=0; x< tempClassifYard.numberLines;x++) {
						for(int y=0;y<tempClassifYard.carsPerLine;y++) {
							if(tempClassifYard.LinesArr[x][y]!=null)
								System.out.print("S:"+tempClassifYard.LinesArr[x][y].start+" C:"+tempClassifYard.LinesArr[x][y].carCode + " E:"+tempClassifYard.LinesArr[x][y].end+ " -- ");
						}
						System.out.print("\n");
					}
					break;
				}
			}
		}
	}
	public void SortCars(String name, Line line) {
		for(Object tempObject : line.Stations) {
			if (tempObject.getClass() == InterYard.class) {
				InterYard tempInterYard = (InterYard) tempObject;
				if (tempInterYard.stationName.equals(name)) {
					for(int x=0; x< tempInterYard.numberLines;x++) {
						for (int i = 0; i < tempInterYard.carsPerLine - 1; i++) {
				            for (int j = 0; j < tempInterYard.carsPerLine - i - 1; j++) {
				            	 if (tempInterYard.LinesArr[x][j]!=null && tempInterYard.LinesArr[x][j+1]!=null ) {
				            		 if (getStationIndex(tempInterYard.LinesArr[x][j].end, line) > getStationIndex(tempInterYard.LinesArr[x][j + 1].end, line)) {
				                    // swap arr[j+1] and arr[j]
				                    Cars temp = tempInterYard.LinesArr[x][j];
				                    tempInterYard.LinesArr[x][j] = tempInterYard.LinesArr[x][j + 1];
				                    tempInterYard.LinesArr[x][j + 1] = temp;
				                    }
				                }
				            }
						}
				    }
				Lines.get(getLineIndex(line.lineName)).Stations.set(getStationIndex(name, line), tempInterYard);
					break;
				}
				
			}
			if (tempObject.getClass() == IndusYard.class) {
				IndusYard tempIndusYard= (IndusYard) tempObject;
				if (tempIndusYard.stationName.equals(name)) {
					for(int x=0; x< tempIndusYard.numberLines;x++) {
						for (int i = 0; i < tempIndusYard.carsPerLine - 1; i++) {
				            for (int j = 0; j < tempIndusYard.carsPerLine - i - 1; j++) {
				            	if (tempIndusYard.LinesArr[x][j]!=null && tempIndusYard.LinesArr[x][j+1]!=null ) {
				            		if (getStationIndex(tempIndusYard.LinesArr[x][j].end, line) > getStationIndex(tempIndusYard.LinesArr[x][j + 1].end, line)) {
				                    // swap arr[j+1] and arr[j]
				                    Cars temp = tempIndusYard.LinesArr[x][j];
				                    tempIndusYard.LinesArr[x][j] = tempIndusYard.LinesArr[x][j + 1];
				                    tempIndusYard.LinesArr[x][j + 1] = temp;
				                    }
				            	}
				            }
						}
				    }
				Lines.get(getLineIndex(line.lineName)).Stations.set(getStationIndex(name, line), tempIndusYard);
					break;
				}
			}
			if (tempObject.getClass() == ClassifYard.class) {
				ClassifYard tempClassifYard = (ClassifYard) tempObject;
				if (tempClassifYard.stationName.equals(name)) {
					for(int x=0; x< tempClassifYard.numberLines;x++) {
						for (int i = 0; i < tempClassifYard.carsPerLine - 1; i++) {
				            for (int j = 0; j < tempClassifYard.carsPerLine - i - 1; j++) {
				                if (tempClassifYard.LinesArr[x][j]!=null && tempClassifYard.LinesArr[x][j+1]!=null ) {
				                    // swap arr[j+1] and arr[j]
				                	if( getStationIndex(tempClassifYard.LinesArr[x][j].end, line) > getStationIndex(tempClassifYard.LinesArr[x][j + 1].end, line)) {
				                    Cars temp = tempClassifYard.LinesArr[x][j];
				                    tempClassifYard.LinesArr[x][j] = tempClassifYard.LinesArr[x][j + 1];
				                    tempClassifYard.LinesArr[x][j + 1] = temp;
				                	}
				                }
				            }
						}
				    }
				Lines.get(getLineIndex(line.lineName)).Stations.set(getStationIndex(name, line), tempClassifYard);
					break;
				}
			}
			
		}
	}
	public String addCar(String line, String type, String str, String en, String code, float w) {
		Cars temp = new Cars(line,type,str,en,code,w);

		Object temObject = Lines.get(getLineIndex(line)).Stations.get(getStationIndex(str, Lines.get(getLineIndex(line))));
		boolean flag =false;
		String rtString="";
		if (temObject.getClass() == InterYard.class) {
			InterYard tempInterYard = (InterYard) temObject;
			for(int x=0; x<tempInterYard.numberLines; x++) {
				for(int y=0; y<tempInterYard.carsPerLine;y++ ) {
					if (tempInterYard.LinesArr[x][y] == null) {
						flag =true;
						tempInterYard.LinesArr[x][y]=temp;
						break;
					}
					
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				int position = getStationIndex(str, Lines.get(getLineIndex(line)));
				Lines.get(getLineIndex(line)).Stations.add(position,tempInterYard);
				Lines.get(getLineIndex(line)).Stations.remove(position+1);
				rtString = "car Added to the station!";
			}else {
				rtString="Not enough Space in the Station";
			}
			
		}
		if (temObject.getClass() == IndusYard.class) {
			IndusYard tempIndusYard= (IndusYard) temObject;
			for(int x=0; x<tempIndusYard.numberLines; x++) {
				for(int y=0; y<tempIndusYard.carsPerLine;y++ ) {
					if (tempIndusYard.LinesArr[x][y] == null) {
						flag =true;
						tempIndusYard.LinesArr[x][y]=temp;
						break;
					}
					
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				int position = getStationIndex(str, Lines.get(getLineIndex(line)));
				Lines.get(getLineIndex(line)).Stations.add(position,tempIndusYard);
				Lines.get(getLineIndex(line)).Stations.remove(position+1);
				rtString = "car Added to the station!";
			}else {
				rtString="Not enough Space in the Station";
			}
		}
		if (temObject.getClass() == ClassifYard.class) {
			ClassifYard tempClassifYard = (ClassifYard) temObject;
			for(int x=0; x<tempClassifYard.numberLines; x++) {
				for(int y=0; y<tempClassifYard.carsPerLine;y++ ) {
					if (tempClassifYard.LinesArr[x][y] == null) {
						flag =true;
						tempClassifYard.LinesArr[x][y]=temp;
						break;
					}
					
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				int position = getStationIndex(str, Lines.get(getLineIndex(line)));
				Lines.get(getLineIndex(line)).Stations.add(position,tempClassifYard);
				Lines.get(getLineIndex(line)).Stations.remove(position+1);
				rtString = "car Added to the station!";
			}else {
				rtString="Not enough Space in the Station";
			}
		}
		printCarsInSatation(str, Lines.get(getLineIndex(line)));
		SortCars(str, Lines.get(getLineIndex(line)) );
		System.out.print("Sorted cars------------------ \n");
		printCarsInSatation(str, Lines.get(getLineIndex(line)));
		return rtString;
		
	}
	
	public boolean searchLine(String lineN, JPanel pfound, JPanel pNoFound) {
		boolean flag = false;
		int x=0;
		for (Line line : Lines) {
			if (line.lineName.equals(lineN) || line.lineAcro.equals(lineN)) {
				lineNameTemp = line.lineName;
				searchIndexGlobalIntLine=x;
				flag = true;
				break;
			}else {
				flag = false;
			}
		x++;
		}
		if (flag) {
			//System.out.print("got in the tru");
			pfound.setVisible(true);
			pNoFound.setVisible(false);
		}else {
			//System.out.print("got in the false");
			pfound.setVisible(false);
			pNoFound.setVisible(true);
		}
		return flag;
	}
	//change this to use line.station//Change this to lines.stations----------------------------------------------------------
	public boolean searchStationToDelete(String stationN, String typeOfSt, JPanel pfound, JPanel pNoFound ) {
		boolean flag = false;
		int x=0;
		for(Line line: Lines ) {
			for(Object tempObject : line.Stations) {
				if (tempObject.getClass() == InterYard.class) {
					InterYard tempInterYard = (InterYard) tempObject;
					if (tempInterYard.stationName.equals(stationN)||tempInterYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempInterYard.statType;
						searchStNameGlobalString = tempInterYard.stationName;
						searchLnNameGlobalString = tempInterYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
					
				}
				if (tempObject.getClass() == IndusYard.class) {
					IndusYard tempIndusYard= (IndusYard) tempObject;
					if (tempIndusYard.stationName.equals(stationN)||tempIndusYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempIndusYard.statType;
						searchStNameGlobalString = tempIndusYard.stationName;
						searchLnNameGlobalString = tempIndusYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
				}
				if (tempObject.getClass() == ClassifYard.class) {
					ClassifYard tempClassifYard = (ClassifYard) tempObject;
					if (tempClassifYard.stationName.equals(stationN)||tempClassifYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempClassifYard.statType;
						searchStNameGlobalString = tempClassifYard.stationName;
						searchLnNameGlobalString = tempClassifYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
				}
				
			x++;
			}
			if (flag) {
				break;
			}
		}
		if (flag) {
			pfound.setVisible(true);
			//System.out.print("IIIIIII");
			if (searchTypeGlobalString == "ClassificationYard") {
				//System.out.print("VVVVV");
				 pNoFound.setVisible(false);
			}else {
				if (searchTypeGlobalString == "InterchangeYard") {
					pNoFound.setVisible(false);
					
				}else {
					if (searchTypeGlobalString == "IndustrysupportYard") {
						pNoFound.setVisible(false);
					}
				}
			}
		}else {
			x=-1;
			pfound.setVisible(false);
			pNoFound.setVisible(true);
		}
		return flag;
	}

	public boolean searchStation(String stationN, String typeOfSt, JPanel pfound, JPanel pNoFound , JPanel normal, JPanel industry, JPanel inter) {
//		for ( x=0; x< interYard.size();x++) {
//			if (interYard.get(x).stationName.equals(stationN) || interYard.get(x).stationAcro.equals(stationN)) {
//				flag = true;
//				typeSt = interYard.get(x).statType;
//				
//				searchIndexGlobalIntStation=x;
//				break;
//			}
//		}
//		for ( x=0; x< classifYards.size();x++ ) {
//			////System.out.print(classifYards.get(x).stationName+" index: "+ x+"\n");
//			if (classifYards.get(x).stationName.equals(stationN) || classifYards.get(x).stationAcro.equals(stationN)) {
//				System.out.print("Found calssyard");
//				flag = true;
//				typeSt =classifYards.get(x).statType;
//				
//				searchIndexGlobalIntStation=x;
//				break;
//			}
//		}
//		for ( x=0; x< indusYard.size();x++  ) {
//			if (indusYard.get(x).stationName.equals(stationN) || indusYard.get(x).stationAcro.equals(stationN)) {
//				flag = true;
//				typeSt = indusYard.get(x).statType;
//				
//				searchIndexGlobalIntStation=x;
//				break;
//			}
//		}
		boolean flag = false;
		int x=0;
		for(Line line: Lines ) {
			for(Object tempObject : line.Stations) {
				if (tempObject.getClass() == InterYard.class) {
					InterYard tempInterYard = (InterYard) tempObject;
					if (tempInterYard.stationName.equals(stationN)||tempInterYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempInterYard.statType;
						searchStNameGlobalString = tempInterYard.stationName;
						searchLnNameGlobalString = tempInterYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
					
				}
				if (tempObject.getClass() == IndusYard.class) {
					IndusYard tempIndusYard= (IndusYard) tempObject;
					if (tempIndusYard.stationName.equals(stationN)||tempIndusYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempIndusYard.statType;
						searchStNameGlobalString = tempIndusYard.stationName;
						searchLnNameGlobalString = tempIndusYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
				}
				if (tempObject.getClass() == ClassifYard.class) {
					ClassifYard tempClassifYard = (ClassifYard) tempObject;
					if (tempClassifYard.stationName.equals(stationN)||tempClassifYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempClassifYard.statType;
						searchStNameGlobalString = tempClassifYard.stationName;
						searchLnNameGlobalString = tempClassifYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
				}
				
			x++;
			}
			if (flag) {
				break;
			}
		}
		if (flag) {
			pfound.setVisible(true);
			//System.out.print("IIIIIII");
			if (searchTypeGlobalString == "ClassificationYard") {
				//System.out.print("VVVVV");
				 pNoFound.setVisible(false);
				 normal.setVisible(true);
				 industry.setVisible(false);  
				 inter.setVisible(false);
			}else {
				if (searchTypeGlobalString == "InterchangeYard") {
					pNoFound.setVisible(false);
					 normal.setVisible(false);
					 industry.setVisible(false);  
					 inter.setVisible(true);
					
				}else {
					if (searchTypeGlobalString == "IndustrysupportYard") {
						pNoFound.setVisible(false);
						 normal.setVisible(false);
						 industry.setVisible(true);  
						 inter.setVisible(false);
					}
				}
			}
		}else {
			x=-1;
			pfound.setVisible(false);
			pNoFound.setVisible(true);
			 normal.setVisible(true);
			 industry.setVisible(false);  
			 inter.setVisible(false);
		}
		return flag;
	}
	
	public void setTempStationData(String searchType,int index, String stName, String lnName) {
		//System.out.print(" set search typeeeeee:  "+searchType);
		//System.out.print("set indexxxxxx: "+index);
		if (searchType == ("ClassificationYard")) {
			//System.out.print("111111");
			
			ClassifYard temp=(ClassifYard)Lines.get(getLineIndex(lnName)).Stations.get(getStationIndex(stName, Lines.get(getLineIndex(lnName))));
			 stlineTemp=temp.stationLine;
			 typeTemp=temp.statType;
			 nameTemp=temp.stationName;
			 acroTemp=temp.stationAcro;
			 directTemp=temp.stationDirection;
			 headTemp=temp.ahead;
			 tailTemp= temp.atail;
			 numLinesTemp=temp.numberLines;
			 numCarsTemp=temp.carsPerLine;
			 industreNameTemp="nothing";
			 descriptionTempStation="nothing";
			 station1Temp="nothing";
			 station2Temp="nothing";
		}
		if (searchType==( "InterchangeYard")) {
			InterYard temp=(InterYard)Lines.get(getLineIndex(lnName)).Stations.get(getStationIndex(stName, Lines.get(getLineIndex(lnName))));
			 stlineTemp=temp.stationLine;
			 typeTemp=temp.statType;
			 nameTemp=temp.stationName;
			 acroTemp=temp.stationAcro;
			 directTemp=temp.stationDirection;
			 headTemp=temp.ahead;
			 tailTemp= temp.atail;
			 numLinesTemp=temp.numberLines;
			 numCarsTemp=temp.carsPerLine;
			 industreNameTemp= "nothing";
			 descriptionTempStation="nothing";
			 station1Temp=temp.station1;
			 station2Temp=temp.station2;
		}
		if (searchType==("IndustrysupportYard")) {
			IndusYard temp=(IndusYard)Lines.get(getLineIndex(lnName)).Stations.get(getStationIndex(stName, Lines.get(getLineIndex(lnName))));
			 stlineTemp=temp.stationLine;
			 typeTemp=temp.statType;
			 nameTemp=temp.stationName;
			 acroTemp=temp.stationAcro;
			 directTemp=temp.stationDirection;
			 headTemp=temp.ahead;
			 tailTemp= temp.atail;
			 numLinesTemp=temp.numberLines;
			 numCarsTemp=temp.carsPerLine;
			 industreNameTemp=temp.industryName;
			 descriptionTempStation=temp.descrip;
			 station1Temp="nothing";
			 station2Temp="nothing";
		}

		 
		
		
		
	}
	public void setTempLineData() {
		int x=0;
		for (Line line : Lines) {
			if (line.lineName.equals(lineNameTemp) || line.lineAcro.equals(lineNameTemp)) {
				 descripTemp = Lines.get(x).descrip;
				 lineNameTemp =Lines.get(x).lineName;
				 lineAcroTemp =Lines.get(x).lineAcro;
				 lineLengthTemp =Lines.get(x).lineLength;
				 lineTypeTemp =Lines.get(x).lineType;
				 directionTemp = Lines.get(x).direction;
				 searchIndexGlobalIntLine = x;
				break;
			}
		x++;
		}
		
	}
	public int carsPerLine(String stationN) {
		int total = 0;
		for (Line line : Lines) {
			for(Object station : line.Stations) {
				if (station.getClass() == InterYard.class) {
					InterYard tempInterYard = (InterYard) station;
					if (tempInterYard.stationLine.equals(stationN)) {
						for (int i = 0; i < tempInterYard.numberLines; i++) {
							for (int j = 0; j < tempInterYard.carsPerLine; j++) {
								if (tempInterYard.LinesArr[i][j]!=null) {
									total+=1;
								}
							}
						}
						
					}
					
				}
				if (station.getClass() == IndusYard.class) {
					IndusYard tempIndusYard= (IndusYard) station;
					if (tempIndusYard.stationLine.equals(stationN)) {
						for (int i = 0; i < tempIndusYard.numberLines; i++) {
							for (int j = 0; j < tempIndusYard.carsPerLine; j++) {
								if (tempIndusYard.LinesArr[i][j]!=null) {
									total+=1;
								}
							}
						}
						
					}
				}
				if (station.getClass() == ClassifYard.class) {
					ClassifYard tempClassifYard = (ClassifYard) station;
					if (tempClassifYard.stationLine.equals(stationN)) {
						for (int i = 0; i < tempClassifYard.numberLines; i++) {
							for (int j = 0; j < tempClassifYard.carsPerLine; j++) {
								if (tempClassifYard.LinesArr[i][j]!=null) {
									total+=1;
								}
							}
						}
						
					}
				}
			}
			
		}
		return total;
		
	}
	public String[][] createStringsLinesArray(){
		String tempArray[][]= new String [Lines.size()] [4];
		int x=0;
		for (Line line : Lines) {
			tempArray[x][0]= line.lineName;
			tempArray[x][1]= line.lineAcro;
			tempArray[x][2]= Integer.toString(line.numberOfStation);
			tempArray[x][3]= Integer.toString(carsPerLine(line.lineName));
		x++;}
		return tempArray;
	}
	public boolean searchStation(String stationN) {

		boolean flag = false;
		int x=0;
		for(Line line: Lines ) {
			for(Object tempObject : line.Stations) {
				if (tempObject.getClass() == InterYard.class) {
					InterYard tempInterYard = (InterYard) tempObject;
					if (tempInterYard.stationName.equals(stationN)||tempInterYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempInterYard.statType;
						searchStNameGlobalString = tempInterYard.stationName;
						searchLnNameGlobalString = tempInterYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
					
				}
				if (tempObject.getClass() == IndusYard.class) {
					IndusYard tempIndusYard= (IndusYard) tempObject;
					if (tempIndusYard.stationName.equals(stationN)||tempIndusYard.stationAcro.equals(stationN)) {
						flag = true;
						searchTypeGlobalString = tempIndusYard.statType;
						searchStNameGlobalString = tempIndusYard.stationName;
						searchLnNameGlobalString = tempIndusYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
				}
				if (tempObject.getClass() == ClassifYard.class) {
					ClassifYard tempClassifYard = (ClassifYard) tempObject;
				//	System.out.print("\n found station: " + x+" name: "+tempClassifYard.stationName);
					if (tempClassifYard.stationName.equals(stationN)||tempClassifYard.stationAcro.equals(stationN)) {
					//	System.out.print("\n found station");
						flag = true;
						searchTypeGlobalString = tempClassifYard.statType;
						searchStNameGlobalString = tempClassifYard.stationName;
						searchLnNameGlobalString = tempClassifYard.stationLine;
						searchIndexGlobalIntStation=x;
						break;
					}
				}
				
			x++;
			}
			if (flag) {
				break;
			}
		}
		return flag;
	}
	public int carsPerStation(Object station) {
		int x = -1;
		if (station.getClass() == InterYard.class) {
			x=0;
			InterYard tempInterYard = (InterYard) station;
			for (int i = 0; i < tempInterYard.numberLines; i++) {
				for (int j = 0; j < tempInterYard.carsPerLine; j++) {
					if (tempInterYard.LinesArr[i][j]!=null) {
						x++;
					}
				}
			}
			return x;
			
		}
		if (station.getClass() == IndusYard.class) {
			x=0;
			IndusYard tempIndusYard= (IndusYard) station;
			for (int i = 0; i < tempIndusYard.numberLines; i++) {
				for (int j = 0; j < tempIndusYard.carsPerLine; j++) {
					if (tempIndusYard.LinesArr[i][j]!=null) {
						x++;
					}
				}
			}
			return x;
				
		}
		if (station.getClass() == ClassifYard.class) {
			x=0;
			ClassifYard tempClassifYard = (ClassifYard) station;
			for (int i = 0; i < tempClassifYard.numberLines; i++) {
				for (int j = 0; j < tempClassifYard.carsPerLine; j++) {
					if (tempClassifYard.LinesArr[i][j]!=null) {
						x++;
					}
				}
			}
			return x;
			
				
		}
		return x;
	}
	
public String[][] createStringsStationsArry(String lnName){
		String[] columnNameStation = {"Station name","Type","Acro","Direction","Num of cars"};
		List<Object> tempObjectStation = Lines.get(getLineIndex(lnName)).Stations;
		String tempArray[][]= new String [tempObjectStation.size()] [5];
		int x=0;
		for (Object station : tempObjectStation) {
			if (station.getClass() == InterYard.class) {
				InterYard tempInterYard = (InterYard) station;
				tempArray[x][0]= tempInterYard.stationName;
				tempArray[x][1]= tempInterYard.statType;
				tempArray[x][2]= tempInterYard.stationAcro;
				tempArray[x][3]= tempInterYard.stationDirection;
				tempArray[x][4]= Integer.toString(carsPerStation(station));
					
				
			}
			if (station.getClass() == IndusYard.class) {
				IndusYard tempIndusYard= (IndusYard) station;
				tempArray[x][0]= tempIndusYard.stationName;
				tempArray[x][1]= tempIndusYard.statType;
				tempArray[x][2]= tempIndusYard.stationAcro;
				tempArray[x][3]= tempIndusYard.stationDirection;
				tempArray[x][4]= Integer.toString(carsPerStation(station));
					
			}
			if (station.getClass().equals(ClassifYard.class)) {
				ClassifYard tempClassifYard = (ClassifYard) station;
				tempArray[x][0]= tempClassifYard.stationName;
				tempArray[x][1]= tempClassifYard.statType;
				tempArray[x][2]= tempClassifYard.stationAcro;
				tempArray[x][3]= tempClassifYard.stationDirection;
				tempArray[x][4]= Integer.toString(carsPerStation(station));
				//System.out.print(tempArray[x][0]+",,,"+tempArray[x][1]+"..."+tempArray[x][2]+"///"+tempArray[x][3]+"///"+tempArray[x][4]+"\n");
				
					
			}

		x++;}
		return tempArray;
 //modelStation = new DefaultTableModel(dataStation,columnNameStation);	
 }
public String[][] createStringStation(String lnName,String stName){
	String[] columnNames = {"Line","Type","Code","Line in Station","Direction","Position"};
	Object station = Lines.get(getLineIndex(lnName)).Stations.get(getStationIndex(stName, Lines.get(getLineIndex(lnName))));
	String tempArray[][]= null;
	int x=0;
		if (station.getClass() == InterYard.class) {
			InterYard tempInterYard = (InterYard) station;
			 tempArray= new String [tempInterYard.numberLines*tempInterYard.carsPerLine] [6];
			for (int i = 0; i < tempInterYard.numberLines; i++) {
				for (int j = 0; j < tempInterYard.carsPerLine; j++) {
					if(tempInterYard.LinesArr[i][j]!=null) {
						tempArray[x][0]= tempInterYard.LinesArr[i][j].carsLine;
						tempArray[x][1]= tempInterYard.LinesArr[i][j].car_type;
						tempArray[x][2]= tempInterYard.LinesArr[i][j].carCode;
						tempArray[x][3]= "line "+ i;
						tempArray[x][4]= tempInterYard.LinesArr[i][j].end;
						tempArray[x][5]= "Position "+ j;
						x++;
					}
					
				}
			}
				
			return tempArray;
		}
		if (station.getClass() == IndusYard.class) {
			IndusYard tempIndusYard= (IndusYard) station;
			 tempArray= new String [tempIndusYard.numberLines*tempIndusYard.carsPerLine] [6];
			for (int i = 0; i < tempIndusYard.numberLines; i++) {
				for (int j = 0; j < tempIndusYard.carsPerLine; j++) {
					if(tempIndusYard.LinesArr[i][j]!=null) {
						tempArray[x][0]= tempIndusYard.LinesArr[i][j].carsLine;
						tempArray[x][1]= tempIndusYard.LinesArr[i][j].car_type;
						tempArray[x][2]= tempIndusYard.LinesArr[i][j].carCode;
						tempArray[x][3]= "line "+ i;
						tempArray[x][4]= tempIndusYard.LinesArr[i][j].end;
						tempArray[x][5]= "Position "+ j;
						x++;
					}
				}
			}
			return tempArray;
		}	
		if (station.getClass().equals(ClassifYard.class)) {
			ClassifYard tempClassifYard = (ClassifYard) station;
			 tempArray= new String [tempClassifYard.numberLines*tempClassifYard.carsPerLine] [6];
			for (int i = 0; i < tempClassifYard.numberLines; i++) {
				for (int j = 0; j < tempClassifYard.carsPerLine; j++) {
					if (tempClassifYard.LinesArr[i][j]!=null) {
						tempArray[x][0]= tempClassifYard.LinesArr[i][j].carsLine;
						tempArray[x][1]= tempClassifYard.LinesArr[i][j].car_type;
						tempArray[x][2]= tempClassifYard.LinesArr[i][j].carCode;
						tempArray[x][3]= "line "+ i;
						tempArray[x][4]= tempClassifYard.LinesArr[i][j].end;
						tempArray[x][5]= "Position "+ j;
						x++;
					}
				}
			}
			return tempArray;	
		}
		return tempArray;
}
public void setCarTemporal(String lnName, String stName, int x, int y) { 
	int stIndex= getStationIndex(stName, Lines.get(getLineIndex(lnName)));
	Object station = Lines.get(getLineIndex(lnName)).Stations.get(stIndex);
	if (station.getClass() == InterYard.class) {
		InterYard temp = (InterYard)station;
		staLineNameTemp = temp.LinesArr[x][y].carsLine;
		staStartNameTemp= temp.LinesArr[x][y].start;
		staEndNameTemp= temp.LinesArr[x][y].end;
		carTypeTemp= temp.LinesArr[x][y].car_type;
		carCodeTemp= temp.LinesArr[x][y].carCode;
		carWeightTemp= temp.LinesArr[x][y].carWeight;
	}
	if (station.getClass() == IndusYard.class) {
		IndusYard temp = (IndusYard)station;
		staLineNameTemp = temp.LinesArr[x][y].carsLine;
		staStartNameTemp= temp.LinesArr[x][y].start;
		staEndNameTemp= temp.LinesArr[x][y].end;
		carTypeTemp= temp.LinesArr[x][y].car_type;
		carCodeTemp= temp.LinesArr[x][y].carCode;
		carWeightTemp= temp.LinesArr[x][y].carWeight;
	}
	if (station.getClass() == ClassifYard.class) {
		ClassifYard temp = (ClassifYard)station;
		staLineNameTemp = temp.LinesArr[x][y].carsLine;
		staStartNameTemp= temp.LinesArr[x][y].start;
		staEndNameTemp= temp.LinesArr[x][y].end;
		carTypeTemp= temp.LinesArr[x][y].car_type;
		carCodeTemp= temp.LinesArr[x][y].carCode;
		carWeightTemp= temp.LinesArr[x][y].carWeight;
	}
//	staLineNameTemp;
//	staStartNameTemp;
//	staEndNameTemp;
//	carTypeTemp;
//	carCodeTemp;
//	carWeightTemp;
}
public void editCar(String lnName, String stName, int x, int y, Cars newCar) {
	int stIndex= getStationIndex(stName, Lines.get(getLineIndex(lnName)));
	Object station = Lines.get(getLineIndex(lnName)).Stations.get(stIndex);
	if (station.getClass() == InterYard.class) {
		InterYard temp = (InterYard)station;
		Lines.get(getLineIndex(lnName)).Stations.add(stIndex, temp);
		Lines.get(getLineIndex(lnName)).Stations.remove(stIndex+1);
	}
	if (station.getClass() == IndusYard.class) {
		IndusYard temp = (IndusYard)station;
		Lines.get(getLineIndex(lnName)).Stations.add(stIndex, temp);
		Lines.get(getLineIndex(lnName)).Stations.remove(stIndex+1);
	}
	if (station.getClass() == ClassifYard.class) {
		ClassifYard temp = (ClassifYard)station;
		Lines.get(getLineIndex(lnName)).Stations.add(stIndex, temp);
		Lines.get(getLineIndex(lnName)).Stations.remove(stIndex+1);
	}
}
public boolean searchCar(String code) {
	int x=0;
	for(Line line: Lines ) {
		for(Object tempObject : line.Stations) {
			if (tempObject.getClass() == InterYard.class) {
				InterYard tempInterYard = (InterYard) tempObject;
				for (int i = 0; i < tempInterYard.numberLines; i++) {
					for (int j = 0; j < tempInterYard.carsPerLine; j++) {
						if(tempInterYard.LinesArr[i][j]!=null)
							if (tempInterYard.LinesArr[i][j].carCode.equals(code)) {
							searchStNameGlobalString = tempInterYard.stationName;
							searchLnNameGlobalString = tempInterYard.stationLine;
							carGlobalXindex = i;
							carGlobalYindex = j;
							return true;
						}
					}
				}
				
			}
			if (tempObject.getClass() == IndusYard.class) {
				IndusYard tempIndusYard= (IndusYard) tempObject;
				for (int i = 0; i < tempIndusYard.numberLines; i++) {
					for (int j = 0; j < tempIndusYard.carsPerLine; j++) {
						if(tempIndusYard.LinesArr[i][j]!=null)
							if (tempIndusYard.LinesArr[i][j].carCode.equals(code)) {
							searchStNameGlobalString = tempIndusYard.stationName;
							searchLnNameGlobalString = tempIndusYard.stationLine;
							carGlobalXindex = i;
							carGlobalYindex = j;
							return true;
						}
					}
				}
			}
			if (tempObject.getClass() == ClassifYard.class) {
				ClassifYard tempClassifYard = (ClassifYard) tempObject;
				for (int i = 0; i < tempClassifYard.numberLines; i++) {
					for (int j = 0; j < tempClassifYard.carsPerLine; j++) {
						if(tempClassifYard.LinesArr[i][j]!=null)
							if (tempClassifYard.LinesArr[i][j].carCode.equals(code)) {
							searchStNameGlobalString = tempClassifYard.stationName;
							searchLnNameGlobalString = tempClassifYard.stationLine;
							carGlobalXindex = i;
							carGlobalYindex = j;
							return true;
						}
					}
				}
				}
		}
	}
	return false;
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
			//System.out.print(line.lineName +",  "+line.lineAcro);
		}
	}
	
}
