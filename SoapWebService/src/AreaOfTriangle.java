
public class AreaOfTriangle {
	
	public String area(double a, double b, double c){
		
		if( a<=0 || b<=0 || c<=0 ){
			return "Side length can not be zero or negative.";
		}
		double s=(a+b+c)/2;
		if( s<=a || s<=b || s<=c ){
			return "Triagle can not be formed with these sides.";
		}
		
		double area= (Math.sqrt(s*(s-1)*(s-b)*(s-c)));
		return "Area : " + area;
	}

}


//http://localhost:8080/SoapWebServiceClient/sampleAreaOfTriangleProxy/TestClient.jsp