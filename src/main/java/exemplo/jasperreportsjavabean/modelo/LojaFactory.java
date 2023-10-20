/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.jasperreportsjavabean.modelo;

import jakarta.mail.internet.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class LojaFactory {

    public static List<Factura> criar() throws java.text.ParseException {

        Factura factura01 = new Factura();
        Factura factura02 = new Factura();
        Factura factura03 = new Factura();

        factura01.setNumero(1);
        factura02.setNumero(2);
        factura03.setNumero(3);

        SimpleDateFormat textDate = new SimpleDateFormat("dd/MM/yyyy");
        try {
            factura01.setData(textDate.parse("05/08/2020"));
            factura02.setData(textDate.parse("10/08/2020"));
            factura03.setData(textDate.parse("10/08/2022"));
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        ItensFactura itensFactura01 = new ItensFactura();
        ItensFactura itensFactura02 = new ItensFactura();
        ItensFactura itensFactura03 = new ItensFactura();

        itensFactura01.setItem(new Item("Mambolebole", 200.0));
        itensFactura01.setQuantidade(6);

        itensFactura01.setItem(new Item("Nkundo", 500.0));
        itensFactura01.setQuantidade(2);

        itensFactura01.setItem(new Item("Makuyiu", 150.0));
        itensFactura01.setQuantidade(10);

        itensFactura02.setItem(new Item("O'nema", 1000.0));
        itensFactura02.setQuantidade(6);
        itensFactura02.setItem(new Item("O'Nuyi", 500000.0));
        itensFactura02.setQuantidade(4);

        itensFactura03.setItem(new Item("O'thifufwa", 200.0));
        itensFactura03.setQuantidade(4);
        itensFactura03.setItem(new Item("Ekwadanbolo", 500.0));
        itensFactura03.setQuantidade(4);

        factura01.setItensFacturas(Arrays.asList(itensFactura01, itensFactura02));
        factura02.setItensFacturas(Arrays.asList(itensFactura03));

        return Arrays.asList(factura01, factura02);
    }

}
