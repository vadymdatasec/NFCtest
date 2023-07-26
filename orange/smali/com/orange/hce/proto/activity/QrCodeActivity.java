public class com.orange.hce.proto.activity.QrCodeActivity extends c.b.k.r implements j.a.a.b.b$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public j.a.a.b.b q;
	 /* # direct methods */
	 public com.orange.hce.proto.activity.QrCodeActivity ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/b/k/r;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "QR Code found: "; // const-string v1, "QR Code found: "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( e.f.e.j ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "packid.qrcode"; // const-string v1, "packid.qrcode"
		 android.util.Log .i ( v1,v0 );
		 /* .line 2 */
		 (( e.f.e.j ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;
		 android.net.Uri .parse ( p1 );
		 /* .line 3 */
		 v0 = 		 (( com.orange.hce.proto.activity.QrCodeActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/QrCodeActivity;->a(Landroid/net/Uri;)Z
		 /* if-nez v0, :cond_1 */
		 v0 = 		 (( com.orange.hce.proto.activity.QrCodeActivity ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/QrCodeActivity;->b(Landroid/net/Uri;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 /* const p1, 0x7f0e00c1 */
		 /* .line 4 */
		 (( android.app.Activity ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
		 int v0 = 0; // const/4 v0, 0x0
		 android.widget.Toast .makeText ( p0,p1,v0 );
		 (( android.widget.Toast ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/widget/Toast;->show()V
		 /* .line 5 */
		 p1 = this.q;
		 (( j.a.a.b.b ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lj/a/a/b/b;->a(Lj/a/a/b/b$a;)V
		 /* .line 6 */
	 } // :cond_1
} // :goto_0
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 7 */
(( android.content.Intent ) v0 ).setData ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
int p1 = -1; // const/4 p1, -0x1
/* .line 8 */
(( android.app.Activity ) p0 ).setResult ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V
/* .line 9 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
} // :goto_1
return;
} // .end method
public final Boolean a ( android.net.Uri p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean b ( android.net.Uri p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v0 = "packids"; // const-string v0, "packids"
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V */
/* .line 2 */
/* new-instance p1, Lj/a/a/b/b; */
/* invoke-direct {p1, p0}, Lj/a/a/b/b;-><init>(Landroid/content/Context;)V */
this.q = p1;
/* .line 3 */
v0 = e.f.e.a.m;
java.util.Collections .singletonList ( v0 );
(( j.a.a.b.b ) p1 ).setFormats ( v0 ); // invoke-virtual {p1, v0}, Lj/a/a/b/b;->setFormats(Ljava/util/List;)V
/* .line 4 */
p1 = this.q;
/* const/high16 v0, 0x3f000000 # 0.5f */
(( j.a.a.a.a ) p1 ).setAspectTolerance ( v0 ); // invoke-virtual {p1, v0}, Lj/a/a/a/a;->setAspectTolerance(F)V
/* .line 5 */
p1 = this.q;
(( c.b.k.r ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(Landroid/view/View;)V
final String p1 = "android.permission.CAMERA"; // const-string p1, "android.permission.CAMERA"
/* .line 6 */
v0 = c.h.f.f .a ( p0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
/* filled-new-array {p1}, [Ljava/lang/String; */
/* const/16 v0, 0x64 */
c.h.e.f .a ( p0,p1,v0 );
} // :cond_0
return;
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onPause()V */
/* .line 2 */
v0 = this.q;
(( j.a.a.a.a ) v0 ).d ( ); // invoke-virtual {v0}, Lj/a/a/a/a;->d()V
return;
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 1 */
/* const/16 v0, 0x64 */
/* if-ne p1, v0, :cond_0 */
/* .line 1 */
/* array-length p1, p2 */
/* if-lez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* aget-object p2, p2, p1 */
final String v0 = "android.permission.CAMERA"; // const-string v0, "android.permission.CAMERA"
/* .line 2 */
p2 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* array-length p2, p3 */
/* if-lez p2, :cond_0 */
/* aget p1, p3, p1 */
int p2 = -1; // const/4 p2, -0x1
/* if-ne p1, p2, :cond_0 */
/* .line 3 */
/* new-instance p1, Landroid/content/Intent; */
/* const-class p2, Lcom/orange/hce/proto/activity/SplashScreenActivity; */
/* invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( android.app.Activity ) p0 ).startActivity ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 4 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
} // :cond_0
return;
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onResume()V */
/* .line 2 */
v0 = this.q;
(( j.a.a.b.b ) v0 ).setResultHandler ( p0 ); // invoke-virtual {v0, p0}, Lj/a/a/b/b;->setResultHandler(Lj/a/a/b/b$a;)V
/* .line 3 */
v0 = this.q;
(( j.a.a.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lj/a/a/a/a;->c()V
return;
} // .end method
