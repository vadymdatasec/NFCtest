public class com.orange.hce.proto.activity.BadgeListActivity$a extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/hce/proto/activity/BadgeListActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.orange.hce.proto.activity.BadgeListActivity a; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.BadgeListActivity$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 0 */
/* .line 1 */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String p2 = "android.bluetooth.adapter.action.STATE_CHANGED"; // const-string p2, "android.bluetooth.adapter.action.STATE_CHANGED"
/* .line 2 */
p1 = (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 3 */
	 p1 = this.a;
	 (( com.orange.hce.proto.activity.BadgeListActivity ) p1 ).O ( ); // invoke-virtual {p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->O()V
	 /* .line 4 */
	 p1 = this.a;
	 (( c.b.k.r ) p1 ).invalidateOptionsMenu ( ); // invoke-virtual {p1}, Lc/b/k/r;->invalidateOptionsMenu()V
} // :cond_0
return;
} // .end method
