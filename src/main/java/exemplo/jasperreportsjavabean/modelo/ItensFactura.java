/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.jasperreportsjavabean.modelo;

/**
 *
 * @author informatica
 */
public class ItensFactura {
    private Item item;
    private Integer quantidade;

    public ItensFactura() {
    }

    public ItensFactura(Item item, Integer quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }
    
    

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
