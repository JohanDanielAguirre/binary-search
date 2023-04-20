package ui;
import model.*;
import java.util.*;
public class Main {
    public static  Scanner scanner = new Scanner(System.in);
    public Main() {
    }
    private static BST tree;
    public static void main(String[] args) {
        Main m = new Main();
        tree = new BST();
        System.out.println("ingrese los datos con un espacio entre ellos");
        String names = scanner.nextLine();
        String[] array = names.split(" ");
        ArrayList<String> alist = new ArrayList<>();
        Collections.addAll(alist, array);
        m.make(alist);
    }

    private void make(ArrayList<String> alist) {
        String a = "";
        int i = 0;
        alist = tree.sort(alist);
        do {
            a = a + alist.get(i) + " ";
            i++;
        } while (i != alist.size());
        System.out.println(a);
        System.out.println("escriba un parametro a buscar");
        String names = scanner.nextLine();
        String y=tree.binarysearch(alist,names);
        if(y.equalsIgnoreCase("-1")){
            System.out.println("no existe en la lista");
        }else{
            System.out.println("el numero se encuentra en la posicion "+ y);
        }
    }
}