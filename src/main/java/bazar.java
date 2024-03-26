import java.util.List;
import java.util.Map;

enum Category {
    BOOK, CANDY, DVD, FIGURINE, CLOTHING, TOY
}

enum Role {
    SECURITY, SELLER, VOLUNTEER
}

public class bazar {
    private String id;
    private double price;
    private Category category;
    private Map<String, Object> attributes; // Utilisation d'une map pour une flexibilité maximale des attributs.
    private String standId;

    // Constructeurs, getters et setters
}

class Employee {
    private String id;
    private String name;
    private Role role;
    private String standId;

    // Constructeurs, getters et setters
}

class Stand {
    private String id;
    private List<String> employeeIds;
    private List<String> itemsForSaleIds;
    private List<String> itemsSoldIds;
    private String position;

    // Constructeurs, getters et setters
}
