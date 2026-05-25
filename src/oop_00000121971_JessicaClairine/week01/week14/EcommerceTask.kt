package oop_00000121971_JessicaClairine.week01.week14
import java.io.File

interface OrderRepository {
    fun saveOrder(data: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(data: String) {
        File("orders.csv").bufferedWriter().use {
            it.write(data)
            it.newLine()
        }
        println("Order saved to CSV")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email sent: $message")
    }
}

class SafeOrderProcessor(private val repo: OrderRepository, private val notifier: NotificationService)


