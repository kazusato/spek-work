package jp.labks.spekwork

import io.kotlintest.matchers.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object SimpleSpec : Spek({
    describe("MessageGenerator") {
        val gen = MessageGenerator("hello")

        on("getMessage") {
            it("ベースメッセージと名前が結合された文字列が返却されること") {
                val msg = gen.getMessage("kotlin user")
                msg shouldBe "hello kotlin user"
            }
        }

    }
})