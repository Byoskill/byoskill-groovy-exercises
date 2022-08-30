package chatroom

import observer.Observable
import observer.Observer

class Participant implements Observer<Message> {

    Chatroom chatroom
    private String participantId

    Participant(Chatroom chatroom, String participantId) {

        this.participantId = participantId
        this.chatroom = chatroom
        this.chatroom.subscribe this;
    }

    @Override
    void update(Observable context, Message event) {
        if (participantId != event.participantId) {
            println "$participantId received from ${event.participantId} : ${event.message}"
        }
    
    }

    def sendMessage(String msg) {
        def message = new Message([participantId: this.participantId, message: msg])
        chatroom.writeMessage message
    }
}
