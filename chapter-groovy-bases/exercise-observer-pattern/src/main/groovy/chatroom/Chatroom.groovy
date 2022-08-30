package chatroom

import observer.Observable

class Chatroom {
    private Observable<Message> observable = new Observable<>()

    void subscribe(Participant participant) {
        observable.subscribe(participant)
    }

    void writeMessage(Message message) {
        observable.setChanged()
        observable.notifySubscribers(message)
    }
}
