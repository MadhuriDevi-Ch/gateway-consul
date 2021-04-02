package com.example

import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.reactivex.Flowable
@Fallback
class Service2Down implements Service2Client{
    @Override
    Flowable<ArrayList<Book>> findBooks() {
        return Flowable.just("Service 2 is down. Try later again" as Object)
        //return null
    }
}
