/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package exemplo.jasperreportsjavabean.cdibean;

import exemplo.jasperreportsjavabean.modelo.Factura;
import exemplo.jasperreportsjavabean.modelo.LojaFactory;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Named(value = "relatoriosBean")
@ViewScoped
public class RelatoriosBean implements Serializable {

    JasperPrint jasperPrint;

    public void visualizaRelatorio() throws JRException, IOException, ParseException {

        List<Factura> dataList;

        dataList = LojaFactory.criar();

      
        try {

            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(dataList);
            String reportPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/WEB-INF/reports/factura.jasper");
           
            jasperPrint = JasperFillManager.fillReport(reportPath, new HashMap(), beanCollectionDataSource);
            HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
          
            /*a linha de codigo a seguir descarrega o ficheiro em PDF*/
            //httpServletResponse.addHeader("Content-disposition", "attachment; filename=relatorio.pdf");

            ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
            
              /*a linha de codigo a seguir manda o ficheiro para a impressora predefinida*/
            //JasperPrintManager.printPage(jasperPrint, 0, false);
            
            servletOutputStream.flush();
            servletOutputStream.close();
        } catch (IOException | JRException ioe) {

            ioe.printStackTrace();
        }
       
        FacesContext.getCurrentInstance().responseComplete();
        FacesContext.getCurrentInstance().responseComplete();
    }

}
