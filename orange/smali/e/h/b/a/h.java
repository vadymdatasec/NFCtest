public abstract class e.h.b.a.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final void a ( Integer p0, com.orange.hce.proto.activity.PermissionsActivity p1, java.lang.String[] p2, android.content.DialogInterface p3, Integer p4 ) {
		 /* .locals 1 */
		 final String p4 = "$activity"; // const-string p4, "$activity"
		 i.h.c.k .c ( p1,p4 );
		 final String p4 = "$permList"; // const-string p4, "$permList"
		 i.h.c.k .c ( p2,p4 );
		 /* const/16 p4, 0x2b68 */
		 /* if-ne p0, p4, :cond_0 */
		 /* .line 11 */
		 /* new-instance p0, Landroid/content/Intent; */
		 final String p2 = "android.settings.APPLICATION_DETAILS_SETTINGS"; // const-string p2, "android.settings.APPLICATION_DETAILS_SETTINGS"
		 /* invoke-direct {p0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 /* const/high16 p2, 0x10000000 */
		 /* .line 12 */
		 (( android.content.Intent ) p0 ).addFlags ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
		 /* .line 13 */
		 (( android.app.Activity ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
		 int p4 = 0; // const/4 p4, 0x0
		 final String v0 = "package"; // const-string v0, "package"
		 android.net.Uri .fromParts ( v0,p2,p4 );
		 /* .line 14 */
		 (( android.content.Intent ) p0 ).setData ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
		 /* .line 15 */
		 (( android.app.Activity ) p1 ).startActivity ( p0 ); // invoke-virtual {p1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
		 /* .line 16 */
	 } // :cond_0
	 (( android.app.Activity ) p1 ).requestPermissions ( p2, p0 ); // invoke-virtual {p1, p2, p0}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
	 /* .line 17 */
} // :goto_0
return;
} // .end method
public static final void a ( Object p0, Integer p1 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1f */
} // .end annotation
final String v0 = "activity"; // const-string v0, "activity"
i.h.c.k .c ( p0,v0 );
final String v0 = "android.permission.BLUETOOTH_SCAN"; // const-string v0, "android.permission.BLUETOOTH_SCAN"
/* .line 21 */
v1 = e.h.b.a.h .a ( p0,v0 );
/* if-nez v1, :cond_1 */
final String v1 = "android.permission.BLUETOOTH_CONNECT"; // const-string v1, "android.permission.BLUETOOTH_CONNECT"
v2 = e.h.b.a.h .a ( p0,v1 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 22 */
} // :cond_0
/* filled-new-array {v0, v1}, [Ljava/lang/String; */
/* .line 23 */
(( android.app.Activity ) p0 ).requestPermissions ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
} // :cond_1
} // :goto_0
return;
} // .end method
public static final void a ( com.orange.hce.proto.activity.PermissionsActivity p0, Integer p1 ) {
/* .locals 4 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1e */
} // .end annotation
final String v0 = "activity"; // const-string v0, "activity"
i.h.c.k .c ( p0,v0 );
final String v0 = "android.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"
/* .line 1 */
v1 = e.h.b.a.h .a ( p0,v0 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v1, "android.permission.ACCESS_FINE_LOCATION"
/* .line 2 */
v1 = e.h.b.a.h .a ( p0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
return;
/* .line 3 */
} // :cond_0
/* filled-new-array {v0}, [Ljava/lang/String; */
/* .line 4 */
/* new-instance v1, Lc/b/k/p; */
/* invoke-direct {v1, p0}, Lc/b/k/p;-><init>(Landroid/content/Context;)V */
/* const v2, 0x7f0e0100 */
/* .line 5 */
(( c.b.k.p ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/p;->b(I)Lc/b/k/p;
/* const v2, 0x7f0e00ff */
/* .line 6 */
(( c.b.k.p ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/p;->a(I)Lc/b/k/p;
/* const v2, 0x7f0e017b */
/* .line 7 */
/* new-instance v3, Le/h/b/a/c; */
/* invoke-direct {v3, p1, p0, v0}, Le/h/b/a/c;-><init>(ILcom/orange/hce/proto/activity/PermissionsActivity;[Ljava/lang/String;)V */
(( c.b.k.p ) v1 ).b ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lc/b/k/p;->b(ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
/* const p1, 0x7f0e00db */
/* .line 8 */
/* new-instance v0, Le/h/b/a/b; */
/* invoke-direct {v0, p0}, Le/h/b/a/b;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( c.b.k.p ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/b/k/p;->a(ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
/* .line 9 */
(( c.b.k.p ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/k/p;->a()Lc/b/k/q;
/* .line 10 */
(( android.app.Dialog ) p0 ).show ( ); // invoke-virtual {p0}, Landroid/app/Dialog;->show()V
return;
} // .end method
public static final void a ( com.orange.hce.proto.activity.PermissionsActivity p0, android.content.DialogInterface p1, Integer p2 ) {
/* .locals 0 */
final String p2 = "$activity"; // const-string p2, "$activity"
i.h.c.k .c ( p0,p2 );
/* .line 18 */
int p1 = 1; // const/4 p1, 0x1
/* .line 19 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V
/* .line 20 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
} // .end method
public static final Boolean a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
final String v0 = "<this>"; // const-string v0, "<this>"
i.h.c.k .c ( p0,v0 );
final String v0 = "permission"; // const-string v0, "permission"
i.h.c.k .c ( p1,v0 );
/* .line 24 */
p0 = c.h.f.f .a ( p0,p1 );
/* if-nez p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static final void b ( Object p0, Integer p1 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1c */
} // .end annotation
final String v0 = "activity"; // const-string v0, "activity"
i.h.c.k .c ( p0,v0 );
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
/* .line 1 */
v1 = e.h.b.a.h .a ( p0,v0 );
/* if-nez v1, :cond_0 */
/* .line 2 */
/* filled-new-array {v0}, [Ljava/lang/String; */
/* .line 3 */
(( android.app.Activity ) p0 ).requestPermissions ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
} // :cond_0
return;
} // .end method
public static final void b ( com.orange.hce.proto.activity.PermissionsActivity p0, Integer p1 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1e */
} // .end annotation
final String v0 = "activity"; // const-string v0, "activity"
i.h.c.k .c ( p0,v0 );
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
/* .line 4 */
v1 = e.h.b.a.h .a ( p0,v0 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "android.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"
v1 = e.h.b.a.h .a ( p0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
return;
/* .line 5 */
} // :cond_0
v1 = e.h.b.a.h .a ( p0,v0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* const/16 p1, 0x2b68 */
/* .line 6 */
e.h.b.a.h .a ( p0,p1 );
return;
/* .line 7 */
} // :cond_1
/* filled-new-array {v0}, [Ljava/lang/String; */
/* .line 8 */
(( android.app.Activity ) p0 ).requestPermissions ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
return;
} // .end method
public static final void c ( Object p0, Integer p1 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1d */
} // .end annotation
final String v0 = "activity"; // const-string v0, "activity"
i.h.c.k .c ( p0,v0 );
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
/* .line 1 */
v1 = e.h.b.a.h .a ( p0,v0 );
final String v2 = "android.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v2, "android.permission.ACCESS_BACKGROUND_LOCATION"
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
v1 = e.h.b.a.h .a ( p0,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
return;
/* .line 3 */
} // :cond_0
/* filled-new-array {v0, v2}, [Ljava/lang/String; */
/* .line 4 */
(( android.app.Activity ) p0 ).requestPermissions ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
return;
} // .end method
