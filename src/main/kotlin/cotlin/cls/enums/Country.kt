package cotlin.cls.enums

fun main() {
    handleCountry(Country.KOREA)
    handleCountry(Country.AMERICA)
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println(country.code)
        Country.AMERICA -> println(country.name)
    }
}

enum class Country(
    val code: String
) {
    KOREA("KO"),
    AMERICA("US");
}