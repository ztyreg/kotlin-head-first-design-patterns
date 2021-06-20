val a = listOf("one", "two")
val b = listOf(1, 2)
for ((index, (c, d)) in a.zip(b).withIndex()) println("$c, $d")