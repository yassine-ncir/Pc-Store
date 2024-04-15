//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.Pc;
import services.service;

public class Main {
    public static final Scanner input;

    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Pc> tabPc = new ArrayList();

        int choose;
        do {
            System.out.println(" <-> <-> <->  Menu  <-> <-> <-> ");
            choose = service.menu();
            int ref;
            switch (choose) {
                case 1:
                    System.out.println(" <-> <-> <->  Add New Pc  <-> <-> <-> ");
                    service.addNewPc(tabPc);
                    break;
                case 2:
                    System.out.println(" <-> <-> <->  Remove Pc  <-> <-> <-> ");
                    System.out.print("Put your ref : ");
                    ref = input.nextInt();
                    service.removePc(tabPc, ref);
                    break;
                case 3:
                    System.out.println(" <-> <-> <->  Find Name of Ref  <-> <-> <-> ");
                    System.out.print("Put your ref : ");
                    ref = input.nextInt();
                    service.findName(tabPc, ref);
                    break;
                case 4:
                    System.out.println(" <-> <-> <->  Display All The List  <-> <-> <-> ");
                    service.displayArray(tabPc);
                    break;
                case 5:
                    System.out.println(" <-> <-> <->  Selection Sort  <-> <-> <-> ");
                    System.out.print("The array before sort : ");
                    service.displayArray(tabPc);
                    System.out.print("The array after sort : ");
                    service.selectionSort(tabPc);
                    service.displayArray(tabPc);
                    break;
                default:
                    System.out.println("Sorry,you don't choose anythig ");
            }
        } while(choose != 0);

    }

    static {
        input = new Scanner(System.in);
    }
}
