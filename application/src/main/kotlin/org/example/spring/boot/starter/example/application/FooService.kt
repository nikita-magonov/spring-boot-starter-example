package org.example.spring.boot.starter.example.application

import org.example.spring.boot.starter.example.Log
import org.springframework.stereotype.Service

@Service
class FooService {

    @Log
    fun foo () {

    }
}