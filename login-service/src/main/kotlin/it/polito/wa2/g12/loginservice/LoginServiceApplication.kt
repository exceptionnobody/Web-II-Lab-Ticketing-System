package it.polito.wa2.g12.loginservice

import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import javax.crypto.SecretKey


@SpringBootApplication
class LoginServiceApplication {
    @Value("\${key}")
    lateinit var stringKey: String

    @Bean
    fun secretKey(): SecretKey {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(stringKey))
    }

}

fun main(args: Array<String>) {
    runApplication<LoginServiceApplication>(*args)

}
