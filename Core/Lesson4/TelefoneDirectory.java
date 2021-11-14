import java.util.LinkedHashMap;
import java.util.Map;

public class TelefoneDirectory {
    LinkedHashMap<String, String> telefoneDirectory = new LinkedHashMap<>();
    String surname;
    String phone;

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public void add(String phone, String surname) {
        telefoneDirectory.put(phone, surname);
    }

    public void get(String surname) {
        for (Map.Entry<String, String> g : telefoneDirectory.entrySet()) {
            if (surname.equals(g.getValue())) {
                System.out.println(surname + " " + g.getKey());
            }
        }
    }
}
