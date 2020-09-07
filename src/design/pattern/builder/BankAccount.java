package design.pattern.builder;

public class BankAccount {
    //required parameter
    private String name;
    private String accountNumber;

    //optional parameter
    private String email;
    private boolean newsLetter;

    private BankAccount(BankAccountBuilder builder){
        this.accountNumber = builder.accountNumber;
        this.name = builder.name;
        this.email = builder.email;
        this.newsLetter = builder.newsLetter;
    }

    public static class BankAccountBuilder{
        //required parameter
        private String name;
        private String accountNumber;
        //optional parameter
        private String email;
        private boolean newsLetter;

        public BankAccountBuilder(String name, String accountNumber){
            this.name = name;
            this.accountNumber = accountNumber;
        }
        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }
        public BankAccountBuilder withNewsLetter(Boolean newsLetter){
            this.newsLetter = newsLetter;
            return this;
        }
        public BankAccount build(){
            return new BankAccount(this);
        }

    }
}
