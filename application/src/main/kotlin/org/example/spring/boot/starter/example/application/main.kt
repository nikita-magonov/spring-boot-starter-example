package org.example.spring.boot.starter.example.application

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationStartedEvent
import org.springframework.boot.runApplication
import org.springframework.context.event.EventListener

@SpringBootApplication
class Application {

    @Autowired
    lateinit var fooService: FooService;

    @EventListener(ApplicationStartedEvent::class)
    fun applicationStarted() {
        fooService.foo()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
