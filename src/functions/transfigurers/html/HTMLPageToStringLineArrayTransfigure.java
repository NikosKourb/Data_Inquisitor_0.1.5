package functions.transfigurers.html;


import functions.transfigurers.string.StringToStringArrayTransfigure;



public interface HTMLPageToStringLineArrayTransfigure extends HTMLPageToStringTransfigure , StringToStringArrayTransfigure {
	
	
	
	public default String[] HTMLPageToStringLineArray( String urlAddress ) {
		
		String string = HTMLPageToString( urlAddress );
		
		String[] stringArray = StringToStringArray( string );
		
		return stringArray;
		
	}
	
	
	
	
	
}
