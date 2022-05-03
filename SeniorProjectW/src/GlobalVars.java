import javax.swing.table.DefaultTableModel;

public class GlobalVars {

	//line temporal variables
public 	String descripTemp;
public 	String lineNameTemp;
public 	String lineAcroTemp;
public 	int lineLengthTemp;
public 	String lineTypeTemp;
public 	String directionTemp;
public 	String startTemp;
public 	String endTemp;
public 	int numberOfStationTemp;
public 	int LinecapacityTemp;
	//Station temporal variable
public 	String serachStation;
public 	int indexStation;
public 	String classTypeSelected;
public 	String stlineTemp;
public 	String typeTemp;
public 	String nameTemp; 
public 	String acroTemp;
public 	String directTemp;
public 	String headTemp;
public 	String tailTemp; 
public 	int numLinesTemp;
public 	int numCarsTemp;
public 	String industreNameTemp;
public 	String descriptionTempStation;
public 	String station1Temp;
public 	String station2Temp;
	// temp var station 2
public 	String classTypeSelected2;
public 	String stlineTem;
public 	String typeTem;
public 	String nameTem; 
public 	String acroTem;
public 	String directTem;
public 	String headTem;
public 	String tailTem; 
public 	int numLinesTem;
public 	int numCarsTem;
public 	String industreNameTem;
public 	String descriptionTempStation2;
public 	String station1Tem;
public 	String station2Tem;
	//cars tempral variables
public 	String staLineNameTemp;
public 	String staStartNameTemp;
public 	String staEndNameTemp;
public 	String carTypeTemp;
public 	String carCodeTemp;
public 	int carWeightTemp;
	//Combobox values for line types
public 	String LineClassType[]= {"Class I", "Class II", "Class III"};
public 	String ClassType[]= {"ClassificationYard", "InterchangeYard", "IndustrysupportYard"};
public 	String Direction []={"EW", "WE", "NS", "SN", "BiNS", "BiWE"};
public 	String CarType []={"Local","Tonnage","Manisfest","InterModal"};
//tables data
String[] columnNames = {"Line","Type","Code","Line in Station","Direction","Position"};
String[][] data = {{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting","Noting"}};	
DefaultTableModel model = new DefaultTableModel(data,columnNames);

String[] columnNameStation = {"Station name","Type","Acro","Direction","Num of cars"};
String[][] dataStation = {{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting","Noting"}};
DefaultTableModel modelStation = new DefaultTableModel(dataStation,columnNameStation);
String[] columnNameGeneral = {"Line name","Line Acro","Number of station","Number of cars"};
String[][] dataGeneral = {{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"},
		{"Noting","Noting","Noting","Noting"}};
DefaultTableModel modelGeneral = new DefaultTableModel(dataGeneral,columnNameGeneral);
//instructions
String Instruction  = "The system simulates a basic railroad system. With the ability to\r\n"
		+ " store three types of lines Class I, Class II, and Class III. Inside of \r\n"
		+ "each line, it can store three types of stations Classification Yards, \r\n"
		+ "Interchange Yards, and Industry Yards. Every Yard has the ability to \r\n"
		+ "store a certain number of cars based on the initial configuration of \r\n"
		+ "the Yard.\r\n"
		+ "\r\n"
		+ "Main features:\r\n"
		+ "1.Lines creation, edition, and deletion.\r\n"
		+ "2.Station creation, edition, and deletion.\r\n"
		+ "3.Car's addition to stations, deletion from stations, and car edition.\r\n"
		+ "4.General report on the program\r\n"
		+ "5.Lines report on the program\r\n"
		+ "6.Station report on the program\r\n"
		+ "7.Upload of data from CSV file\r\n"
		+ "8.The program stores the data of the program automatically when closed \r\n"
		+ "and restores the same data automatically when opened.\r\n"
		+ "\r\n"
		+ "	Future features:\r\n"
		+ "1.	Creation of CSV reports separated by Lines and station. \r\n"
		+ "Currently, the program stores one general CSV report with the \r\n"
		+ "whole data of the system.\r\n"
		+ "2.	Creation of any type of graphical representation of the\r\n"
		+ " rail system lines and station.\r\n"
		+ "\r\n"
		+ "Notes:\r\n"
		+ "If the program is empty, meaning with no line created. to start \r\n"
		+ "the program are two options:\r\n"
		+ "create manually a line them you will be able to add stations \r\n"
		+ "and cars and more lines if needed.\r\n"
		+ "Create a database on a CSV file. to create a database on a\r\n"
		+ " CSV file named \"railSystem.csv\" the  format of the file is the\r\n"
		+ " following:\r\n"
		+ "\r\n"
		+ "line%\r\n"
		+ "lineName,LineAcronym,LineClass,Direction,Lenght,startStation,endStation,NumofStations,Capasity,description\r\n"
		+ "station%\r\n"
		+ "TypeofStation,NameOfSation,Station'sLine,StationAcronym,StationDirection,HeadStation,TailStation,NumberofLines,NumberOfCarsPerLine,Max capacity,Industryname,IndustryDescription,StationInterchange1,StationInterchage2\r\n"
		+ "cars%\r\n"
		+ "LineinStation,positioninLine,TypeOfCar,Line,StartStation,EndStation,CarCode,CarWeight\r\n"
		+ "carsEnd%\r\n"
		+ "stationEnd%\r\n"
		+ "lineEnd%\r\n"
		+ "fileEnd%\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "Here is an example of a basic rail system with One-line and few stations and cars in the system:\r\n"
		+ "\r\n"
		+ "line%\r\n"
		+ "line1,1,Class I,EW,1,s1,s2,2,0,1\r\n"
		+ "station%\r\n"
		+ "ClassificationYard,s1,line1,2,EW,NothingYet,Nothing Yet,2,2,4.0,nothing,nothing,nothing,nothing\r\n"
		+ "cars%\r\n"
		+ "0,0,InterModal,line1,s1,s2,3,1\r\n"
		+ "carsEnd%\r\n"
		+ "stationEnd%\r\n"
		+ "station%\r\n"
		+ "IndustrysupportYard,s2,line1,2,EW,NothingYet,Nothing Yet,2,2,4.0,2,222,nothing,nothing\r\n"
		+ "cars%\r\n"
		+ "0,0,Tonnage,line1,s2,s1,1,1\r\n"
		+ "0,1,Tonnage,line1,s2,s1,2,1\r\n"
		+ "carsEnd%\r\n"
		+ "stationEnd%\r\n"
		+ "lineEnd%\r\n"
		+ "fileEnd%\r\n"
		+ "";
String aboutStr = "This project was developed by Roberto Salazar as part of his senior project. \n "
		+ "this project was a requirement to finish the Computer Science degree in May 2022.\n" 
		+ "This project was developed entirely in java, using ECLIPSE as IDE. \n"
		+ "The repository of this project can be found here:  \n \n\n"
		+ " https://github.com/sroberto27/SeniorProject \n ";
}
