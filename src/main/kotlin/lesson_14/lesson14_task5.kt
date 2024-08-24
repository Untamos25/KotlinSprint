package lesson_14

open class Message(val id: Int, val author: String, val text: String)

class ChildMessage(id: Int, author: String, text: String, val parentMessageId: Int) : Message(id, author, text)

class Chat(
    val listOfMessages: MutableList<Message> = mutableListOf(),
    var messageId: Int = 0,
    val messageIds: MutableList<Int> = mutableListOf()
) {
    fun addMessage(author: String, text: String) {
        listOfMessages.add(Message(++messageId, author, text))
        messageIds.add(messageId)
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        listOfMessages.add(ChildMessage(++messageId, author, text, parentMessageId))
    }

    fun printChat() {
        val groupedMessages = listOfMessages.groupBy {
            if (it is ChildMessage) it.parentMessageId
            else it.id
        }

        groupedMessages.forEach { (parentId, messages) ->
            messages.forEach {
                if (it is ChildMessage) print("\t")
                println("${it.author}: ${it.text}")
            }
        }
    }
}


fun main() {
    val chat = Chat()
    chat.addMessage("Админ", "Создание первой ветки обсуждения.")
    chat.addThreadMessage("Вова", "Первый в первой ветке", chat.messageIds[0])
    chat.addThreadMessage("Петя", "Надо создать ещё одну", chat.messageIds[0])
    chat.addMessage("Лиза", "Петя попросил, я сделала. Вторая ветка.")
    chat.addThreadMessage("Вова", "Лиза создала вторую ветку, пойду туда", chat.messageIds[0])
    chat.addThreadMessage("Петя", "Петя во второй ветке чек", chat.messageIds[1])
    chat.addThreadMessage("Вова", "Пойду третью сделаю", chat.messageIds[1])
    chat.addMessage("Вова", "Третья готова")
    chat.addThreadMessage("Петя", "Вова, остановись", chat.messageIds[1])

    chat.printChat()
}