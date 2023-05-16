import java.lang.reflect.Array;
import java.util.Scanner;  // Import the Scanner class
import org.knowm.xchart.*;
import org.knowm.xchart.style.markers.SeriesMarkers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter Velocity in meters/second:");
        double velocity = obj.nextDouble();  // Read user input
        
        System.out.println("Enter Time in seconds:");
        double time = obj.nextDouble();  // Read user input

        double[] timeData= new double[(int) time];
        double[] positionData = new double[(int) velocity];
        
        //calculate distance
        double distance = velocity * time;
        double[] y = positionData;    
      
        List<XYChart> charts = new ArrayList<XYChart>();
 
    for (int i = 0; i < time; i++) {
      XYChart chart = new XYChartBuilder().xAxisTitle("X").yAxisTitle("Y").width(600).height(400).build();
      chart.getStyler().setYAxisMin((double) -10);
      chart.getStyler().setYAxisMax((double) 10);
      XYSeries series = chart.addSeries("" + i, null, y);
      series.setMarker(SeriesMarkers.NONE);
      charts.add(chart);
    }
    new SwingWrapper<XYChart>(charts).displayChartMatrix();
  }
 
  



        
        


    

   
    
    
    
}

  
    
    

