public class com.orange.oab.contactless.packid.service.PackIdService$c extends android.content.BroadcastReceiver {
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
public com.orange.oab.contactless.packid.service.PackIdService$c ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 1 */
final String p1 = "contactlessId"; // const-string p1, "contactlessId"
/* .line 1 */
(( android.content.Intent ) p2 ).getSerializableExtra ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast p1, Lfr/mbs/binary/Octets; */
final String v0 = "zoneId"; // const-string v0, "zoneId"
/* .line 2 */
(( android.content.Intent ) p2 ).getSerializableExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast p2, Lfr/mbs/binary/Octets; */
/* .line 3 */
v0 = this.a;
com.orange.oab.contactless.packid.service.PackIdService .b ( v0 );
(( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
return;
} // .end method
