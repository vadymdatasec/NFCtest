public class com.orange.oab.contactless.packid.service.LogManager$a extends android.os.ResultReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/oab/contactless/packid/service/LogManager;->a(Landroid/content/Context;Le/h/d/a/a/w/n;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final e.h.d.a.a.w.n b; //synthetic
/* # direct methods */
public com.orange.oab.contactless.packid.service.LogManager$a ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p2;
/* invoke-direct {p0, p1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V */
return;
} // .end method
/* # virtual methods */
public void onReceiveResult ( Integer p0, android.os.Bundle p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/os/ResultReceiver;->onReceiveResult(ILandroid/os/Bundle;)V */
final String p1 = "grant_result"; // const-string p1, "grant_result"
/* .line 2 */
(( android.os.Bundle ) p2 ).getIntArray ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I
int p2 = 0; // const/4 p2, 0x0
/* .line 3 */
/* aget p2, p1, p2 */
/* if-nez p2, :cond_0 */
int p2 = 1; // const/4 p2, 0x1
/* aget p1, p1, p2 */
/* if-nez p1, :cond_0 */
/* .line 4 */
p1 = this.b;
} // :cond_0
final String p1 = "LogManager"; // const-string p1, "LogManager"
final String p2 = "Permissions Denied by user not initialising Persistent Logs"; // const-string p2, "Permissions Denied by user not initialising Persistent Logs"
/* .line 5 */
android.util.Log .v ( p1,p2 );
} // :goto_0
return;
} // .end method
