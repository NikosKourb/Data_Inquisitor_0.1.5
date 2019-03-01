package parameters.maps;


import java.util.ArrayList;



public class ObjectMap {
	
	private ArrayList< AttributeMap > attributeMapList = new ArrayList< AttributeMap >();
	private String objectTypeName;
	
	
	public ObjectMap() {}
	
	
	public ObjectMap( ArrayList< AttributeMap > attributeMapList ) {
		
		this.attributeMapList = attributeMapList;
		
	}
	
	
	
	public ArrayList< AttributeMap > getAttributeMapList() {
		
		return attributeMapList;
		
	}
	
	
	
	public void setAttributeMapList( ArrayList< AttributeMap > attributeMapList ) {
		
		this.attributeMapList = attributeMapList;
		
	}
	
	
	
	public String getObjectTypeName() {
		
		return objectTypeName;
		
	}
	
	
	
	public void setObjectTypeName( String objectTypeName ) {
		
		this.objectTypeName = objectTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String attributeMapListString = "";
		
		for( int i = 0; i < attributeMapList.size(); i++ ) {
			
			attributeMapListString = attributeMapListString + attributeMapList.get( i ) + "\r";
			
		}
		
		return "~~~~~~~~~~~~~~~~~~~~~~~~~ObjectMap ( " + objectTypeName + " )~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" + attributeMapListString + "\n" + "\n";
		
	}
	
	
	
	
	
}