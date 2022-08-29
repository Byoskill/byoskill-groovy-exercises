package banking

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BankAccountTest {

    @Test
    void scenario1() {
        BankAccount account = new BankAccount()
        account.depot(20d, "INITIAL_DEPOT")
        account.retrait(10d, "RETRAIT3")
        
        Assertions.assertEquals 10.0d, account.solde
        
        account += new Tuple(50, "DEPOT1")
        account -= new Tuple(10, "RETRAIT")
        account -= new Tuple(10, "RETRAIT2")
        
        Assertions.assertEquals 40.0d, account.solde

    }
}
