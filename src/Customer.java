import java.util.Scanner;

public class Customer {
    private String name;
    private String cod;
    private int pin;
    private Currency currency;
    private long money;

    public Customer(String name, String cod, int pin, long money, Currency currency) {
        this.name = name;
        this.cod = cod;
        this.pin = pin;
        this.money = money;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}