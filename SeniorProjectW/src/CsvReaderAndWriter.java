import java.io. * ;
import java.util.Scanner;
import java.util.*;
public class CsvReaderAndWriter {
	
	public static final String delimiter = ",";
	//csv file to read
    //String csvFile = "C:\\Users\\Dell\\Desktop\\csvDemo.csv";
    //CSVReader.read(csvFile);
	public void LineWriteCsv (String csvFile, List<Line> list) throws Exception {
		FileWriter fileWrt = new FileWriter(csvFile);

	    BufferedWriter bufferWrt = new BufferedWriter(fileWrt);
	    bufferWrt.write("TechGeekNext - CSV BufferedWriter Example");// adding line to the file line

	    bufferWrt.close();

	    System.out.println("File updated successfully!");
	}
	
	public void LineReadCsv(String csvFile, List<Line> List) throws Exception {

	        File file = new File(csvFile);
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	        String line = " ";
	        String[] tempArr;
	        while ((line = br.readLine()) != null) {
	          tempArr = line.split(delimiter);
	          for (String tempStr: tempArr) {
	            System.out.print(tempStr + " "); //get position in matrix
	          }
	          System.out.println();
	        }
	        br.close();

	      
	    }
}
