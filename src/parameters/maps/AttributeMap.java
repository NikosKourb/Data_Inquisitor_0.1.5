package parameters.maps;


import java.util.ArrayList;
import parameters.maps.locations.AttributeLocation;
import parameters.maps.locations.MarkerLocation;



public class AttributeMap {
	
	private ArrayList< MarkerLocation > markerLocationList = new ArrayList< MarkerLocation >();
	private AttributeLocation attributeLocation;
	private String attributeTypeName;
	
	
	public AttributeMap() {}
	
	
	public AttributeMap( ArrayList< MarkerLocation > markerLocationList ) {
		
		ArrayList< MarkerLocation > newMarkerLocationList = markerLocationList;
		
		this.markerLocationList = newMarkerLocationList;
		
	}
	
	
	
	public ArrayList< MarkerLocation > getMarkerLocationList() {
		
		return markerLocationList;
		
	}
	
	
	
	public void setMarkerLocationList( ArrayList< MarkerLocation > markerLocationList ) {
		
		this.markerLocationList = markerLocationList;
		
	}
	
	
	
	public AttributeLocation getAttributeLocation() {
		
		return attributeLocation;
		
	}
	
	
	
	public void setAttributeLocation() {
		
		int lineCoordinate = 0;
		int charStartCoordinate = 0 ;
		int charEndCoordinate = 0;
		
		for( int i =0; i < markerLocationList.size(); i++ ) {
			
			if( markerLocationList.get( i ).getCharacterCoordinate() != 0  ) {
				
				lineCoordinate = markerLocationList.get( i ).getLineCoordinate();
				
				charStartCoordinate = markerLocationList.get( i ).getCharacterCoordinate();
				
				if( markerLocationList.get( i + 1 ).getCharacterCoordinate() != charStartCoordinate ) {
					
					charEndCoordinate = markerLocationList.get( i + 1 ).getCharacterCoordinate();
					
				}
				
				break;
				
			}
			
		}
		
		AttributeLocation attributeLocation = new AttributeLocation( lineCoordinate , charStartCoordinate , charEndCoordinate );
		
		this.attributeLocation = attributeLocation;
		
	}
	
	
	
	public String getAttributeTypeName() {
		
		return attributeTypeName;
		
	}
	
	
	
	public void setAttributeTypeName( String attributeTypeName ) {
		
		this.attributeTypeName = attributeTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String markerLocationListString = "";
		
		for( int i = 0; i < markerLocationList.size(); i++ ) {
			
			markerLocationListString = markerLocationListString + markerLocationList.get( i ) + "\r";
			
		}
		
		return "-------------------------AttributeMap ( " + attributeTypeName + " )-------------------------" + "\n" + markerLocationListString + attributeLocation;
		
	}
	
	
	
	
	
}