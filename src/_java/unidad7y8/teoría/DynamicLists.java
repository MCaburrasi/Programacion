package _java.unidad7y8.teoría;

import java.util.ArrayList;
import java.util.List;

public class DynamicLists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Juan");
        list.add("Pedro");
        list.add("José");
        list.add("María");
        list.add("Sofía");
        
        System.out.println(list);
        list.add(3, "Carlos");
        System.out.println(list);
    }
    
}