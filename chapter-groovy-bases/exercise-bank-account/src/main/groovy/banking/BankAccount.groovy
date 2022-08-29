package banking

class BankAccount {
    AccountStatus status
    List<Operation> operations = []
    double initialAmount = 0.0d
    double solde = initialAmount

    void depot(double montant, String operationName) {
        def operation = new Operation([montant: montant, name: operationName, type: OperationType.DEPOSIT])
        depot(operation)
    }

    void depot(Operation operation) {
        assert operation != null
        operations += operation
        solde += operation.montant
    }

    void retrait(double montant, String operationName) {
        def operation = new Operation([montant: montant, name: operationName, type: OperationType.WITHDRAW])
        retrait(operation)
    }

    void retrait(Operation operation) {
        assert operation != null
        operations += operation
        solde -= operation.montant
    }

    BankAccount plus(Tuple tuple) {
        assert tuple != null
        depot tuple[0] as double, tuple[1] as String
        this
    }

    BankAccount  minus(Tuple tuple) {
        assert tuple != null
        retrait tuple[0] as double, tuple[1] as String
        this
    }
}
