## Solid Principles
### S- Single Responsibilty Principle (SRP)
####    A class should have only one reason to change.
    Ex: Code violating SRP
    class Invoice {

        //First reason to change
        public int calculatePrice(){
            //logic to calculate price;
        }

        //Second reason to change.
        public void saveToDb(){
            //logic to save to DB
        }
    }

In above class, there are more than one reason for class to be changed. So it is better to segregate the methods to different classes as below.

    class InvoicePriceCalculator {

        public int calculatePrice(){
            //logic to calculate price;
        }
    }

    class SaveInvoiceToDB {

        public int saveToDb(){
            //logic to save to DB
        }
    }
    
In above class, there is only one reason for class to be changed and follows SRP.


### O - Open Closed Principle
    The class should be open for extension but closed for modification.
    Ex:
    class Invoice{

        public void saveToDB(){
            //logic to save to db
        }

        // We are introducing new functionality to save to file and we are modifying the above class and introducing new method, which violates above principles becuase my already built classes are well tested.

        public void saveToFile(){
            // logic for saving to file
        }
    }

Better approach would be:

    interface InvoiceDAO(){
        public void save();
    }

    class SaveToDB implements InvoiceDAO{
        public void save(){
            //save to DB;
        }
    }

    class SaveToFile implements InvoiceDAO{
        public void save(){
            //save to File;
        }
    }

### Liscov Substitution Principle
    The base (parent) class object should always be replaceable by the child class object.

    Below code violates Liscov's Substitution principle

    interface Vehicle{
        public void engineSpecification();
        public void mileage();
    }

    class Bike implements Vehicle{
        public void engineSpecification(){
            //gives specifications of the engine
        }

        public void mileage(){
            //gives specifications of the mileage
        }
    }

    class Cycle implements Vehicle{
        public void engineSpecification(){
            throw new Exception("Not applicable to cycle");
        }

        public void mileage(){
            throw new Exception("Not applicable to cycle");
        }
    }

In above class Cycle violates Liscov's Subsctitution principle since Cycle cannot subsctitute for Vehicle interface where bikes are used.


### Interface segregation Principle (ISP)

Have lean interface instaed of going for fat interfaces so that client is not forced to implement unnessary methods

Ex: This violates ISP

    public interface Restaurant{
        void serveFood();
        void makeFood();
    }

    class Waiter implements Restaurant{
        void serveFood(){
            //Logic to serve food
        }

        //Not needed for waiter
        void makeFood(){
            //Empty Implementation
        }
    }

    class Chef implements Restaurant{
        //Not needed for Chef
        void serveFood(){
        //empty Implementation
        }

        //Not needed for waiter
        void makeFood(){
            //Logic to make food
        }
    }

We can have lean interfaces like below:

    public interface Waiter{
        void serveFood();
    }

    public interface Chef{
        void makeFood();
    }
    
### Dependancy Inversion Principle

    A class should not be tigthly coupled with any specific class object rather it should be lossely couple with the base class object so that any child objects can be passed via constructor injection at runtime.