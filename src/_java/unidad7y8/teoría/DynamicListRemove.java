package _java.unidad7y8.teoría;

import java.util.ArrayList;
import java.util.List;

public class DynamicListRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(20);

        list.add("Juan");
        list.add("Pedro");
        list.add("José");
        list.add("María");
        list.add("Sofía");
        
        System.out.println(list);
        
        list.remove("Juan");
        list.remove("María");

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
    }
    
}