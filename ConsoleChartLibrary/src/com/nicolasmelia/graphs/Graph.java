package com.nicolasmelia.graphs;

/* This class serves as a builder to graph.
 * It is designed only to implement an outline
 * for its subclass. Each subclass must contain
 * its abstract methods to serve a graphs general 
 * purpose.
 */  

public abstract class Graph {

    private String xAxisName, chartName ;
	private char[] yAxisCharArray;
	private static String template;
	
	// Class's that extend graph must implement these abstract methods
	// Each type of graph must be able to draw itself
	abstract void drawGraph();
 
	// Each graph must be able to show its own data values
	abstract void displayValues();
 
	// Each graph must contain a brief analysis of its data
	abstract void setChartAnalysis(String analysis);
 
 
	// These methods are concrete for each instance of graphs subclasses
	final public void setChartName(String chartName ) {
		this.chartName = chartName ;
	}
 
	final public char[] setYAxisName(String yName){
     // convert Y axis's name to a char array for vertical display
		String YaxisName = "  "  + yName; 
		yAxisCharArray = YaxisName.toCharArray();
		return yAxisCharArray;
	}
	

	public void setXAxisName(String xAxisName) {
		this.xAxisName = xAxisName;
	}
	
	public void setTemplet(String templet){
		Graph.template = templet;
	}
	
	
	protected char[] getYAxisName (){
		return yAxisCharArray;
	}
	
	
	protected String getXAxisName(){
		return xAxisName;
	}
	
	
	public String GetChartName(){
		return chartName;
	}
	
	public void getTemplet(String templet){
		Graph.template = templet;
	}

 
 
}
