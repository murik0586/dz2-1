import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun paypal1Maestro1() {

        val result = paypal("Maestro", 75000, 75001)


        assertEquals("470", result)


    }

    @Test
    fun paypal1MaestroOver() {
        val result = paypal("Maestro", 600_000, 1000)
        assertEquals("Превышены лимиты по карте", result)
    }
    @Test
    fun paypal1VisaAndMiR() {
        val result = paypal("_", 600_000, 1_000)
        assertEquals("35", result)
    }


    @Test
    fun paypal1MasterOver() {
        val result = paypal("Mastercard", 600_000, 1000)
        assertEquals("Превышены лимиты по карте", result)
    }

    @Test
    fun paypal1Maestro2() {
        val result = paypal("Maestro", 1000, 1000)
        assertEquals("0", result)
    }

    @Test
    fun paypal1MasterCard1() {
        val result = paypal("Mastercard", 75000, 75001)
        assertEquals("470", result)
    }

    @Test
    fun paypal1MasterCard2() {
        val result = paypal("Mastercard", 1000, 1000)
        assertEquals("0", result)
    }

    @Test
    fun paypalVKpay1() {
        val result = paypal("VkPay", 10000, 259999)
        assertEquals("0", result)
    }

    @Test
    fun else1() {
        val result = paypal("_", 1000, 2000)
        assertEquals("35", result)
    }

    @Test
    fun else2() {
        val result = paypal("_", 2000, 50000)
        assertEquals("375", result)
    }

    @Test
    fun main1() {
        val result = paypal("_", 3000, 54000)
        assertEquals("405", result)
    }

    @Test
    fun main2() {
        val result = main()
        assertEquals(kotlin.Unit, result)
    }

    @Test
    fun else3() {
        val result = paypal("__", 243340, 23123121)
        assertEquals("173423", result)
    }

}



