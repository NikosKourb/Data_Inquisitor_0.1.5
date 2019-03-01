package parameters.identifiers;


import functions.locators.LocateGroupCoordinates;



public class ObjectIdentifier implements LocateGroupCoordinates {
	
	private AttributeIdentifier[] attributeIdentifierArray;
	private String objectTypeName;
	
	
	public ObjectIdentifier() {}
	
	
	public ObjectIdentifier( AttributeIdentifier[] attributeIdentifierArray ) {
		
		this.attributeIdentifierArray = attributeIdentifierArray;
		
		this.objectTypeName = attributeIdentifierArray[ 0 ].getMarkerIdentifierArray()[ 0 ].getObjectTypeName();
		
	}
	
	
	
	public AttributeIdentifier[] getAttributeIdentifierArray() {
		
		return attributeIdentifierArray;
		
	}
	
	
	
	public void setAttributeIdentifierArray( AttributeIdentifier[] attributeIdentifierArray ) {
		
		this.attributeIdentifierArray = attributeIdentifierArray;
		
	}
	
	
	
	public String getObjectTypeName() {
		
		return objectTypeName;
		
	}
	
	
	
	public void setObjectTypeName( String objectTypeName ) {
		
		this.objectTypeName = objectTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String attributeIdentifierArrayString = "";
		
		for( int i = 0; i < attributeIdentifierArray.length; i++ ) {
			
			attributeIdentifierArrayString = attributeIdentifierArrayString + ( attributeIdentifierArray[ i ].toString() + "\n" );
			
		}
		
		return "ObjectIdentifier= [" + "\n" + attributeIdentifierArrayString + "]";
		
	}
	
	
	
	
	
}