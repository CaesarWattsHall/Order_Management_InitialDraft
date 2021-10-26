package lab2_umldiagrams;

public interface Payment {

    public void pay();

    class Cash implements Payment {

        @Override
        public void pay() {
            System.out.println("This is the cash payment");
        }
    }

}
