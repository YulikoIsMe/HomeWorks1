package HW25;

import java.util.ArrayList;
import java.util.List;

public abstract class Insurance {
    /*Create a class HW25.Insurance that will have an attribute as insuranceName
    and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses HW25.Car, HW25.Pet, HW25.Health. HW25.Car class has it’s own attribute as
    carModel and Class HW25.Pet has petType attribute. Create 3 objects of the sub
    classes and store them in ArrayList. Using for loop/advanced for loop/ iterator
    access all methods of the class.
 Create a HW25.HW25.Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.*/
String insuranceName;

    public abstract boolean getQuote();

    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;

    @Override
    public boolean getQuote() {

        return false;
    }

    @Override
    public void cancelInsurance() {

    }
}
class Pet extends Insurance{
    String petType;

    @Override
    public boolean getQuote() {

        return false;
    }

    @Override
    public void cancelInsurance() {

    }
}
class Health extends Insurance{
    @Override
    public boolean getQuote() {

        return false;
    }

    @Override
    public void cancelInsurance() {

    }
}class InsuranceTester{
    public static void main(String[] args) {


    List<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car());
                insurances.add(new Pet());
                insurances.add(new Health());
                System.out.println(insurances);

                for (Insurance insurance : insurances) {
                System.out.println(insurance.getQuote());
                insurance.cancelInsurance();
                }
                }
                }