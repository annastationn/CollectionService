package dev.infochem.consoleapp;

import dev.infochem.consoleapp.OrganizationObject.*;
import dev.infochem.consoleapp.Exceptions.*;

import java.util.*;
import java.util.Date;
import static dev.infochem.consoleapp.OrganizationObject.OrganizationType.*;

public class CollectionService {
    protected static Long elementsCount = 0L; //объявление статической переменной elementsCount, которая используется для хранения количества элементов в коллекции.
    private Date initializationDate;
    protected static LinkedHashMap<Long, Organization> collection;
    private boolean isReversed = false;

    protected static Scanner InputScanner;
    private long id;

    public CollectionService() {
        collection = new LinkedHashMap<>();
        this.initializationDate = new Date();
    }


  private class CompareOrganization implements Comparator<Organization>
  //Опредление вложенного класса
  {

        @Override
        public int compare(Organization o1, Organization o2) {
            return o1.getName().length() - o2.getName().length();
        }
        @Override
        public Comparator<Organization> reversed() {
            return Comparator.super.reversed();
        }
    }
    protected record OrganizationWithOutId (String name, Coordinates coordinates, Date creationDate, float annualTurnover, OrganizationType organizationType, String officialAddress) {}

    public void addElement() {
        OrganizationWithOutId source =  createElement();
        elementsCount+=1;
        Organization newElement = new Organization(
            elementsCount,
            source.name,
            source.coordinates,
            source.creationDate,
            source.officialAddress,
            source.organizationType,
            source.annualTurnover
        );
        collection.put(elementsCount, newElement);
        System.out.println("Элемент успешно добавлен");
    }
    public void info() {
        System.out.println("Тип коллекции: " + collection.getClass().getName());
        System.out.println("Дата создания: " + initializationDate);
        System.out.println("Количество элементов: " + collection.size());
    }
    public void show(long current_id) {
        if (!collection.containsKey(current_id)){
            System.out.println("Элемента с таким id не существует");
            return;
        }
        Iterator<Map.Entry<Long, Organization>> iterator = collection.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, Organization> entry = iterator.next();
            if (current_id == entry.getKey()) {
                iterator.remove(); //удаление элемента через итератор
            OrganizationWithOutId source = createElement();
            Organization newElement = new Organization(
                    current_id,
                    source.name,
                    source.coordinates,
                    source.creationDate,
                    source.id,
                    source.officialAddress,
                    source.type,
                    source.annualTurnover
            );
            System.out.println("Элемент с id" + current_id + "успешно изменён");
            break;
        }
    }
}
public void removeById(long id) {
        if (!collection.containsKey(collection.get((int) id))){
            System.out.println("Элемента с таким id не существует");
            return;
        }
       collection.remove(id);
    System.out.println("Элемент с id" + id + "успешно удалён");
            }

public void clear(){
        collection.clear();
    System.out.println("Все элементы успешно удалены");
}
public void removeGreater(long startId) {
        long endId = collection.size();
//проверка, что startId меньше или равен размеру коллекции
        if (startId > collection.size()) {
            System.out.println("Элемента с таким id не существует");
        } else {
            //удаление элементов с id больше startedid
            collection.entrySet().removeIf(entry -> entry.getKey() > startId);
            System.out.println("Элементы с id больше" + startId + "успешно");
}
    }
public void reorder(){
        //создание компаратора для сортировки
        CompareOrganization comparator = new CompareOrganization();
        //Преобразование LinkedHashMap в список для сортировки
    List <Map.Entry<Long, Organization>> list = new ArrayList<>(collection.entrySet());
        if (!isReversed) {
            //Сортировка по убыванию
            list.sort(Map.Entry.comparingByValue(comparator));
            Collections.reverse(list);
            isReversed = true;
            System.out.println("//Коллекция отсортирована по убыванию/// \n");
        } else {
            //Сортировка по возрастанию
            list.sort(Map.Entry.comparingByValue(comparator));
            isReversed = false;
            System.out.println("///Коллеция отсортирована по возрастанию/// \n");
        }
        //Обновление LinkedHashMap после сортировки
    collection.clear();
        list.forEach(entry -> collection.put(entry.getKey(), entry.getValue()));
        show(elementsCount);
}
public void removeAllByType (OrganizationType type) {
    //Удаление всех элементов определенного типа
    collection.entrySet().removeIf(entry -> entry.getValue().getType().equals(type));
    System.out.println("Организации типа" + type + "успешно удалены");
}
    //чет хуйня надо пересмотреть
