public class com.orange.oab.contactless.packid.service.PackIdService$b extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/oab/contactless/packid/service/PackIdService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # direct methods */
public com.orange.oab.contactless.packid.service.PackIdService$b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
final String v0 = "contactlessId"; // const-string v0, "contactlessId"
/* .line 1 */
(( android.content.Intent ) p2 ).getSerializableExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast v0, Lfr/mbs/binary/Octets; */
final String v1 = "zoneId"; // const-string v1, "zoneId"
/* .line 2 */
(( android.content.Intent ) p2 ).getSerializableExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast p2, Lfr/mbs/binary/Octets; */
/* .line 3 */
/* new-instance v1, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v1, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v1 ).startBleTransaction ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Lcom/orange/business/packid/android/lib/PackId;->startBleTransaction(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
return;
} // .end method
