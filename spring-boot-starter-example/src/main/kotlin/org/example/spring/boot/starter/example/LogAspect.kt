package org.example.spring.boot.starter.example

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.LoggerFactory

@Aspect
class LogAspect {

    companion object {
        private val log = LoggerFactory.getLogger(LogAspect::class.java)
    }

    @Pointcut("@annotation(Log)")
    fun annotatedWithLog() { }

    @Around("annotatedWithLog()")
    fun aroundAnnotatedWithLog(pjp: ProceedingJoinPoint): Any? {
        log.info("About to call ${pjp.signature.name}...")
        val returnValue = pjp.proceed()
        log.info("Call ${pjp.signature.name} finished.")

        return returnValue
    }
}