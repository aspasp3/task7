/*data class Donut (
   val is_don:Boolean,
   val placeholder:String,
)*/
data class Thread (
    val count:Int,
    val items:String,
    val can_post:Boolean,
    val show_reply_button:Boolean,
    val groups_can_post:Boolean,

)
data class Comment (
    val id:Int,
    val from_id:Int,
    val date:Int,
    val text:String,
    val donut:Int,
    val reply_to_user:Int,
    val attachments:String,
    val parents_stack:Array<Int>,
    val thread:Thread,
    val post_id:Long,
)