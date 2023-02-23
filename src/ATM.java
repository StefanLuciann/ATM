import jdk.dynalink.NamedOperation;

import java.util.Scanner;

public class ATM {

    Scanner scanner = new Scanner(System.in);

    public void welcome(Customer customer) {
        int[] notes = {200, 100, 50, 10};

        System.out.println("Please insert your code:");
        String code = scanner.nextLine();

        if (customer.getCod().equals(code)) {
            System.out.println("Insert your pin");
            int pin = scanner.nextInt();

            while(customer.getPin() == pin ) {
                System.out.println("Welcome " + customer.getName() + "!\n");
                System.out.println("Would you like to:\n");
                System.out.println("1. Withdraw \n");
                System.out.println("2. Deposit \n");
                System.out.println("3. Interrogate sold\n");
                System.out.println("4. Leave\n");

                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("1. 100 " + customer.getCurrency().toString());
                    System.out.println("2. 200 " + customer.getCurrency().toString());
                    System.out.println("3. 400 " + customer.getCurrency().toString());
                    System.out.println("4. Custom ammount\n");


                    int ammount = scanner.nextInt();

                    if (ammount == 1) {
                        long money = customer.getMoney();
                        if (customer.getMoney() >= ammount) {
                            money -= 100;
                            customer.setMoney(money);
                            System.out.println("1 bill of 100" + customer.getCurrency());
                        } else {
                            System.out.println("Insuficient founds\n");
                        }
                    } else if (ammount == 2) {
                        if (customer.getMoney() >= ammount) {
                            long money = customer.getMoney();
                            money -= 200;
                            customer.setMoney(money);
                            System.out.println("1 bill of 200" + customer.getCurrency());
                        } else {
                            System.out.println("Insuficient founds\n");
                        }

                    } else if (ammount == 3) {
                        if (customer.getMoney() >= ammount) {
                            long money = customer.getMoney();
                            money -= 400;
                            customer.setMoney(money);
                            System.out.println("1 bill of 400" + customer.getCurrency());
                        } else {
                            System.out.println("Insuficient founds\n");
                        }
                    } else if (ammount == 4) {
                        System.out.println("Insert ammount\n");
                        int customAmmount = scanner.nextInt();

                        if (customer.getMoney() >= customAmmount) {

                            if (customAmmount <= 0 || customAmmount % 10 != 0) {
                                System.out.println("Enter a valid number");
                            } else {

                                long money = customer.getMoney();
                                money -= customAmmount;
                                customer.setMoney(money);

                                for (int i = 0; i < notes.length && customAmmount != 0; i++) {
                                    if (customAmmount >= notes[i]) {
                                        System.out.println(customAmmount / notes[i] + "x" + notes[i]
                                                + " " + customer.getCurrency());
                                    }
                                    customAmmount %= notes[i];
                                }
                            }
                        } else {
                            System.out.println("Insuficient founds\n");
                        }
                    }

                }
                else if (choice == 2){
                    System.out.println("Please insert the amount you want to deposit :");
                    int ammount1 = scanner.nextInt();
                    if (ammount1 <= 0) {
                        System.out.println("Invalid amount. Please enter a positive value.");
                        return;}
                        long money = customer.getMoney();
                        money += ammount1;
                        customer.setMoney(money);
                    System.out.println();
                    System.out.println("1. Continue");
                    System.out.println("2. Leave");
                    int choiceInterrogation = scanner.nextInt();
                    if (choiceInterrogation == 1) {
                        continue;
                    } else if (choiceInterrogation == 2) {
                        break;
                    } else {
                        System.out.println("Try again champ.");
                    }
                    }
                    else if (choice == 3) {
                    System.out.println(customer.getMoney() + customer.getCurrency().toString() + "\n");
                    System.out.println("1. Continue");
                    System.out.println("2. Leave");
                    int choiceInterrogation = scanner.nextInt();

                    if (choiceInterrogation == 1) {
                        continue;
                    } else if (choiceInterrogation == 2) {
                        break;
                    } else {
                        System.out.println("Try again champ.");
                    }

                } else if (choice == 4) {
                    return;
                }
            }
        } else {
            System.out.println("Wrong code");
        }
    }
}