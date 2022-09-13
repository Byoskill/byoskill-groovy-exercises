import java.util.concurrent.atomic.AtomicInteger

class CompteARebours {
    int count;
    
    def waitUntilZero() {
        def counter = new AtomicInteger(count);
        def t = Thread.start {
            int res 
            while((res=counter.getAndDecrement()) > 0) {
                println "Compte à rebours ${res}"
                Thread.sleep 1000
            }
        }
        t.join()
    }
}

def countDown = new CompteARebours(count : 10)
countDown.waitUntilZero()