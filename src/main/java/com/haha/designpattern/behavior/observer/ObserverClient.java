package com.haha.designpattern.behavior.observer;

/**
 * Observer Pattern
 * <p>
 * Subject has a list of observer,you can add or delete   better to use set
 * Observer has a list of informers,you can add or delete   better to use set
 * function update give a this to tell observers to update state in informList keep same with this
 * <p>
 * baseObject -> anObserver -> observeSubject
 * <p>
 * Created by liuhe on 16-4-9.
 */
public class ObserverClient {
    public static void main(String[] args) {
        Observer anObserver = new AnObserver();

        Subject baseSubject = new BaseSubject();
        Subject observeSubject = new ObserveSubject();

        anObserver.addInformSubject(observeSubject);

        baseSubject.addObserver(anObserver);

        System.out.println(baseSubject.getState() + " " + observeSubject.getState());
        baseSubject.setState(2);
        System.out.println(baseSubject.getState() + " " + observeSubject.getState());

        baseSubject.setState(4);
        System.out.println(baseSubject.getState() + " " + observeSubject.getState());

    }
}
