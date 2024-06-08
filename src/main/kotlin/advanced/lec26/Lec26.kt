package advanced.lec26

class Lec26 {
}

// kdoc <Block Tag>
/**
 * 박스 클래스. 생성자에 name이 들어간다.
 *
 * ** 주목!! **
 * - A
 * - B
 *
 * @param T 박스의 아이템 타입
 * @property name 박스의 이름
 * @sample advanced.lec26.sample.z.z
 *
 */
class Box<T>(val name: String) {

    /**
     * @param item 박스에 들어갈 아이템
     */
    fun add(item: T): Boolean {
        TODO()
    }
}