package com.nicolasmelia.graphs;
import java.util.ArrayList;

import com.nicolasmelia.graph_items.Bar;

public class BarGraph extends Graph {

    ArrayList<Bar> barObjects = new ArrayList<Bar>();
    String analysis;

	public BarGraph(Bar... bars) {
		// This  constructor method builds the graph object
	      for (Bar bar: bars) {
	    	  barObjects.add(bar);
	      }
	}
	
	@Override
	public void displayValues() {
      // Display values the user has input for each bar	
		System.out.println("Chart: " + super.GetChartName());
		for(Bar bar: barObjects) {
			System.out.print("Bar " + bar.getName() + " Value: " + bar.getValue() + "\n");
		}
	
	}
	
	@Override
	public void setChartAnalysis(String analysis) {
		this.analysis = analysis; 
	}

	@Override
	public final void drawGraph(){
    	
		//Placeholder defines the height of graph, EX. 10 Lines high
        Bar placeHolderBar = new Bar(10, "PlaceHolder");
        int placeHolder =  placeHolderBar.getValue();
		
		int placeHolderCount = 0;
		int YAxisNumber = 10;
		
		// Get y axis name and prepare with incrementing int
		char[] yAxisName = super.getYAxisName();
		int yAxisint = 0;
		
		
		// Display chart name
		System.out.print("\n");
		if (super.GetChartName() != null) {
			for(Bar bar:barObjects) {
				System.out.print("    ");
			}
			System.out.println(super.GetChartName() + "\n");
		}

		for (placeHolderCount = 0; placeHolderCount <= placeHolder; placeHolderCount++) {

			// Block to display YAxis name on left side of graph
			if (YAxisNumber != 0) {
		
				if (yAxisName == null) {
					String EmptyYAxis = " " ; 
					yAxisName = EmptyYAxis.toCharArray();
					}
			
				if (yAxisint < yAxisName.length) {
					if (YAxisNumber > 9) {
					System.out.print( " " + yAxisName[yAxisint] + " " + YAxisNumber + "|");
					} else {
						System.out.print( " " + yAxisName[yAxisint] + "  " + YAxisNumber + "|");
					}
					yAxisint++;
				} else {
					if (YAxisNumber >= 10) {
						System.out.print("   " + YAxisNumber + "|");
					} else {
						System.out.print("    " + YAxisNumber + "|");
					   }

					}
				
				YAxisNumber--;

				// Draw bars here
				 for (int i = 0; i < barObjects.size(); i++) {
				        drawBar(placeHolderCount,  10 - barObjects.get(i).getValue(), i);
				}

				 
				 
			} else {
				System.out.print("     |______");
				for(Bar bar:barObjects) {
					System.out.print("________");
				}
				
				// Bars names. Formated left justified. 
				   System.out.print("\n");	
				   System.out.print("        ");
				   
				for(int i = 0; i < barObjects.size(); i++) {
					
					if (barObjects.get(i).getName() != null) {
					    System.out.print(String.format("%-8s %s" , barObjects.get(i).getName(), ""));	
						} else {
				       System.out.print(String.format("%-8s %s" , "NONE", ""));	
						}
				}

				System.out.print("\n\n");	

				for(Bar bar:barObjects) {
					System.out.print("    ");
				}
				
				if (super.getXAxisName() != null) {
					System.out.print("" +  super.getXAxisName());
					}
				
				if (analysis != null) {
				System.out.println("\n\n      Analysis: " + analysis);
				}
			}	
			
			System.out.print("\n");	
		}


    }
	
	private void drawBar(int placeHolderCount, int barValue, int barNumber){
		
		barValue =  10 - barObjects.get(barNumber).getValue();
		

		if (placeHolderCount >= barValue) {
			System.out.print("  ---    ");
		} else {
			System.out.print("         ");
		}
		
	}
  
    

}
