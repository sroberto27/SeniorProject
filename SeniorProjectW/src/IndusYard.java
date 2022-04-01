
public class IndusYard extends Station {
	String industryName;
	String descrip;
	
	public IndusYard(String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String nameIn, String description) {
		
		super(stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars);
		industryName = nameIn;
		descrip = description;
	}

}
