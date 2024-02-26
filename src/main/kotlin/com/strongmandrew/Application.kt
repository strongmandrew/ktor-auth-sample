package com.strongmandrew

import com.strongmandrew.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureTemplating()
    configureRouting()
}
