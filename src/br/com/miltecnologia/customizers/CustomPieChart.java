package br.com.miltecnologia.customizers;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;

/**
 *
 * @author rebecca
 */
public class CustomPieChart implements JRChartCustomizer{
    @Override
    public void customize(JFreeChart jfc, JRChart jrc) {
        Plot plot = jfc.getPlot();
        if (plot instanceof PiePlot) {
            PiePlot piePlot = (PiePlot) plot;
            piePlot.setLabelGenerator(null);
        }
    }
}
