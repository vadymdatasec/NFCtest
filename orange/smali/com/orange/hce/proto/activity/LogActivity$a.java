public class com.orange.hce.proto.activity.LogActivity$a implements android.widget.CompoundButton$OnCheckedChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/hce/proto/activity/LogActivity;->onResume()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.orange.hce.proto.activity.LogActivity a; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.LogActivity$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCheckedChanged ( android.widget.CompoundButton p0, Boolean p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
com.orange.hce.proto.activity.LogActivity .a ( v0 );
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) v0 ).reset ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->reset()V
/* .line 2 */
v0 = this.a;
java.lang.Boolean .valueOf ( p2 );
com.orange.hce.proto.activity.LogActivity .a ( v0,v1 );
/* .line 3 */
(( android.widget.CompoundButton ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
if ( p2 != null) { // if-eqz p2, :cond_0
	 final String p2 = "Starting"; // const-string p2, "Starting"
} // :cond_0
final String p2 = "Stopping"; // const-string p2, "Stopping"
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = " RSSI calibration"; // const-string p2, " RSSI calibration"
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
com.orange.oab.contactless.packid.service.LogManager .log ( p1,v0,p2,v1 );
return;
} // .end method
