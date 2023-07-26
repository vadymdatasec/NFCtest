public class com.orange.oab.contactless.packid.service.PackIdService$e extends java.util.TimerTask {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/oab/contactless/packid/service/PackIdService;->c()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.orange.oab.contactless.packid.service.PackIdService b; //synthetic
/* # direct methods */
public com.orange.oab.contactless.packid.service.PackIdService$e ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
com.orange.oab.contactless.packid.service.PackIdService .b ( v0 );
(( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b()V
return;
} // .end method
