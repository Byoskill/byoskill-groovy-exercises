package banking

class BankAccount {
    AccountStatus status = AccountStatus.CLOSED
    List<Operation> operations = []
    double initialAmount = 0.0d
    double solde = initialAmount

    def open() {
        status = AccountStatus.OPENED
    }

    def close() {
        status = AccountStatus.CLOSED
    }

    void depot(double montant, String operationName) {
        BankingRules.bankAccountStatusRule(status)
        def operation = new Operation([montant: montant, name: operationName, type: OperationType.DEPOSIT])
        depot(operation)
    }

    void depot(Operation operation) {
        BankingRules.bankAccountStatusRule(status)
        assert operation != null
        operations += operation
        solde += operation.montant
    }

    void retrait(double montant, String operationName) {
        BankingRules.bankAccountStatusRule(status)
        def operation = new Operation([montant: montant, name: operationName, type: OperationType.WITHDRAW])
        retrait(operation)
    }

    void retrait(Operation operation) {
        BankingRules.bankAccountStatusRule.call(status)
        BankingRules.retraitAutorise.call(this, operation)
        assert operation != null
        operations += operation
        solde -= operation.montant
    }

    BankAccount plus(Tuple tuple) {
        assert tuple != null
        depot tuple[0] as double, tuple[1] as String
        this
    }

    BankAccount minus(Tuple tuple) {
        assert tuple != null
        retrait tuple[0] as double, tuple[1] as String
        this
    }
}
