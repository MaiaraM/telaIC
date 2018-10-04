/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.ic;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author maiara
 */
public class LineChartHelper {

    public LineChartHelper(){
    }

    public  ChartPanel criar(){
        DefaultCategoryDataset dataset = createDataset();
         
        JFreeChart chart = ChartFactory.createLineChart(
        "Teste", // Chart title
        "", // X-Axis Label
        "Variação", // Y-Axis Label
        dataset
        );
        
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
    
     private DefaultCategoryDataset createDataset() {
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         dataset.addValue(1, "Linar", "");
         dataset.addValue(5, "Linar", "");
         dataset.addValue(30, "Linar", "");
         dataset.addValue(150, "Linar", "");
         dataset.addValue(500, "Linar", "");
         dataset.addValue(800, "Linar", "");
         dataset.addValue(1024, "Linar", "");
         
         return dataset;
     }



}
