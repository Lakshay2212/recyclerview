import com.google.firebase.firestore.auth.User

data class User(
    var imageID:Int,
    var name:String,
    var lastMsg:String,
    var lastMsgTime:String,
)