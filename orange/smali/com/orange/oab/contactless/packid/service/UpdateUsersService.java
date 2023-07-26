public class com.orange.oab.contactless.packid.service.UpdateUsersService extends androidx.core.app.JobIntentService {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.service.UpdateUsersService ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroidx/core/app/JobIntentService;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.content.Context p0, Boolean p1, Boolean p2, java.lang.String p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/h/d/a/a/n/r; */
		 /* invoke-direct {v0, p1}, Le/h/d/a/a/n/r;-><init>(Landroid/content/Context;)V */
		 (( e.h.d.a.a.n.r ) v0 ).a ( p2, p3, p4 ); // invoke-virtual {v0, p2, p3, p4}, Le/h/d/a/a/n/r;->a(ZZLjava/lang/String;)V
		 return;
	 } // .end method
	 public void onHandleWork ( android.content.Intent p0 ) {
		 /* .locals 4 */
		 final String v0 = "alertOnNetworkError"; // const-string v0, "alertOnNetworkError"
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 1 */
		 v0 = 		 (( android.content.Intent ) p1 ).getBooleanExtra ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
		 final String v1 = "sendUsersUpdatedIntent"; // const-string v1, "sendUsersUpdatedIntent"
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 2 */
		 v1 = 		 (( android.content.Intent ) p1 ).getBooleanExtra ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
		 final String v2 = "firebaseRegistrationId"; // const-string v2, "firebaseRegistrationId"
		 /* .line 3 */
		 (( android.content.Intent ) p1 ).getStringExtra ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 4 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "Update user from server "; // const-string v3, "Update user from server "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v3 = "with"; // const-string v3, "with"
		 } // :cond_0
		 final String v3 = "without"; // const-string v3, "without"
	 } // :goto_0
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = " alert on errors"; // const-string v3, " alert on errors"
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v3 = "packid.UpUserService"; // const-string v3, "packid.UpUserService"
	 android.util.Log .i ( v3,v2 );
	 /* .line 5 */
	 (( com.orange.oab.contactless.packid.service.UpdateUsersService ) p0 ).a ( p0, v0, v1, p1 ); // invoke-virtual {p0, p0, v0, v1, p1}, Lcom/orange/oab/contactless/packid/service/UpdateUsersService;->a(Landroid/content/Context;ZZLjava/lang/String;)V
	 return;
} // .end method
