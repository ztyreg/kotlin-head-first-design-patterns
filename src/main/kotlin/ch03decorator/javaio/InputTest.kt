package ch03decorator.javaio

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream

fun main() {
    var c: Int
    try {
        val input: InputStream = LowerCaseInputStream(
            BufferedInputStream(
                FileInputStream("ch03decorator/javaio/test.txt")
            )
        )
        c = input.read()
        while (c >= 0) {
            print(c.toChar())
            c = input.read()
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}