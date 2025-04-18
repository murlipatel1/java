Principle | Description | Example
SRP | A class should have only one responsibility. | DataManager and ReportPrinter classes in SRP example
OCP | Classes should be open for extension but closed for modification. | Adding new shapes without changing AreaCalculator
LSP | Subtypes must be substitutable for their base types. | Properly handling Rectangle and Square behavior
ISP | Clients should not be forced to depend on methods they do not use. | Segregating interfaces like Workable and Eatable
DIP | High-level modules should not depend on low-level modules. | BusinessLogic depends on the Storage abstraction