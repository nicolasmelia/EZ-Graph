package com.nicolasmelia.example;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.nicolasmelia.graph_items.Bar;
import com.nicolasmelia.graphs.BarGraph;
import com.nicolasmelia.graphs.Graph;


public class Main {

	public static void main(String[] args) {

		// Create bar objects for the graph by value then name
	    Bar bar1 = new Bar(4,"May");
	    Bar bar2 = new Bar(7,"June");
	    Bar bar3 = new Bar(3,"July");
	    Bar bar4 = new Bar(5,"Aug.");
	    Bar bar5 = new Bar(8,"Sept.");
	    Bar bar6 = new Bar(9,"Oct.");

	    // create a new graph with proper parameters
	     BarGraph graph1 = new BarGraph(bar1, bar2, bar3, bar4, bar5, bar6);

	     graph1.setChartName("Income by Month");
	     graph1.setXAxisName("Months");
	     graph1.setYAxisName("Mill");
	     graph1.setChartAnalysis("Looks like I will be rich");

        // Method to draw graph in console
		graph1.drawGraph();
	}


}
