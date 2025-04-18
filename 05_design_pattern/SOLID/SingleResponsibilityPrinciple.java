// // Violating SRP: Class handles both data management and report printing
// class Report {
//     private String data;
    
//     // Manages data
//     public void loadData(String data) {
//         this.data = data;
//     }

//     // Generates and prints report (second responsibility)
//     public void printReport() {
//         System.out.println("Report: " + data);
//     }
// }

// public class SingleResponsibilityPrinciple {
//     public static void main(String[] args) {
//         Report report = new Report();
//         report.loadData("Data for report");
//         report.printReport(); // Both responsibilities in one class
//     }
// }


// Separate responsibilities
class DataManager {
    public String loadData() {
        return "Data for report";
    }
}

class ReportPrinter {
    public void printReport(String data) {
        System.out.println("Report: " + data);
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        String data = dataManager.loadData();
        
        ReportPrinter reportPrinter = new ReportPrinter();
        reportPrinter.printReport(data); // Single responsibility per class
    }
}
