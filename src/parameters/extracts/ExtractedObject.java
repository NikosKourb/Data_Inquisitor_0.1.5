package parameters.extracts;


import java.util.ArrayList;



public class ExtractedObject {
	
	private ArrayList< ExtractedAttribute > extractedAttributeList = new ArrayList< ExtractedAttribute >();
	private String objectTypeName;
	
	
	public ExtractedObject() {}
	
	
	public ExtractedObject( ArrayList< ExtractedAttribute > extractedAttributeList ) {
		
		this.extractedAttributeList = extractedAttributeList;
		
	}
	
	
	
	public ArrayList< ExtractedAttribute > getExtractedAttributeList() {
		
		return extractedAttributeList;
		
	}
	
	
	
	public void setExtractedAttributeList( ArrayList< ExtractedAttribute > extractedAttributeList ) {
		
		this.extractedAttributeList = extractedAttributeList;
		
	}
	
	
	
	public String getObjectTypeName() {
		
		return objectTypeName;
		
	}
	
	
	
	public void setObjectTypeName( String objectTypeName ) {
		
		this.objectTypeName = objectTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String extractedAttributeListString = "";
		
		for( int i = 0; i < extractedAttributeList.size(); i++ ) {
			
			extractedAttributeListString = extractedAttributeListString + extractedAttributeList.get( i ) + "\r";
			
		}
		
		return "\"~~~~~~~~~~~~~~~~~~~~~~~~~ExtractedObject(" + objectTypeName + ")~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" + extractedAttributeListString + "\n" + "\n";
		
	}
	
	
	
	
	
}
