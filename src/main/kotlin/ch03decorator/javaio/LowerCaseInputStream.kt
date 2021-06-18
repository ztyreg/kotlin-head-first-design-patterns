package ch03decorator.javaio

import java.io.InputStream
import java.io.FilterInputStream

class LowerCaseInputStream(val input: InputStream) : FilterInputStream(input) {
    override fun read(): Int {
        val c: Int = super.read()
        return if (c == -1) c else c.toChar().lowercaseChar().code
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val result: Int = super.read(b, off, len)
        for (i in off until off + result) {
            b[i] = b[i].toInt().toChar().lowercaseChar().code.toByte()
        }
        return result
    }

}