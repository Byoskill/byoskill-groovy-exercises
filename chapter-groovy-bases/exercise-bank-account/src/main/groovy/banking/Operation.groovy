package banking

class Operation {
    String name
    OperationType type
    double montant
    
    def getVolativeValue() {
        switch(type) {
            case OperationType.DEPOSIT: return montant
            case OperationType.WITHDRAW: return -montant
        }
    }

    def setMontant(double newVal) {
        BankingRules.montantValide newVal
        this.montant = newVal
    }
    
    def setName(String name) {
        BankingRules.operationName name
        this.name = name
    }
}
