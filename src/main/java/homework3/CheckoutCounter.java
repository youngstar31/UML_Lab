package homework3;

public class CheckoutCounter {
    public static ShopApp shopApp = new ShopApp();
    public static Clothing[] shoppingBag = new Clothing[1];
    public static Clothing[] employeeShoppingBag = new Clothing[1];
    public static Customer[] shoppers = new Customer[2];




    public static void main(String[] args) {

        Clothing gucciShirt = new Clothing("Stylish Sandals",150.00,'S');
        shoppingBag[0] = gucciShirt;
        Customer customer = new Customer("JBandz", shoppingBag,'M');

        Clothing kenzoShirt = new Clothing("Bright gradient color T-shirt",225.00,'L');
        employeeShoppingBag[0] = kenzoShirt;
        Employee employee = new Employee("Asher",employeeShoppingBag, 'L');

        shoppers[0] = customer;
        shoppers[1] = employee;

        for (int cust = 0; cust < shoppers.length; cust++){
            System.out.println(shoppers[cust].getName());
            if(shoppers[cust] == customer){
                System.out.println(customer.toString());
                System.out.println("Customer's size: " + shopApp.measure(shoppers[0]));
                System.out.println("Fit?: " + gucciShirt.isAFit(customer));
                System.out.println("Total: " + shopApp.calcTotal(shoppingBag));
                System.out.println(":::::::::::::Thank you - Come Again!:::::::::::");
            }
            else{
                System.out.println(employee.toString());
                System.out.println("Employee's size " + employee.getSize());
                System.out.println("Fit?: " + kenzoShirt.isAFit(employee));
                System.out.println("Total " + shopApp.employeePriceAfterDisc(employee));
                
                System.out.println(":::::::::::::Thank you - Come Again!:::::::::::");


            }

        }

    }
}
