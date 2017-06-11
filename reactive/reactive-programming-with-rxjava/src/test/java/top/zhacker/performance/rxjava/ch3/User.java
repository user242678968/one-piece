package top.zhacker.performance.rxjava.ch3;

import rx.Observable;

class User {
    Observable<Profile> loadProfile() {
        //Make HTTP request...
        return Observable.just(new Profile());
    }
}
