package org.kranki.linkedist16;


import java.util.Scanner;

public class LinkedListLearn {
    private Scanner sc;
    Inventory inventory;

    public static void main(String[] args) {
        LinkedListLearn app = new LinkedListLearn();
        app.init();

    }

    public void init() {
        sc = new Scanner(System.in);
        inventory = new Inventory();

        int op;

        do {
            System.out.println("\n\n\t Menú \t");
            System.out.println("--Manejo de inventarios--");
            System.out.println("1.- Nuevo producto: ");
            System.out.println("2.- Agregar producto al inventario: ");
            System.out.println("3.- Eliminar producto: ");
            System.out.println("4.- Actualizar precio de producto: ");
            System.out.println("5.- Mostrar lista de productos: ");
            System.out.println("6.- Datos iniciales");
            System.out.println("7.- Salir");
            System.out.println("\nSeleccione la opción deseada: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProductExis();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProductPrice();
                    break;
                case 5:
                    printProducts();
                    break;
                case 6:
                    datosIniciales();
                    break;
            }

        } while (op != 7);
    }

    private void datosIniciales() {
        inventory.iniciar();
    }

    private void newProduct() {
        System.out.println("Id del producto");
        int id = sc.nextInt();
        System.out.println("Nombre del producto");
        String name = sc.next();
        System.out.println("Existencia inicial del producto");
        int existencia = sc.nextInt();
        System.out.println("Precio del producto");
        int price = sc.nextInt();
        inventory.newProduct(id, name, existencia, price);
    }

    private void addProductExis() {
        System.out.println("ingresa el id");
        int id = sc.nextInt();
        inventory.addProductExis(id);
    }

    private void updateProductPrice() {
        System.out.println("ingresa el id");
        int id = sc.nextInt();
        System.out.println("Precio del producto");
        int price = sc.nextInt();
        inventory.updateprice(id,price);
    }

    private void deleteProduct() {
        System.out.println("ingresa el id a borrar");
        int id = sc.nextInt();
        inventory.eliminar(id);

    }

    private void printProducts() {
        inventory.printList();
    }
}
