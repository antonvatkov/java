package homworkJavaSyntaxis;

import java.util.Scanner;

public class P2_TriangleArea {
	//public static void main(String [] args){
	    
	double cordX;
	double cordY;
	   
	   public P2_TriangleArea(double cordX,double cordY){
		   this.cordX = cordX;
		   this.cordY = cordY;
	   }
	   
	   public static void calcArea( P2_TriangleArea firstEdge
			   ,P2_TriangleArea secondEdge 
			   ,P2_TriangleArea thirdEdge){
		   double triangleArea = 0D;
		   if(firstEdge.equals(secondEdge)||firstEdge.equals(thirdEdge)
				   ||secondEdge.equals(thirdEdge)){
		   System.out.println("0");
		   }
		   triangleArea = (firstEdge.cordX*(secondEdge.cordY - thirdEdge.cordY))/2;
		   triangleArea +=  (secondEdge.cordX*(thirdEdge.cordY - firstEdge.cordY))/2;
		   triangleArea +=  (thirdEdge.cordX*(firstEdge.cordY - secondEdge.cordY))/2;
		   int area = (int) triangleArea;
		   System.out.printf("%s",area);
	}
	   public static void main (String [] args){
		   
		   System.out.println("Please enter point cordx");
		   System.out.println("Please enter point cordy");
		   Scanner inputCordinate = new Scanner(System.in);
		   P2_TriangleArea firstEdge = new P2_TriangleArea(inputCordinate.nextDouble(),inputCordinate.nextDouble());
		   P2_TriangleArea secondEdge = new P2_TriangleArea(inputCordinate.nextDouble(),inputCordinate.nextDouble());
		   P2_TriangleArea thirdEdge = new P2_TriangleArea(inputCordinate.nextDouble(),inputCordinate.nextDouble());
		   calcArea(firstEdge,secondEdge,thirdEdge);
	   }
	
}
