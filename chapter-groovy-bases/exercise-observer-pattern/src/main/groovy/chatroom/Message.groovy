package chatroom


import groovy.transform.Immutable

@Immutable
class Message {
    String message
    String participantId
}
