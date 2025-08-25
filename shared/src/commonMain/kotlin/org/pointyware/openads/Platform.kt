package org.pointyware.openads

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform