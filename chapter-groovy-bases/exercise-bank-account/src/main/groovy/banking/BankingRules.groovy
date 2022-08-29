package banking

class BankingRules {
    static def bankAccountStatusRule = {
        it ->
            if (it == AccountStatus.OPENED) {
                // Allowed
            } else {
                throw new UnsupportedOperationException("Cannot perform operation on closed bank account")
            }
    }
    
    static def retraitAutorise = {
        bankAccount, operation -> if (bankAccount.solde < operation.montant) throw new UnsupportedOperationException("Retrait non autorisé")    
    }

    static def operationName = {
        if (!it) throw new UnsupportedOperationException("Operation name should not be empty")
    }
    
    static def montantValide = {
        if (it <= 0) throw new UnsupportedOperationException("Tout montant d'une opération doit être positif")
    }
}
