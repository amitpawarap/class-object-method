public class Demo {
        private static String brand = "";
        private static  int id = 0;
        private static  float price = 0;
    public Demo(String brand,int id,float price)
    {
        this.brand=brand;
        this.id=id;
        this.price=price;
    }
    public void display()
    {
        System.out.println("["+"AC ID:"+id+",AC Brand:"+brand+",AC Price:"+price+"]");

    }

        public static void main(String[] args) {
                Demo a=new Demo("bluestar", 1, 10500);
                a.display();
                Demo a1=new Demo("mi", 2, 15500);
                a1.display();

        }

}


