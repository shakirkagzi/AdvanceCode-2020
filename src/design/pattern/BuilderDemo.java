package design.pattern;

import design.pattern.builder.BankAccount;

public class BuilderDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount.BankAccountBuilder("John Doe","1234")
                .withEmail("shakir1kagzi1@gmail.com")
                .withNewsLetter(true)
                .build();
    }
}
