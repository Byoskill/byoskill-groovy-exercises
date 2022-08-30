package observer

class Observable<T> {

    private boolean changed = false
    private List<Observer<T>> observers = []

    def subscribe(Observer<T> o) {
        observers += o
    }

    def unsubscribe(Observer<T> o) {
        observers -= o
    }

    def minus(Observer<T> o) {
        unsubscribe o
    }

    def plus(Observer<T> o) {
        subscribe o
    }

    def notifySubscribers(T context) {
        if (changed) {
            observers*.update(this, context)
        }
        changed = false
    }

    def setChanged() {
        this.changed = true
    }
}
