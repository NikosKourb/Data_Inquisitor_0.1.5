package functions.extractors;


import parameters.extracts.ExtractedAttribute;
import parameters.extracts.ExtractedGroup;
import parameters.extracts.ExtractedObject;
import parameters.maps.GroupMap;
import parameters.maps.locations.AttributeLocation;



public interface ExtractGroup {
	
	public default ExtractedGroup extractGroupData( String[] htmlLineArray , GroupMap groupMap ) {
		
		ExtractedGroup extractedGroup = new ExtractedGroup();
		
		extractedGroup.setGroupTypeName( groupMap.getGroupTypeName() );
		
		for(int i = 0; i < groupMap.getObjectMapList().size(); i++ ) {
			
			ExtractedObject extractedObject = new ExtractedObject();
			
			extractedGroup.getExtractedObjectList().add( i , extractedObject );
			
			extractedObject.setObjectTypeName( groupMap.getObjectMapList().get( i ).getObjectTypeName() );
			
			for(int j = 0; j < groupMap.getObjectMapList().get( i ).getAttributeMapList().size(); j++ ) {
				
				AttributeLocation attributeLocation = groupMap.getObjectMapList().get( i ).getAttributeMapList().get( j ).getAttributeLocation();
				
				String line = htmlLineArray[ attributeLocation.getLineCoordinates() ];
				
				String attributeValue = line.substring( attributeLocation.getCharacterStartCoordinates() , attributeLocation.getCharacterEndLocation() ).trim();
				
				String attributeTypeName = groupMap.getObjectMapList().get( i ).getAttributeMapList().get( j ).getAttributeTypeName();
				
				ExtractedAttribute extractedAttribute = new ExtractedAttribute( attributeValue , attributeTypeName );
				
				extractedObject.getExtractedAttributeList().add( j , extractedAttribute );
				
			}
			
		}
		
		return extractedGroup;
		
	}
	
	
	
	
	
}