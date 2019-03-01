package functions.transfigurers.html;


import java.io.File;

import functions.transfigurers.string.StringToTextFileTransfigure;



public interface HTMLPageToTextFileTransfigure extends HTMLPageToStringTransfigure , StringToTextFileTransfigure {
	
	
	
	public default File HTMLPageToTextFile( String urlAddress , String filename ) {
		
		String htmlString = HTMLPageToString( urlAddress );
		
		File htmlTextFile = StringToTextFile( htmlString , filename );
		
		return htmlTextFile;
		
	}
	
	
	
	
	
}
