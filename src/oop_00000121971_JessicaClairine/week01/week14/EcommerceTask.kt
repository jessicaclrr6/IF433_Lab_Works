package oop_00000121971_JessicaClairine.week01.week14
import java.io.File

interface OrderRepository {
    fun save(order: String)
}

class CsvOrderRepository : OrderRepository {
    override fun save(order: String) {
        File("orders.csv").appendText("$order\n")
    }
}

interface NotificationService {
    fun send(message: String)
}

class EmailNotifier : NotificationService {
    override fun send(message: String) {
        println("Email terkirim: $message")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class OrderProcessor(private val repo: OrderRepository, private val notifier: NotificationService) {
    fun processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
        val finalPrice = pricing.calculate(basePrice)
        println("Memproses pesanan: $itemName seharga Rp$finalPrice")
        repo.save("$itemName,$finalPrice")
        notifier.send("Pesanan $itemName anda telah dikonfirmasi")
    }
}

fun main() {
    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()
    val processor = OrderProcessor(repo, notifier)
    processor.processOrder("Laptop", 5000000.0, VipPricing())
    processor.processOrder("Mouse", 150000.0, RegularPricing())
}