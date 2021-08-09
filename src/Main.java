import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] list = productList();
        String[] edit = editList(list);
        showList(edit);

    }

    public static String[] productList() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input List Length: ");
        int size = input.nextInt();
        input.nextLine();

        String[] list = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input Value List[" + i + "]: ");
            list[i] = input.nextLine();
        }
        return list;
    }

    public static void showList(String[] list) {
        System.out.print("Product List are: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print("[" + list[i] + "]");
        }
    }

    public static String[] addProduct(String[] list) {
        Scanner input = new Scanner(System.in);
        String[] newList = new String[list.length + 1];

        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }

        System.out.printf("input add Product in List: ");
        newList[list.length] = input.nextLine();

        return newList;
    }

    public static String[] delProduct(String[] list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input product name want delete: ");
        String nameProduct = input.nextLine();

        boolean check = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(nameProduct))
                check = true;
        }

        if (check) {
            String[] newList = new String[list.length - 1];
            int count = 0;

            for (int i = 0; i <= newList.length; i++) {
                if (list[i].equals(nameProduct))
                    newList[count++] = list[++i];
                else
                    newList[count++] = list[i];
            }
            return newList;
        } else
            return list;
    }


    public static void findList(String[] list) {
        Scanner input = new Scanner(System.in);
        System.out.print("input product want find in list: ");
        String findProduct = input.nextLine();
        int index = -1;

        for (int i = 0; i < list.length; i++) {
            if (findProduct.equals(list[i])) {
                index = i;
            }
        }
        if (index == -1)
            System.out.println("Not find product in list");
        else
            System.out.println("product " + findProduct + " in position: [" + index + "]");
    }

    public static String[] sortList(String[] list) {
        String temp = "";
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                int result = list[i].compareTo(list[j]);
                if (result > 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    public static String[] editList(String[] list) {
        Scanner input = new Scanner(System.in);
        System.out.print("input index product want to edit:");
        int index = input.nextInt();
        input.nextLine();
        System.out.print("input name product new is: ");
        String newProduct = input.nextLine();
        for (int i = 0; i < list.length; i++) {
            if (i == index) {
                list[i] = newProduct;
            }
        }
        return list;
    }
}