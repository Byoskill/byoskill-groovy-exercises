package observer

interface Observer<T> {
    void update(Observable context, T event);
}