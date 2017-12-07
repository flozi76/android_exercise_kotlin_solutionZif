package i_introduction._5_Classes

import junit.framework.Assert.assertEquals
import org.junit.Test
import java.lang.reflect.Modifier


class N05ClassesKtTest {
    @Test
    fun testReturnedCar() {
        val task5 = task5()
        assertEquals(true,task5.javaClass.declaredMethods.any {
            it.name == "getMotor" &&
                    it.returnType == String::class.java &&
                    Modifier.isPublic(it.modifiers) &&
                    Modifier.isFinal(it.modifiers)
        })
        assertEquals(true,task5.javaClass.declaredMethods.any {
            it.name == "getAutomaticTransmission" &&
                    it.returnType == Boolean::class.java &&
                    Modifier.isPublic(it.modifiers) &&
                    Modifier.isFinal(it.modifiers)
        })
        assertEquals(true,task5.javaClass.declaredMethods.any {
            it.name == "getSeats" &&
                    it.returnType == Int::class.java &&
                    Modifier.isPublic(it.modifiers) &&
                    Modifier.isFinal(it.modifiers)
        })
        assertEquals(true,task5.javaClass.declaredMethods.any {
            it.name == "getMileage" &&
                    it.returnType == Int::class.java &&
                    Modifier.isPublic(it.modifiers) &&
                    Modifier.isFinal(it.modifiers)
        })
        assertEquals(true,task5.javaClass.declaredMethods.any {
            it.name == "setMileage" &&
                    it.returnType == Void.TYPE &&
                    Modifier.isPrivate(it.modifiers) &&
                    Modifier.isFinal(it.modifiers) &&
                    it.parameterCount == 1 &&
                    it.parameterTypes[0] == Int::class.java
        })
    }
}