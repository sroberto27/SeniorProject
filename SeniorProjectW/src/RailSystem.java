import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.io. * ;


public class RailSystem extends GlobalVars{
	List<Line> Lines;
	public String searchTypeGlobalString="";
	public String searchStNameGlobalString="";
	public String searchLnNameGlobalString="";
	public int searchIndexGlobalIntStation=-1;
	public int searchIndexGlobalIntLine=-1;
	public int carGlobalXindex=-1;
	public int carGlobalYindex=-1;
	public static final String delimiter = ",";
	public static final String jump = "\n";
	public RailSystem() {
		Lines = new ArrayList<Line>();
		
	}
	public ComboBoxModel<String> GenerateLineBox(){
		int x=0;
		String[] str = new String[Lines.size()];
		for(Line line : Lines) {
			
			str[x] = line.lineName;
			x++;
		}
		ComboBoxModel<String> lineBox = new DefaultComboBoxModel<>(str);
		return lineBox;
	}
	public void addLine(String name, String acro, String type, String dir, int length, String strSta, String endSta, int numSta, int capSta, String descr ) {
		Line temp = new Line(name, acro, type, dir,length, strSta, endSta, numSta, capSta, descr);
		Lines.add(temp);
	}
	public void editLine(int index, String name, String acro, String type, String dir, int length, String strSta, String endSta, int numSta, int capSta, String descr){
		Line tempLine = new Line(name, acro, type, dir,length, Lines.get(index).start, Lines.get(index).end, Lines.get(index).numberOfStation, capSta, descr);
		tempLine.setStations(Lines.get(index).Stations);
		Lines.set(index, tempLine) ;
	
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
		System.out.print("got in \n");
		if(type.equals("ClassificationYard")) {
			System.out.print("testing enters");
			ClassifYard temp = new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars);
			temp.setIndex(getLineIndex(stline));
System.out.print("Index of add station: "+ getLineIndex(stline)+"\n");
			Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
			Lines.get(getLineIndex(stline)).numberOfStation+=1;
		}else
			if(type.equals("InterchangeYard")) {
				InterYard temp = new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2);
				temp.setIndex(getLineIndex(stline));
				Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
				Lines.get(getLineIndex(stline)).numberOfStation+=1;
			}else
				if(type.equals("IndustrysupportYard") ) {
					IndusYard temp = new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip);
					temp.setIndex(getLineIndex(stline));
					Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
					Lines.get(getLineIndex(stline)).numberOfStation+=1;
				}
	}
	public void addStation2(String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String industreName, String descrip, String station1, String station2) {
		System.out.print("got in \n");
		if(type.equals("ClassificationYard")) {
			System.out.print("testing enters");
			ClassifYard temp = new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars);
			temp.setIndex(getLineIndex(stline));
System.out.print("Index of add station: "+ getLineIndex(stline)+"\n");
			Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
		}else
			if(type.equals("InterchangeYard")) {
				InterYard temp = new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2);
				temp.setIndex(getLineIndex(stline));
				Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
			}else
				if(type.equals("IndustrysupportYard") ) {
					IndusYard temp = new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip);
					temp.setIndex(getLineIndex(stline));
					Lines.get(getLineIndex(stline)).Stations.add(getStationIndex(head,Lines.get(getLineIndex(stline))),temp);
				}
	}
	
	public void editStation(int index,String namelook, String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String industreName, String descrip, String station1, String station2) {

		if(type == "ClassificationYard") {
			ClassifYard temp = new ClassifYard(stline,  type,  name, acro,direct,head,tail,numLines,numCars);
			temp.setIndex(getLineIndex(stline));
			
			//int idx = getStationIndex(namelook,Lines.get(getLineIndex(stline)));
			Lines.get(getLineIndex(stline)).Stations.add(temp.stIndex,temp);
			Lines.get(getLineIndex(stline)).Stations.remove(temp.stIndex+1);
		}else
			if(type == "InterchangeYard") {
				InterYard temp = new InterYard ( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  station1,  station2);
				temp.setIndex(getLineIndex(stline));
				//int idx = getStationIndex(namelook,Lines.get(getLineIndex(stline)));
				System.out.print("x"+temp.stIndex+"  index/n");
				Lines.get(getLineIndex(stline)).Stations.add(temp.stIndex,temp);
				Lines.get(getLineIndex(stline)).Stations.remove(temp.stIndex+1);
			}else
				if(type == "IndustrysupportYard") {
					IndusYard temp = new IndusYard( stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars,  industreName,  descrip);
					temp.setIndex(getLineIndex(stline));
					//int idx = getStationIndex(namelook,Lines.get(getLineIndex(stline)));
					
					Lines.get(getLineIndex(stline)).Stations.add(temp.stIndex,temp);
					Lines.get(getLineIndex(stline)).Stations.remove(temp.stIndex+1);
				}
	}
	public void deleteStation(int index, String stline, String type,String name) {

		if(type == "ClassificationYard") {

			Lines.get(getLineIndex(stline)).Stations.remove(getStationIndex(name,Lines.get(getLineIndex(stline))));
			Lines.get(getLineIndex(stline)).numberOfStation-=1;
		}else
			if(type == "InterchangeYard") {
				Lines.get(getLineIndex(stline)).Stations.remove(getStationIndex(name,Lines.get(getLineIndex(stline))));
				Lines.get(getLineIndex(stline)).numberOfStation-=1;
			}else
				if(type == "IndustrysupportYard") {
					Lines.get(getLineIndex(stline)).Stations.remove(getStationIndex(name,Lines.get(getLineIndex(stline))));
					Lines.get(getLineIndex(stline)).numberOfStation-=1;
				}
	}
	public int getStationIndex(String name, Line line) {
		int x=0;
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
				if (tempClassifYard.stationName.equals(name)) {
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
	public String addCar(String line, String type, String str, String en, String code, int w) {
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
						tempInterYard.LinesArr[x][y].setPos(x, y);
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
						tempIndusYard.LinesArr[x][y].setPos(x, y);
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
						tempClassifYard.LinesArr[x][y].setPos(x, y);
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
			pfound.setVisible(true);
			pNoFound.setVisible(false);
		}else {
			pfound.setVisible(false);
			pNoFound.setVisible(true);
		}
		return flag;
	}
	
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
						InterYard temp=(InterYard)Lines.get(getLineIndex(searchLnNameGlobalString)).Stations.get(getStationIndex(searchStNameGlobalString, Lines.get(getLineIndex(searchLnNameGlobalString))));
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
						IndusYard temp=(IndusYard)Lines.get(getLineIndex(searchLnNameGlobalString)).Stations.get(getStationIndex(searchStNameGlobalString, Lines.get(getLineIndex(searchLnNameGlobalString))));
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
						ClassifYard temp=(ClassifYard)Lines.get(getLineIndex(searchLnNameGlobalString)).Stations.get(getStationIndex(searchStNameGlobalString, Lines.get(getLineIndex(searchLnNameGlobalString))));
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
			if (searchTypeGlobalString == "ClassificationYard") {
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
						InterYard temp=(InterYard)Lines.get(getLineIndex(searchLnNameGlobalString)).Stations.get(getStationIndex(searchStNameGlobalString, Lines.get(getLineIndex(searchLnNameGlobalString))));
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
						IndusYard temp=(IndusYard)Lines.get(getLineIndex(searchLnNameGlobalString)).Stations.get(getStationIndex(searchStNameGlobalString, Lines.get(getLineIndex(searchLnNameGlobalString))));
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
						ClassifYard temp=(ClassifYard)Lines.get(getLineIndex(searchLnNameGlobalString)).Stations.get(getStationIndex(searchStNameGlobalString, Lines.get(getLineIndex(searchLnNameGlobalString))));
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
			if (searchTypeGlobalString.equals("ClassificationYard")) {
				 pNoFound.setVisible(false);
				 normal.setVisible(true);
				 industry.setVisible(false);  
				 inter.setVisible(false);
			}
				if (searchTypeGlobalString.equals("InterchangeYard") ) {
					pNoFound.setVisible(false);
					 normal.setVisible(false);
					 industry.setVisible(false);  
					 inter.setVisible(true);
					
				}
					if (searchTypeGlobalString.equals("IndustrysupportYard")) {
						pNoFound.setVisible(false);
						 normal.setVisible(false);
						 industry.setVisible(true);  
						 inter.setVisible(false);
					}
				
		}else {
			x=-1;
			pfound.setVisible(false);
			pNoFound.setVisible(true);
			 normal.setVisible(true);
			 industry.setVisible(false);  
			 inter.setVisible(false);
			 System.out.print("No found");
		}
		return flag;
	}
	
	public void setTempStationData(String searchType,int index, String stName, String lnName) {
		
		if (searchType == ("ClassificationYard")) {
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
				
					
			}

		x++;}
		return tempArray;
 }
