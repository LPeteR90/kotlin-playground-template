import Versions.KOTEST_VERSION
import Versions.MOCKK_VERSION

object Versions {
    const val KOTLIN_VERSION = "1.4.10"

    const val KOTEST_VERSION = "4.3.0"
    const val MOCKK_VERSION = "1.10.0"

    const val DETEKT_VERSION = "1.10.0-RC1"
}

object Plugins {
    const val KOTLIN = "org.jetbrains.kotlin.jvm"
    const val KAPT = "kapt"
    const val DETEKT = "io.gitlab.arturbosch.detekt"
}

object Core {
    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
}

object Testing {
    private const val KOTEST_GROUP = "io.kotest"
    const val KOTEST_RUNNER = "$KOTEST_GROUP:kotest-runner-junit5-jvm:$KOTEST_VERSION"
    const val KOTEST_JUNIT_RUNNER = "$KOTEST_GROUP:kotest-runner-junit5:$KOTEST_VERSION"
    const val KOTEST_ASSERTIONS = "$KOTEST_GROUP:kotest-assertions-core-jvm:$KOTEST_VERSION"
    const val KOTEST_PROPERTIES = "$KOTEST_GROUP:kotest-property-jvm:$KOTEST_VERSION"

    const val MOCKK = "io.mockk:mockk:$MOCKK_VERSION"
}
