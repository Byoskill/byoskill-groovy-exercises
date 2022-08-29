package banking

class Operation {
    String name
    OperationType type
    double montant
    
    def setMontant(double newVal) {
        assert newVal > 0
        this.montant = newVal
    }
}
