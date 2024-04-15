package services;

import model.Pc;

import java.util.ArrayList;
import java.util.Scanner;

import static main.Main.input;

public class service {
    public static int menu()
    {
        int choose;
        do {
            System.out.println("1) Add New Pc ");
            System.out.println("2) Remove Pc ");
            System.out.println("3) Find name of ref ");
            System.out.println("4) Display all the list ");
            System.out.println("0) Quit ");

            System.out.print("put your choose : ");
            choose = input.nextInt();
        }while( choose <0 || choose > 5);
        return choose;
    }

    public static void readPc(Pc p)
    {
        System.out.print("Ref : ");
        p.setRef(input.nextInt());

        input.nextLine(); // Consume the newline character left in the buffer

        System.out.print("Model : ");
        p.setModel(input.nextLine());
        System.out.print("Quantity : ");
        p.setQuantity(input.nextInt());
        System.out.print("Price : ");
        p.setPrice(input.nextFloat());

    }

    public static void  addNewPc(ArrayList<Pc> tabPc)
    {
        Pc p = new Pc();
        readPc(p);
        tabPc.add(p);
    }

    public  static void removePc(ArrayList<Pc> tabPc,int ref)
    {
        int pos = findIndex(tabPc,ref);
        if ( pos != -1){
            tabPc.remove(pos);
            System.out.println("Your 'ref' has removed from the array");
        }else{
            System.out.println("Your 'ref' does not exist in the array");
        }

    }

    public static int findIndex(ArrayList<Pc> tabPc,int ref)
    {
        for (int i=0;i<tabPc.size();i++){
            if (tabPc.get(i).getRef() == ref){
                return i;
            }
        }
        return -1;
    }
    public static void findName(ArrayList<Pc> tabPc,int ref){
        int pos = findIndex(tabPc,ref);
        if (pos != -1){
            System.out.println("Your 'ref' has model '"+ tabPc.get(pos).getModel()+"'");
            System.out.println("We found '"+tabPc.get(pos).getQuantity()+"' peace of this model with price '"+tabPc.get(pos).getPrice()+"'");
        }
    }

    public static void displayArray(ArrayList<Pc> tabPc)
    {
        for (int i=0 ; i<tabPc.size();i++){
            System.out.print("line "+(i+1)+" : ");
            String display = tabPc.get(i).toString();
            System.out.println(display);
        }
    }


}
