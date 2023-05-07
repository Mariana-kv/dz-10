import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        //case1:
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("case1: " + "This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("case1: " + "Account has another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("case1: " + "Not enough money");
        } catch (Exception exception) {
            System.out.println("case1: " + "An error has occurred");
        } finally {
            System.out.println("case1: " + "Thanks for being with us");
        }

        //case2:
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("case2: " + "This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("case2: " + "Account has another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("case2: " + "Not enough money");
        } catch (Exception exception) {
            System.out.println("case2: " + "An error has occurred");
        } finally {
            System.out.println("case2: " + "Thanks for being with us");
        }

        //case3:
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("case3: " + "This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("case3: " + "Account has another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("case3: " + "Not enough money");
        } catch (Exception exception) {
            System.out.println("case3: " + "An error has occurred");
        } finally {
            System.out.println("case3: " + "Thanks for being with us");
        }

        //case4:
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("case4: " + "This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("case4: " + "Account has another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("case4: " + "Not enough money");
        } catch (Exception exception) {
            System.out.println("case4: " + "An error has occurred");
        } finally {
            System.out.println("case4: " + "Thanks for being with us");
        }


    }
}


