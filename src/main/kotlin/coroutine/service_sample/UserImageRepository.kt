package coroutine.service_sample

import kotlinx.coroutines.delay

class UserImageRepository {
    suspend fun findImage(profile: Profile, continuation: Continuation) {
        println("이미지 찾기")
        delay(100L)
        val newImage = Image(profile, profile.name + "Image", "sample image")
        continuation.resumeWith(newImage)
    }
}