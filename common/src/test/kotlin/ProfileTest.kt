import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ProfileTest : StringSpec({
    "profile test" {
        val profile = Profile("id", "defaultName")
        profile.id shouldBe "id"
        profile.name shouldBe "defaultName"
    }
})
