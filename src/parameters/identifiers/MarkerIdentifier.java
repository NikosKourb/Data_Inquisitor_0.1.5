package parameters.identifiers;


public class MarkerIdentifier {
	
	private int relevantLinePositionIndex;
	private int relevantCharacterPositionIndex;
	private String searchTerm;
	private String attributeTypeName;
	private String objectTypeName;
	private String groupTypeName;
	
	
	public MarkerIdentifier() {}
	
	
	
	public MarkerIdentifier( int relevantLinePositionIndex , int relevantCharacterPositionIndex , String searchTerm , String attributeTypeName , String objectTypeName , String groupTypeName ) {
		
		this.relevantLinePositionIndex = relevantLinePositionIndex;
		
		this.relevantCharacterPositionIndex = relevantCharacterPositionIndex;
		
		this.searchTerm = searchTerm;
		
		this.attributeTypeName = attributeTypeName;
		
		this.objectTypeName = objectTypeName;
		
		this.groupTypeName = groupTypeName;
		
	}
	
	
	
	public int getRelevantLinePositionIndex() {
		
		return relevantLinePositionIndex;
		
	}
	
	
	
	public void setRelevantLinePositionIndex( int relevantLinePositionIndex ) {
		
		this.relevantLinePositionIndex = relevantLinePositionIndex;
		
	}
	
	
	
	public int getRelevantCharacterPositionIndex() {
		
		return relevantCharacterPositionIndex;
		
	}
	
	
	
	public void setRelevantCharacterPositionIndex( int relevantCharacterPositionIndex ) {
		
		this.relevantCharacterPositionIndex = relevantCharacterPositionIndex;
		
	}
	
	
	
	public String getSearchTerm() {
		
		return searchTerm;
		
	}
	
	
	
	public void setSearchTerm( String searchTerm ) {
		
		this.searchTerm = searchTerm;
		
	}
	
	
	
	public String getAttributeTypeName() {
		
		return attributeTypeName;
		
	}
	
	
	
	public void setAttributeTypeName( String attributeTypeName ) {
		
		this.attributeTypeName = attributeTypeName;
		
	}
	
	
	
	public String getObjectTypeName() {
		
		return objectTypeName;
		
	}
	
	
	
	public void setObjectTypeName( String objectTypeName ) {
		
		this.objectTypeName = objectTypeName;
		
	}
	
	
	
	public String getGroupTypeName() {
		
		return groupTypeName;
		
	}
	
	
	
	public void setGroupTypeName( String groupTypeName ) {
		
		this.groupTypeName = groupTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "Search Parameter= { " + relevantLinePositionIndex + " , " + relevantCharacterPositionIndex +  " , \'" + searchTerm + "\' , \'" + attributeTypeName + "\' , \'" + objectTypeName + "\' , \'" + groupTypeName + "\' }";
		
	}
	
	
	
	
	
}