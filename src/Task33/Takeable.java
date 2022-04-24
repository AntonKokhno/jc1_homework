package Task33;

public interface Takeable {
   default void takeMoneyATM() {
        System.out.println("Есть возможность снять деньги в банкомате");
}
}
