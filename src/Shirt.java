public class Shirt {
    public String description;
    public char colorCode;
    public double price;

    //constructor activated
    public Shirt(){
        System.out.println("Shirt constructor called");
        description = ".....Description required....";
        colorCode = 'U';
        price = 0.00;
    }
    //methods activated
    public void display(){
        System.out.println("Shirt description : " + description);
        System.out.println("Colorcode is : " +colorCode);
        System.out.println("shirt price is : " + price);
    }

}
