package parameters.extracts;


public class ExtractedAttribute {

	private String attributeValue;
	private String attributeTypeName;
	
	
	public ExtractedAttribute() {}
	
	
	public ExtractedAttribute( String attributeValue , String attributeTypeName ) {
		
		this.attributeValue = attributeValue;
		
		this.attributeTypeName = attributeTypeName;
		
	}
	
	
	
	public String getAttributeValue() {
		
		return attributeValue;
		
	}
	
	
	
	public void setAttributeValue( String attributeValue ) {
		
		this.attributeValue = attributeValue;
		
	}
	
	
	
	public String getAttributeTypeName() {
		
		return attributeTypeName;
		
	}
	
	
	
	public void setAttributeTypeName( String attributeTypeName ) {
		
		this.attributeTypeName = attributeTypeName;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "ExtractedAttribute [ Type= " + attributeTypeName + " , Value= " + attributeValue + " ]";
		
	}
	
	
	
	
	
}
