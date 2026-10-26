package collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    public static void main(String[] args) {
        Map<String,String> contacts = new HashMap<String,String>();
        contacts.put("pm","0793094427");
        contacts.put("pm","12345");
        contacts.put("Damascene10","+250788896794");
        contacts.put("RIB","112");
        contacts.put("Dan","0788843395");
        contacts.put("RCA","+2507886702");
        System.out.println("The principal phone is " + contacts.get("pm"));
        System.out.println("Looping in a mpa");
       for (String s:contacts.keySet()) {
           System.out.println(contacts.get(s));
       }
    }
}