public void counterAnnualTurnover(float annualTurnover) {
    //Подсчет количества организаций с годовым оборотом выше заданного
    long count = collection.values().stream().filter(organization -> organization.getAnnualTurnover() > annualTurnover).count();
    System.out.println("Годовой оборот выше заданного" + count);
}
public void filterStartsWithName(String prefix) {
    //Фильтрация элементов,начинающихся с заданной строки
    boolean hasItem = collection.values().stream().anyMatch(organization -> organization.getName().startsWith(prefix));
    if (hasItem) {
        collection.values().stream().filter(organization -> organization.getName().startsWith(prefix)).forEach(organization -> System.out.println(organization + "\n"));
    } else {
        System.out.println("Элементов с таким именем не существует");
    }
}
private String askString (Scanner InputScanner) {
    while(true) {
        try {
            String name = InputScanner.nextLine().trim();
            if (name.isBlank()) {
                throw new EmptyFieldException("Поле не может быть пустым. Введите его ещё раз: ");
            }
            return name;
        } catch (EmptyFieldException e) {
            System.out.println(e.getMessage());
        }
    }
}
private float askX(Scanner InputScanner) {
    while(true) {
        try {
            return Float.parseFloat(InputScanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа. Введите его повторно: ");
        }
    }
}
private double askY(Scanner InputScanner) {
    while(true) {
        try {
            return Double.parseDouble(InputScanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа. Введите его повторно: ");
        }
    }
}
private float askFloat (Scanner InputScanner) {
    while (true) {
        try {
            float num = Float.parseFloat(InputScanner.nextLine());
            if (num > 0) {
                return num;
            } else {
                throw new NegativeFieldException("Число не может быть отрицательным. Введите его ещё раз: ");
            }}
            catch(NumberFormatException e){
                System.out.println("Неверный формат числа. Введите его повторно: ");
            } catch(NegativeFieldException e){
                System.out.println(e.getMessage());
            }
        }
    }
    private OrganizationType OrganizationType(Scanner InputScanner) {
        while (true) {
            try{
                String type = InputScanner.nextLine().toUpperCase();
                OrganizationType organizationType;
                switch (type) {
                    case "COMMERCIAL":
                        organizationType = COMMERCIAL;
                        break;
                    case "GOVERNMENT":
                        organizationType = GOVERNMENT;
                        break;
                    case "TRUST":
                        organizationType = TRUST;
                        break;
                    case "PRIVATE_LIMITED_COMPANY":
                        organizationType = PRIVATE_LIMITED_COMPANY;
                        break;
                    case "OPEN_JOINT_STOCK_COMPANY":
                        organizationType = OPEN_JOINT_STOCK_COMPANY;
                        break;
                    default:
                        throw new EmptyFieldException("Такого типа организации не существует. " + "Заполните тип корректно: ");
                }
                return organizationType;
        } catch (EmptyFieldException e){
                System.out.println(e.getMessage());
            }
    }
}
        public long generateId() {
            // Реализация метода генерации уникального идентификатора
            return ++elementsCount; // Пример генерации уникального идентификатора
        }

        public void setId(long id) {
            // Реализация метода для установки идентификатора элемента коллекции
            // Например, можно просто установить значение id объекта
            this.id = id;
        }

        public void setCreationDate(Date creationDate) {
            // Реализация метода для установки даты создания элемента коллекции
            this.initializationDate = creationDate;
        }


    public OrganizationWithOutId createElement(){
        InputScanner = PromptScanner.getUserScanner();

        System.out.println("Введите имя");
        String name = askString(InputScanner);

        System.out.println("Введите координату x:");
        float x = askX(InputScanner);

        System.out.println("Введите координату y:");
        double y = askY(InputScanner);

        Coordinates coordinates = new Coordinates((long) x, (int) y);

        Date creationDate = new Date();

        System.out.println("Введите годовой оборот");
        float annualTurnover = askFloat(InputScanner);

        System.out.println("Введите адрес организации");
        String officialAddress = askString(InputScanner);

        System.out.print("""
                Введите один из доступных типов организации:
                 COMMERCIAL,
                 GOVERNMENT, 
                 TRUST, 
                 PRIVATE_LIMITED_COMPANY,
                 OPEN_JOINT_STOCK_COMPANY
                """);
        OrganizationType organizationType = OrganizationType(InputScanner);
        return new OrganizationWithOutId(name, coordinates, creationDate, officialAddress, annualTurnover, organizationType);
    }
}
