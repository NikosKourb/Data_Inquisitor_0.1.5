package parameters.extracts;


import java.util.ArrayList;



public class ExtractedGroup {
	
	private ArrayList< ExtractedObject > extractedObjectList = new ArrayList< ExtractedObject >();
	private String groupTypeName;
	
	
	public ExtractedGroup() {}
	
	
	public ExtractedGroup( ArrayList< ExtractedObject > extractedObjectList ) {
		
		this.extractedObjectList = extractedObjectList;
		
	}
	
	
	
	public ArrayList< ExtractedObject > getExtractedObjectList() {
		
		return extractedObjectList;
		
	}
	
	
	
	public void setExtractedObjectList( ArrayList< ExtractedObject > extractedObjectList ) {
		
		this.extractedObjectList = extractedObjectList;
		
	}
	
	
	
	public String getGroupTypeName() {
		
		return groupTypeName;
		
	}
	
	
	
	public void setGroupTypeName( String groupTypeName ) {
		
		this.groupTypeName = groupTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String extractedObjectListString = "";
		
		for( int i = 0; i < extractedObjectList.size(); i++ ) {
			
			extractedObjectListString = extractedObjectListString + extractedObjectList.get( i ) + "\r";
			
		}
		
		return "_________________________ExtractedGroup(" + groupTypeName + ")_________________________" + "\n" + "\n" + extractedObjectListString + "\n" + "\n";
		
	}
	
	
	
	
	
}
