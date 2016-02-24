/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
//import java.awt.*;
//import javax.swing.*;
//import org.jfree.ui.RefineryUtilities;
/**
 *
 * @author Sagar Bhatt
 */
public class Linechart extends ApplicationFrame {

    @Override
    public synchronized void addWindowStateListener(WindowStateListener l) {
        super.addWindowStateListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent event) {
        //super.windowClosing(event); //To change body of generated methods, choose Tools | Templates.
        this.hide();
    }
        
public Linechart ( String applicationTitle , String chartTitle ) {
    super(applicationTitle); 
    JFreeChart lineChart = ChartFactory.createLineChart( chartTitle, "Counter","Samples value",
            createDataset(),
            PlotOrientation.VERTICAL, true,true,false ); 
    
    //CategoryPlot plot=(CategoryPlot)lineChart.getPlot();
    //CategoryAxis ax=new CategoryAxis();
    //ax.setTickLabelsVisible(false);
    //ax.setTickMarksVisible(false);
    //plot.setDomainAxis(ax);
    ChartPanel chartPanel = new ChartPanel( lineChart);
    chartPanel.setPreferredSize( new java.awt.Dimension( 1024, 367 ) );
    
    
    setContentPane(chartPanel );
    
}
 
private DefaultCategoryDataset createDataset( ) { 
    DefaultCategoryDataset dataset = new DefaultCategoryDataset( ); 
    
    for(int i=0;i<Graph.values.length;i++){
    dataset.addValue( Graph.values[i] , "Value" , String.valueOf(i) ); 
    }
    return dataset; 
    }



}
