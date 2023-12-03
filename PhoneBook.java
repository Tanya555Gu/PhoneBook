import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> map = new HashMap<>();

    void addPhoneNumber2(String phoneNumb, String name) {
        if (!map.containsKey(phoneNumb)) {
            map.put(phoneNumb, name);
        } else {
            System.out.println("Вводимый номер уже имеется");
        }
    }

    String findByName(String searchName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getValue();
            String phoneNumb = entry.getKey();
            if (searchName.equals(name)) {
                stringBuilder.append(phoneNumb);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String findByPhoneNumber(String phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String phoneNumb = entry.getKey();
            String name = entry.getValue();
            if (phoneNumber.equals(phoneNumb)) {
                stringBuilder.append(phoneNumb);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getFullInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Весь список:\n");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String phoneNumb = entry.getKey();
            String name = entry.getValue();
            stringBuilder.append(phoneNumb);
            stringBuilder.append(": ");
            stringBuilder.append(name);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    void deliteNumber(String delPhoneNumber) {
        map.remove(delPhoneNumber);
    }

}