public String[][] createStringStation(String lnName,String stName){
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
}
public void editCar(String lnName, String stName, int x, int y, Cars newCar) {
	int stIndex= getStationIndex(stName, Lines.get(getLineIndex(lnName)));
	Object station = Lines.get(getLineIndex(lnName)).Stations.get(stIndex);
	if (station.getClass() == InterYard.class) {
		InterYard temp = (InterYard)station;
		temp.LinesArr[x][y]= newCar;
		Lines.get(getLineIndex(lnName)).Stations.add(stIndex, temp);
		Lines.get(getLineIndex(lnName)).Stations.remove(stIndex+1);
	}
	if (station.getClass() == IndusYard.class) {
		IndusYard temp = (IndusYard)station;
		temp.LinesArr[x][y]= newCar;
		Lines.get(getLineIndex(lnName)).Stations.add(stIndex, temp);
		Lines.get(getLineIndex(lnName)).Stations.remove(stIndex+1);
	}
	if (station.getClass() == ClassifYard.class) {
		ClassifYard temp = (ClassifYard)station;
		temp.LinesArr[x][y]= newCar;
		Lines.get(getLineIndex(lnName)).Stations.add(stIndex, temp);
		Lines.get(getLineIndex(lnName)).Stations.remove(stIndex+1);
	}
}
public void removeCarFromLine(String lnName, String stName, int x, int y) {
	
}
public void deleteCar(String lnName, String stName, int x, int y) {
	int stIndex= getStationIndex(stName, Lines.get(getLineIndex(lnName)));
	Object station = Lines.get(getLineIndex(lnName)).Stations.get(stIndex);
	if (station.getClass() == InterYard.class) {
		InterYard temp = (InterYard)station;
		int i = y;
		for (; i < temp.carsPerLine-1; i++) {
			temp.LinesArr[x][i] = temp.LinesArr[x][i+1];
		}
		temp.LinesArr[x][i] = null; 
	}
	if (station.getClass() == IndusYard.class) {
		IndusYard temp = (IndusYard)station;
		int i = y;
		for (; i < temp.carsPerLine-1; i++) {
			temp.LinesArr[x][i] = temp.LinesArr[x][i+1];
		}
		temp.LinesArr[x][i] = null;
	}
	if (station.getClass() == ClassifYard.class) {
		ClassifYard temp = (ClassifYard)station;
		int i = y;
		for (; i < temp.carsPerLine-1; i++) {
			temp.LinesArr[x][i] = temp.LinesArr[x][i+1];
		}
		temp.LinesArr[x][i] = null;
		printCarsInSatation(searchStNameGlobalString, Lines.get(getLineIndex(searchLnNameGlobalString)));
	}
}
public boolean searchCar(String code) {

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
public String getLineData(Line Z) {
	String str="";
	str = Z.lineName+delimiter+Z.lineAcro+delimiter+Z.lineType+delimiter+Z.direction+delimiter+Z.lineLength+delimiter+Z.start+delimiter+Z.end+delimiter+Z.numberOfStation+delimiter+Z.Linecapacity+delimiter+Z.descrip;
	return str;
}
public String getSatationData(Object station) {
	String str="";
	
	if (station.getClass() == InterYard.class) {
		InterYard Z = (InterYard)station;
		str = Z.statType+delimiter+Z.stationName+delimiter+Z.stationLine+delimiter+Z.stationAcro+delimiter+Z.stationDirection+delimiter+Z.ahead+delimiter+Z.atail+delimiter+Z.numberLines+delimiter+Z.carsPerLine+delimiter+Z.maxCapacity+delimiter+"nothing"+delimiter+"nothing"+delimiter+Z.station1+delimiter+Z.station2;
	}
	if (station.getClass() == IndusYard.class) {
		IndusYard Z = (IndusYard)station;
		str = Z.statType+delimiter+Z.stationName+delimiter+Z.stationLine+delimiter+Z.stationAcro+delimiter+Z.stationDirection+delimiter+Z.ahead+delimiter+Z.atail+delimiter+Z.numberLines+delimiter+Z.carsPerLine+delimiter+Z.maxCapacity+delimiter+Z.industryName+delimiter+Z.descrip+delimiter+"nothing"+delimiter+"nothing";
	}
	if (station.getClass() == ClassifYard.class) {
		ClassifYard Z = (ClassifYard)station;
		str = Z.statType+delimiter+Z.stationName+delimiter+Z.stationLine+delimiter+Z.stationAcro+delimiter+Z.stationDirection+delimiter+Z.ahead+delimiter+Z.atail+delimiter+Z.numberLines+delimiter+Z.carsPerLine+delimiter+Z.maxCapacity+delimiter+"nothing"+delimiter+"nothing"+delimiter+"nothing"+delimiter+"nothing";
	}
	return str;
}
public String getCarData(Cars Z, int x, int y) {
	String str="";
	str= x+delimiter+y+delimiter+Z.car_type+delimiter+Z.carsLine+delimiter+Z.start+delimiter+Z.end+delimiter+Z.carCode+delimiter+Z.carWeight;
	return str;
}
public String saveFile(String csvFile) throws Exception {
	FileWriter fileWrt = new FileWriter(csvFile);
	fileWrt.flush();
    BufferedWriter bufferWrt = new BufferedWriter(fileWrt);
    for (Line line : Lines) {
    	  bufferWrt.write("line%"+jump);
    	  bufferWrt.write(getLineData(line)+jump);
    	  for (Object station : line.Stations) {
    		  bufferWrt.write("station%"+jump);
    		  if (station.getClass() == InterYard.class) {
    				InterYard temp = (InterYard)station;
    				bufferWrt.write(getSatationData(temp)+jump);
    				bufferWrt.write("cars%"+jump);
    				for (int i = 0; i < temp.numberLines; i++) {
						for (int j = 0; j < temp.carsPerLine; j++) {
							if (temp.LinesArr[i][j]!=null) {
								bufferWrt.write(getCarData(temp.LinesArr[i][j],i,j)+jump);
							}
							
						}
					}
    				bufferWrt.write("carsEnd%"+jump);
    			}
    			if (station.getClass() == IndusYard.class) {
    				IndusYard temp = (IndusYard)station;
    				bufferWrt.write(getSatationData(temp)+jump);
    				bufferWrt.write("cars%"+jump);
    				for (int i = 0; i < temp.numberLines; i++) {
						for (int j = 0; j < temp.carsPerLine; j++) {
							if (temp.LinesArr[i][j]!=null) {
								bufferWrt.write(getCarData(temp.LinesArr[i][j],i,j)+jump);
							}
							
						}
					}
    				bufferWrt.write("carsEnd%"+jump);
    			}
    			if (station.getClass() == ClassifYard.class) {
    				ClassifYard temp = (ClassifYard)station;
    				bufferWrt.write(getSatationData(temp)+jump);
    				bufferWrt.write("cars%"+jump);
    				for (int i = 0; i < temp.numberLines; i++) {
						for (int j = 0; j < temp.carsPerLine; j++) {
							if (temp.LinesArr[i][j]!=null) {
								bufferWrt.write(getCarData(temp.LinesArr[i][j],i,j)+jump);
							}
							
						}
					}
    				bufferWrt.write("carsEnd%"+jump);
    			}
    			bufferWrt.write("stationEnd%"+jump);
		}
    	  bufferWrt.write("lineEnd%"+jump);
	}
    bufferWrt.write("fileEnd%"+jump);
    bufferWrt.close();

    return "File uploaded successfully!";
}
public void loadLineData(String[] Z) {
	Line line;
	
	lineNameTemp = Z[0];
	lineAcroTemp = Z[1];
	lineTypeTemp = Z[2];
	directionTemp = Z[3];
	lineLengthTemp = Integer.parseInt(Z[4]);
	startTemp = Z[5];
	endTemp = Z[6];
	numberOfStationTemp = Integer.parseInt(Z[7]);
	LinecapacityTemp = Integer.parseInt(Z[8]);
	descripTemp = Z[9];
	line = new Line(lineNameTemp, lineAcroTemp, lineTypeTemp, directionTemp, lineLengthTemp, startTemp, endTemp, numberOfStationTemp, LinecapacityTemp, descripTemp);
	Lines.add(line);
}
public void loadCarData(String[] Z) {
	Cars car = null;
	carGlobalXindex= Integer.parseInt(Z[0]);
	carGlobalYindex=Integer.parseInt(Z[1]);
	staLineNameTemp = Z[3];
	staStartNameTemp = Z[4];
	staEndNameTemp = Z[5];
	carTypeTemp = Z[2];
	carCodeTemp = Z[6];
	carWeightTemp = Integer.parseInt(Z[7]);
	car =new Cars(staLineNameTemp, carTypeTemp, staStartNameTemp, staEndNameTemp, carCodeTemp, carWeightTemp);
	car.setPos(carGlobalXindex, carGlobalYindex);
	Object station =  Lines.get(getLineIndex(staLineNameTemp)).Stations.get(getStationIndex(staStartNameTemp, Lines.get(getLineIndex(staLineNameTemp))));
	if (station.getClass() == InterYard.class) {
		InterYard temp = (InterYard)station;
		temp.LinesArr[carGlobalXindex][carGlobalYindex]= car;
	}
	if (station.getClass() == IndusYard.class) {
		IndusYard temp = (IndusYard)station;
		temp.LinesArr[carGlobalXindex][carGlobalYindex]= car;
	}
	if (station.getClass() == ClassifYard.class) {
		ClassifYard temp = (ClassifYard)station;
		temp.LinesArr[carGlobalXindex][carGlobalYindex]= car;
	}
}
public void loadStationData(String[] Z) {
	typeTemp = Z[0];
	nameTemp = Z[1];
	stlineTemp = Z[2];
	acroTemp = Z[3];
	directTemp = Z[4];
	headTemp = Z[5];
	tailTemp = Z[6];
	numLinesTemp = Integer.parseInt(Z[7]);
	numCarsTemp = Integer.parseInt(Z[8]);
	//int maxcarsTemp = Integer.parseInt(Z[9]);
	industreNameTemp = Z[10];
	descriptionTempStation = Z[11];
	station1Temp = Z[12];
	station2Temp = Z[13];
	System.out.print("type :"+typeTemp+"\n");
	this.addStation2(stlineTemp, typeTemp, nameTemp, acroTemp, directionTemp, headTemp, tailTemp, numLinesTemp, numCarsTemp, industreNameTemp, descriptionTempStation, station1Temp, station2Temp);
}
public String LoadFile(String csvFile) throws Exception {
	boolean lineFlag =false;
	boolean stFlag= false;
	boolean carFlag= false;
    File file = new File(csvFile);
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    String line = " ";
    String[] tempArr;
    while ((line = br.readLine()) != null) {
    	System.out.print(line+"\n");
      tempArr = line.split(delimiter);
      if (lineFlag) {
		loadLineData(tempArr);
		lineFlag=false;
	}
      if (stFlag) {
		loadStationData(tempArr);
		System.out.print("loaded station \n");
		stFlag = false;
	}
      if (carFlag) {
    	  if (line.equals("carsEnd%")) {
    		  carFlag =false;
		}else {
			loadCarData(tempArr);
			
		}
		
	}
      if (line.equals("line%")) {
    	  lineFlag =true;
	}
      if (line.equals("station%")) {
    	  stFlag=true;
	}
      if (line.equals("cars%")) {
    	  carFlag =true;
  	}
      if (line.equals("lineEnd%")) {
    	  lineFlag =false;
	}
      if (line.equals("stationEnd%")) {
    	  stFlag=false;
	}
      if (line.equals("carsEnd%")) {
    	  carFlag =false;
  	}
      
      
    }
    br.close();
	
	return "File loaded successfully!";
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
