package org.kranki.linkedist16;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Product> productList = new LinkedList<>();

    public void iniciar() {
        Product f = new Product(1, "chocolate", 5, 9);
        productList.add(f);
    }

    public void newProduct(int id, String name, int existencia, int price) {
        Product productNew = new Product(id, name, existencia, price);
        boolean yesAdd = productList.add(productNew);
        System.out.println("producto ingresado correctamente");
    }

    //imprimir contenido
    void printList() {
        System.out.println("Los datos de tu lista son: ");
        productList.forEach(System.out::println);
    }

    void addProductExis(int id) {
        int productIndex = productList.indexOf(new Product(id));
        Product product = productList.get(productIndex);
        product.setExistence(product.getExistence() + 1);
        System.out.println("se agrego uno mas a la existencia");
    }

    public void updateprice(int id, int price) {
        int productIndex = productList.indexOf(new Product(id));
        Product product = productList.get(productIndex);
        product.setPrice(price);
        System.out.println("se actualizo el precio");
    }

    public void eliminar(int id) {
        int productIndex = productList.indexOf(new Product(id));
        Product prodDelete = productList.remove(productIndex);
        if (prodDelete != null) {
            System.out.println("producto eliminado");
        } else {
            System.out.println("no se pudo eliminar el producto");
        }
    }
}
