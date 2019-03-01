package parameters.identifiers;


import java.util.ArrayList;
import java.util.Arrays;

import sorters.SortByLineAndCharacterRelevantPosition;



public class AttributeIdentifier {
	
	private MarkerIdentifier[] markerIdentifierArray;
	private String attributeTypeName;
	
	
	public AttributeIdentifier() {};
	
	
	public AttributeIdentifier( MarkerIdentifier[] markerArray ) {
		
		Arrays.sort( markerArray , new SortByLineAndCharacterRelevantPosition() );
			
		this.markerIdentifierArray = markerArray;
		
		this.attributeTypeName = markerArray[ 0 ].getAttributeTypeName();
		
	}
	
	
	public AttributeIdentifier( ArrayList< MarkerIdentifier > markerList ) {
		
		MarkerIdentifier[] newMarkerArray = markerList.toArray( new MarkerIdentifier[ markerList.size() ] );
		
		Arrays.sort( markerIdentifierArray , new SortByLineAndCharacterRelevantPosition() );
		
		this.markerIdentifierArray = newMarkerArray;
		
		this.attributeTypeName = markerIdentifierArray[ 0 ].getAttributeTypeName();
		
	}
	
	
	
	public MarkerIdentifier[] getMarkerIdentifierArray() {
		
		return markerIdentifierArray;
		
	}
	
	
	
	public void setMarkerIdentifierArray( MarkerIdentifier[] markerArray ) {
		
		this.markerIdentifierArray = markerArray;
		
	}
	
	
	
	public String getAttributeTypeName() {
		
		return attributeTypeName;
		
	}
	
	
	
	public void setAttributeTypeName( String attributeTypeName ) {
		
		this.attributeTypeName = attributeTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String markerIdentifierArrayString = "";
		
		for( int i = 0; i < markerIdentifierArray.length; i++ ) {
			
			markerIdentifierArrayString = markerIdentifierArrayString + ( markerIdentifierArray[ i ].toString() + "\n" );
			
		}
		
		return "AttributeIdentifier= [" + "\n" + markerIdentifierArrayString + "\n" + "AttributeTypeName= " + attributeTypeName + "]";
		
	}
	
	
	
	
	
}