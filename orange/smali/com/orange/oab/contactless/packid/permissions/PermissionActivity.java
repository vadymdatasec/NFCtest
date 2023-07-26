public class com.orange.oab.contactless.packid.permissions.PermissionActivity extends android.app.Activity {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.os.ResultReceiver b;
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.permissions.PermissionActivity ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/os/Bundle; */
		 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
		 final String v1 = "permissions_array"; // const-string v1, "permissions_array"
		 /* .line 2 */
		 (( android.os.Bundle ) v0 ).putStringArray ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
		 final String p2 = "grant_result"; // const-string p2, "grant_result"
		 /* .line 3 */
		 (( android.os.Bundle ) v0 ).putIntArray ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V
		 final String p2 = "request_code"; // const-string p2, "request_code"
		 /* .line 4 */
		 (( android.os.Bundle ) v0 ).putInt ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
		 /* .line 5 */
		 p2 = this.b;
		 (( android.os.ResultReceiver ) p2 ).send ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V
		 /* .line 6 */
		 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
		 return;
	 } // .end method
	 public final Boolean a ( java.lang.String[] p0 ) {
		 /* .locals 4 */
		 /* .line 7 */
		 /* array-length v0, p1 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* if-ge v2, v0, :cond_1 */
	 /* aget-object v3, p1, v2 */
	 /* .line 8 */
	 v3 = 	 c.h.f.f .a ( p0,v3 );
	 if ( v3 != null) { // if-eqz v3, :cond_0
	 } // :cond_0
	 /* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // :goto_1
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 2 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
final String v0 = "result_receiver"; // const-string v0, "result_receiver"
(( android.content.Intent ) p1 ).getParcelableExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast p1, Landroid/os/ResultReceiver; */
this.b = p1;
/* .line 4 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
final String v0 = "permissions_array"; // const-string v0, "permissions_array"
(( android.content.Intent ) p1 ).getStringArrayExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
/* .line 5 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
/* const/16 v1, 0x7b */
final String v2 = "request_code"; // const-string v2, "request_code"
v0 = (( android.content.Intent ) v0 ).getIntExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 6 */
v1 = (( com.orange.oab.contactless.packid.permissions.PermissionActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/permissions/PermissionActivity;->a([Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* .line 7 */
c.h.e.f .a ( p0,p1,v0 );
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* aput v2, v1, v2 */
/* .line 8 */
(( com.orange.oab.contactless.packid.permissions.PermissionActivity ) p0 ).a ( v0, p1, v1 ); // invoke-virtual {p0, v0, p1, v1}, Lcom/orange/oab/contactless/packid/permissions/PermissionActivity;->a(I[Ljava/lang/String;[I)V
/* .line 9 */
} // :cond_1
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
} // :goto_0
return;
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V */
/* .line 2 */
(( com.orange.oab.contactless.packid.permissions.PermissionActivity ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/permissions/PermissionActivity;->a(I[Ljava/lang/String;[I)V
return;
} // .end method
