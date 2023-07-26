public class com.orange.hce.proto.activity.BadgeListActivity$b extends android.content.BroadcastReceiver {
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
public com.orange.hce.proto.activity.BadgeListActivity$b ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v0 = "android.nfc.action.ADAPTER_STATE_CHANGED"; // const-string v0, "android.nfc.action.ADAPTER_STATE_CHANGED"
/* .line 2 */
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
	 int p1 = 1; // const/4 p1, 0x1
	 final String v0 = "android.nfc.extra.ADAPTER_STATE"; // const-string v0, "android.nfc.extra.ADAPTER_STATE"
	 /* .line 3 */
	 p2 = 	 (( android.content.Intent ) p2 ).getIntExtra ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
	 /* .line 4 */
	 v0 = this.a;
	 int v1 = 3; // const/4 v1, 0x3
	 /* if-ne v1, p2, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( com.orange.hce.proto.activity.BadgeListActivity ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->c(Z)V
} // :cond_1
return;
} // .end method
