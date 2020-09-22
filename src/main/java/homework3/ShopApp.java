package homework3;

public class ShopApp {
    public double calcTotal(Clothing[] items){

        double total = 0;
        for(int item = 0; item < items.length; item ++){
            total += items[item].getPrice();
        }

        return total;

    }

    public char measure (Customer customerName){
        char custSize = customerName.getSize();
        return custSize;

    }

    public double employeePriceAfterDisc(Employee priceAfter){

        Clothing[] employeeItems = priceAfter.getClothingItems();

        double total=0;
        for(int item =0; item < employeeItems.length; item ++){
            total += employeeItems[item].getPrice();
        }
        return total = total -(total * priceAfter.getDiscount());

    }

}
