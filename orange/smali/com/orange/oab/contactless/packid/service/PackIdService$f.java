public class com.orange.oab.contactless.packid.service.PackIdService$f extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/oab/contactless/packid/service/PackIdService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "f" */
} // .end annotation
/* # instance fields */
public final com.orange.oab.contactless.packid.service.PackIdService a; //synthetic
/* # direct methods */
public com.orange.oab.contactless.packid.service.PackIdService$f ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
public com.orange.oab.contactless.packid.service.PackIdService$f ( ) { //synthethic
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService$f;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.a;
/* monitor-enter p1 */
/* .line 2 */
try { // :try_start_0
	 p2 = this.a;
	 com.orange.oab.contactless.packid.service.PackIdService .c ( p2 );
	 /* .line 3 */
	 /* monitor-exit p1 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p2 */
	 /* monitor-exit p1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw p2 */
} // .end method
