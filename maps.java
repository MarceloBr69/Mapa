import java.util.HashMap;
import java.util.Set;

public class maps {
    public static void main(String[] args){
        HashMap <String, String> Canciones = new HashMap<String, String>();
        Canciones.put("Shihoko Hirata", "Heartbeat, Heartbreak");
        Canciones.put("Atlus Sound Team", "The Days When My Mother Was There");
        Canciones.put("Frou Frou", "A new Kind of Love");
        Canciones.put("bbragui", "Don't be Afraid");

        
        String name = Canciones.get("bbragui");
        System.out.println(name);

        Set<String> keys = Canciones.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(Canciones.get(key));
        }
    }
}
