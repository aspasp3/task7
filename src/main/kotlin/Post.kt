data class Comments (
    val count:Long,
    val canPost:Boolean,
    val groupsCanPost:Boolean,
    val canClose:Boolean,
    val canOpen:Boolean,
)
data class Copyright(
    val id:Long,
    val link: String,
    val name:String,
    val type: String,
)
data class Likes (
    val count:Long,
    val userLikes:Boolean,
    val canLike:Boolean,
    val canPublish:Boolean,
)
data class Repost (
    val count:Long,
    val userReposted:Boolean,
)
data class Views (
    val count:Long,
)
data class Donut(
    val isDonut:Boolean,
    val paidDuration: Int,
    val placeholder: Int,
    val canPublishFreeCopy:Boolean,
    val editMode:String,
)
interface Attachment {
    val type: String
}
class Audio(
    val id:Int,
    val ownerId:Int,
    val artist:String,
    val title:String,
    val duration:Int,
    val url:String,
    val lyricsId:Int,
    val albumId:Int,
    val genreId:Int,
    val date:Int,
    val noSearch:Boolean,
    val isHq:Boolean
)
class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment




class Photo(
    val id:Int,
    val albumId:Int,
    val ownerId:Int,
    val userId:Int,
    val text:String,
    val date:Int,
    val sizes:Array<Int>,
    val width:Int,
    val height:Int
)
class PhotoAttachment(
    override val type:String = "photo",
    val photo:Photo
) : Attachment


class Graffiti(
    val id:Int,
    val ownerId:Int,
    val photo130:String,
    val photo504:String
)
class GraffitiAttachment(
    override val type:String = "graffiti",
    val graffiti:Graffiti
) : Attachment



data class Post(
    /*val id:Long,
    val AuthorId:Long,
    val AuthorName:String,
    val content:String,
    val date:String,
    val likes: Int = 0*/
    val id:Long,
    val ownerId:Long,
    val fromId:Long,
    val createdBy:Long,
    val date: String,
    val text:String,
    val replyOwnerId:Long,
    val replyPostId:Long,
    val friendsOnly:Boolean,
    val comments:Comments,
    val copyright:Copyright,
    val likes:Likes,
    val repost:Repost,
    val views:Views,
    val postType:String,
    val signerId:Long,
    val canPin:Boolean,
    val canDelete:Boolean,
    val canEdit:Boolean,
    val isPinned:Boolean,
    val markedAsAds:Boolean,
    val isFavorite:Boolean,
    val donut:Donut,
    val postponedId:Long,
    val attachments:Array<Attachment>?
)

