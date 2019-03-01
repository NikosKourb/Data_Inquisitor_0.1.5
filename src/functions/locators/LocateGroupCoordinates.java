package functions.locators;


import parameters.identifiers.AttributeIdentifier;
import parameters.identifiers.MarkerIdentifier;
import parameters.identifiers.ObjectIdentifier;
import parameters.maps.AttributeMap;
import parameters.maps.GroupMap;
import parameters.maps.ObjectMap;
import parameters.maps.locations.MarkerLocation;



public interface LocateGroupCoordinates {

	public default GroupMap getGroupCoordinates( String[] htmlLineArray , ObjectIdentifier identifier ) {
		
		AttributeIdentifier[] attributetIdentifierArray = identifier.getAttributeIdentifierArray();
		GroupMap currentGroupMap = new GroupMap();
		int currentLineIndex = 0;
		int objectCounter = 0;
		boolean attributeMarkerDistanceChecker = true;
		int startingLineIndex = 0;
		
		while( currentLineIndex < htmlLineArray.length) {
			
			ObjectMap currentObjectMap = new ObjectMap();
			
			currentGroupMap.getObjectMapList().add( objectCounter , currentObjectMap );
			
			for( int i = 0; i < attributetIdentifierArray.length; i++ ) {
				
				AttributeMap currentAttributeMap = new AttributeMap();
				
				currentObjectMap.getAttributeMapList().add( i , currentAttributeMap );
				
				AttributeIdentifier attributeIdentifier = attributetIdentifierArray[ i ];
				
				MarkerIdentifier[] markerIdentifierArray = attributeIdentifier.getMarkerIdentifierArray();
				
				for( int j = 0; j < markerIdentifierArray.length; j++ ) {
					
					String markerSearchterm = markerIdentifierArray[ j ].getSearchTerm();
					
					boolean flag = true;
					
					while( flag == true && currentLineIndex < htmlLineArray.length ) {
						
						if ( j >= 1 ) {
							
							if ( markerIdentifierArray[ j ].getRelevantLinePositionIndex() == markerIdentifierArray[ j - 1 ].getRelevantLinePositionIndex() ) {
								
								currentLineIndex = currentAttributeMap.getMarkerLocationList().get( j - 1 ).getLineCoordinate();
								
							}
							
							if ( ( markerIdentifierArray[ j ].getRelevantLinePositionIndex() - markerIdentifierArray[ j - 1 ].getRelevantLinePositionIndex() ) == ( currentLineIndex - currentAttributeMap.getMarkerLocationList().get( j - 1 ).getLineCoordinate() ) ) {
								
								boolean innerFlag = true;
								
								attributeMarkerDistanceChecker = innerFlag;
								
							}
							
						}
						
						if ( htmlLineArray[ currentLineIndex ].contains( markerSearchterm ) && attributeMarkerDistanceChecker == true ) {
							
							if( j == 0 ) {
								
								startingLineIndex = currentLineIndex;
								
							}
							
							//System.out.println( htmlLineArray[ currentLineIndex ] );//////////
							
							int characterStartPositionCoordinate = 0;
							int characterEndPositionCoordinate = 0;
							
							if ( markerIdentifierArray[ j ].getRelevantLinePositionIndex() == 0 && markerIdentifierArray[ j ].getRelevantCharacterPositionIndex() > 0 ) {
								
								characterStartPositionCoordinate = ( htmlLineArray[ currentLineIndex ].indexOf( markerIdentifierArray[ j - 1 ].getSearchTerm() ) ) + markerIdentifierArray[ j - 1 ].getSearchTerm().length() + markerIdentifierArray[ j - 1 ].getRelevantCharacterPositionIndex() + 1;
								
								currentAttributeMap.getMarkerLocationList().get( j - 1 ).setCharacterCoordinate( characterStartPositionCoordinate );
								
								characterEndPositionCoordinate = htmlLineArray[ currentLineIndex ].indexOf( markerSearchterm ) - markerIdentifierArray[ j ].getRelevantCharacterPositionIndex() + 1;
								
							}
							
							MarkerLocation markerLocation = new MarkerLocation( currentLineIndex , characterEndPositionCoordinate );
							
							currentAttributeMap.getMarkerLocationList().add( j , markerLocation );
							
							currentAttributeMap.setAttributeLocation();
							
							currentAttributeMap.setAttributeTypeName( attributetIdentifierArray[ i ].getAttributeTypeName() );
							
							flag = false;
							
						}
						
						currentLineIndex++;
						
						if ( attributeMarkerDistanceChecker == false ) {
							
							currentLineIndex = startingLineIndex + 1;
							
							currentAttributeMap.getMarkerLocationList().remove( j );
							
							j = 0;
							
						}
						
					}
					
				}
				
				currentObjectMap.setObjectTypeName( attributetIdentifierArray[ 0 ].getMarkerIdentifierArray()[ 0 ].getObjectTypeName() + " " + ( objectCounter + 1 ) );
				
			}
			
			objectCounter++;
			
		}
		
		currentGroupMap.getObjectMapList().remove( objectCounter - 1 );
		
		currentGroupMap.setGroupTypeName( attributetIdentifierArray[ 0 ].getMarkerIdentifierArray()[ 0 ].getGroupTypeName() );
		
		return currentGroupMap;
		
	}
	
	
	
	
	
}