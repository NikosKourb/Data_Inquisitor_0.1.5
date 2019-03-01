package parameters.maps;


import java.util.ArrayList;
import functions.extractors.ExtractGroup;



public class GroupMap implements ExtractGroup {
	
	private ArrayList< ObjectMap > objectMapList = new ArrayList< ObjectMap >();
	private String groupTypeName;
	
	
	public GroupMap() {}
	
	
	public GroupMap( ArrayList< ObjectMap > objectMapList ) {
		
		this.objectMapList = objectMapList;
		
	}
	
	
	
	public ArrayList< ObjectMap > getObjectMapList() {
		
		return objectMapList;
		
	}
	
	
	
	public void setObjectMapList( ArrayList< ObjectMap > objectMapList ) {
		
		this.objectMapList = objectMapList;
		
	}
	
	
	
	public String getGroupTypeName() {
		
		return groupTypeName;
		
	}
	
	
	
	public void setGroupTypeName( String groupTypeName ) {
		
		this.groupTypeName = groupTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String objectMapListString = "";
		
		for( int i = 0; i < objectMapList.size(); i++ ) {
			
			objectMapListString = objectMapListString + objectMapList.get( i ) + "\r";
			
		}
		
		return "_________________________GroupMap (" + groupTypeName + ")_________________________" + "\n" + "\n" + objectMapListString + "\n" + "\n";
		
	}
	
	
	
	
	
}