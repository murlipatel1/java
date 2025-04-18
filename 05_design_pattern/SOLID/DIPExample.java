// Violating DIP: High-level module (BusinessLogic) depends directly on low-level module (Database)
// class Database {
//     public void save() {
//         System.out.println("Data saved to database");
//     }
// }

// class BusinessLogic {
//     private Database database = new Database(); // Direct dependency

//     public void performAction() {
//         database.save();
//     }
// }



// Refactor to depend on abstractions instead of concrete classes
interface Storage {
    void save();
}

class Database implements Storage {
    @Override
    public void save() {
        System.out.println("Data saved to database");
    }
}

class FileSystem implements Storage {
    @Override
    public void save() {
        System.out.println("Data saved to file system");
    }
}

class BusinessLogic {
    private Storage storage;

    public BusinessLogic(Storage storage) {
        this.storage = storage;
    }

    public void performAction() {
        storage.save(); // Now it depends on an abstraction
    }
}

// Dependency Inversion Principle (DIP) Example
public class DIPExample {
    public static void main(String[] args) {
        Storage storage = new Database();
        BusinessLogic logic = new BusinessLogic(storage);
        logic.performAction();
    }
}
