 class Product {

    int id;
    int name;
    double salary;

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getName() {
         return name;
     }

     public void setName(int name) {
         this.name = name;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public Product(int id, int name, double salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
     }
 }