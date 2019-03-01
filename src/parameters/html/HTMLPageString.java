package parameters.html;


import functions.transfigurers.html.HTMLPageToStringTransfigure;



public class HTMLPageString extends HTMLPage implements HTMLPageToStringTransfigure {
	
	private String htmlString;
	
	
	public HTMLPageString() {}
	
	
	public HTMLPageString( String urlAddress ) {
		
		super( urlAddress );
		
		this.htmlString = HTMLPageToString( urlAddress );
		
	}
	
	
	
	public String getHtmlString() {
		
		return htmlString;
		
	}
	
	
	
	public void setHtmlString() {
		
		this.htmlString = HTMLPageToString( getUrlAddress() );
		
	}
	
	
	
	@Override
	public String toString() {
		
		return htmlString;
		
	}
	
	
	
	
}
