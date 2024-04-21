package coroutine.service_sample

import kotlinx.coroutines.delay

class UserProfileRepository {
    suspend fun findProfile(userId: Long, continuation: Continuation) {
        println("사용자 찾기")
        delay(100L)
        val newProfile = Profile(userId, "username", "20010101")
        continuation.resumeWith(newProfile)
    }
}