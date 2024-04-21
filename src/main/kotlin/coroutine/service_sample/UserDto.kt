package coroutine.service_sample

data class UserDto (
    val name: String,
    val image: String,
    val birthday: String,
) {
    constructor(profile: Profile, image: Image): this(
        name = profile.name,
        image = image.imageName,
        birthday = profile.birthday,
    )
}