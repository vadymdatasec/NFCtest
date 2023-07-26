public class com.orange.hce.proto.activity.BadgeListActivity$d extends android.content.BroadcastReceiver {
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
public com.orange.hce.proto.activity.BadgeListActivity$d ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
final String p1 = "zoneId"; // const-string p1, "zoneId"
/* .line 1 */
(( android.content.Intent ) p2 ).getStringExtra ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
fr.mbs.binary.Octets .createOctets ( p1 );
final String v0 = "contactlessId"; // const-string v0, "contactlessId"
/* .line 2 */
(( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
fr.mbs.binary.Octets .createOctets ( v0 );
final String v1 = "button_status"; // const-string v1, "button_status"
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
p2 = (( android.content.Intent ) p2 ).getBooleanExtra ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
/* .line 4 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "State Recieved"; // const-string v2, "State Recieved"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.BadgeList"; // const-string v2, "packid.BadgeList"
android.util.Log .d ( v2,v1 );
/* .line 5 */
v1 = this.a;
com.orange.hce.proto.activity.BadgeListActivity .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 6 */
	 v2 = this.a;
	 v2 = 	 com.orange.hce.proto.activity.BadgeListActivity .b ( v2 );
	 /* if-nez v2, :cond_0 */
	 /* .line 7 */
	 (( e.h.b.a.l.y0 ) v1 ).a ( v0, p1, p2 ); // invoke-virtual {v1, v0, p1, p2}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Z)V
} // :cond_0
return;
} // .end method
