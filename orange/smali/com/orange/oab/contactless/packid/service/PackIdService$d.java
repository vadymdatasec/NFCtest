public class com.orange.oab.contactless.packid.service.PackIdService$d extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/oab/contactless/packid/service/PackIdService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.orange.oab.contactless.packid.service.PackIdService a; //synthetic
/* # direct methods */
public com.orange.oab.contactless.packid.service.PackIdService$d ( ) {
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
p1 = (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 2 */
	 p1 = this.a;
	 com.orange.oab.contactless.packid.service.PackIdService .b ( p1 );
	 (( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a()V
} // :cond_0
return;
} // .end method
