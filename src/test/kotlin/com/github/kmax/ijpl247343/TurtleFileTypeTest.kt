package com.github.kmax.ijpl247343

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TurtleFileTypeTest : BasePlatformTestCase()  {

    @Test
    fun test() {
        myFixture.configureByText(TurtleFileType.INSTANCE, """<a> <b> <c> .""")

        val file = myFixture.file

        assertNotNull(file)
        assertEquals(TurtleFileType.INSTANCE, file.fileType)
    }
}