<h3>EZ-Graph: Console Bar Graph Lib (JAVA)</h3>
<p>
How easy is it to create a custom bar graph in a console? With this library, 
5 lines of code. This is an expansive, open source library designed to make 
creating graphs in the console as easy as pie! No pun intended.
</p>

![alt tag](https://github.com/nicolasmelia/EZ-Graph/blob/master/About/consoleGraph.jpg)

<pre>
// Create and set the bar's values. 
// Bar bar = new Bar(VALUE,NAME OF BAR);
     
Bar bar1 = new Bar(4,"May");
Bar bar2 = new Bar(7,"June");
Bar bar3 = new Bar(3,"July");
Bar bar4 = new Bar(5,"Aug.");
Bar bar5 = new Bar(8,"Sept.")
Bar bar6 = new Bar(9,"Oct.");

// create a new graph with each bar. Pass in the bars individually or as an array of Bars.
BarGraph graph1 = new BarGraph(bar1, bar2, bar3, bar4, bar5, bar6);

// Create and set your graphs properties 
graph1.setChartName("Income by Month");
graph1.setXAxisName("Months");
graph1.setYAxisName("Mill");
graph1.setChartAnalysis("Looks like I will be rich");

// Draw the graph in console
graph1.drawGraph();
</pre>

<p>
Open source under the MIT License (MIT)
</p>

