package jp.labks.spekwork

class MessageGenerator(val baseMsg: String) {

    fun getMessage(name: String) = "$baseMsg $name"

}