/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.jasperreportsjavabean.modelo;

import jakarta.mail.internet.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
            factura01.setData(textDate.parse("05/08/2021"));
            factura02.setData(textDate.parse("10/08/2020"));
            factura03.setData(textDate.parse("20/08/2022"));
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        ItensFactura itensFactura11 = new ItensFactura();
        ItensFactura itensFactura12 = new ItensFactura();
        ItensFactura itensFactura13 = new ItensFactura();
        ItensFactura itensFactura14 = new ItensFactura();

        ItensFactura itensFactura21 = new ItensFactura();
        ItensFactura itensFactura22 = new ItensFactura();
        ItensFactura itensFactura23 = new ItensFactura();

        ItensFactura itensFactura31 = new ItensFactura();
        ItensFactura itensFactura32 = new ItensFactura();

        itensFactura11.setItem(new Item("Mambolebole", 200.0));
        itensFactura11.setQuantidade(6);
        itensFactura12.setItem(new Item("Nkundo", 500.0));
        itensFactura12.setQuantidade(2);
        itensFactura13.setItem(new Item("Makuyiu", 150.0));
        itensFactura13.setQuantidade(10);
         itensFactura14.setItem(new Item("Mangayawa", 150.0));
        itensFactura14.setQuantidade(3);

        itensFactura21.setItem(new Item("O'nema", 1000.0));
        itensFactura21.setQuantidade(6);
        itensFactura22.setItem(new Item("O'Nuyi", 500000.0));
        itensFactura22.setQuantidade(4);
        itensFactura23.setItem(new Item("O'Tchingulu", 100000.0));
        itensFactura23.setQuantidade(9);

        itensFactura31.setItem(new Item("O'thifufwa", 200.0));
        itensFactura31.setQuantidade(7);
        itensFactura32.setItem(new Item("Ekwadanbolo", 500.0));
        itensFactura32.setQuantidade(5);

        factura01.setItensFacturas(Arrays.asList(itensFactura11, itensFactura12, itensFactura13, itensFactura14));
        factura02.setItensFacturas(Arrays.asList(itensFactura21, itensFactura22, itensFactura23));
        factura03.setItensFacturas(Arrays.asList(itensFactura31, itensFactura32));

        return Arrays.asList(factura01, factura02, factura03);

    }

}
