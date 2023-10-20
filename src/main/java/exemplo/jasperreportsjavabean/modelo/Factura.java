/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.jasperreportsjavabean.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class Factura {
    private Integer numero;
    private Date data;
    private List<ItensFactura> itensFacturas;

    public Factura() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    

    public List<ItensFactura> getItensFacturas() {
        return itensFacturas;
    }

    public void setItensFacturas(List<ItensFactura> itensFacturas) {
        this.itensFacturas = itensFacturas;
    }
    
    
}
