public class e.h.d.a.a.r.e extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.r.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( android.content.Intent p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 final String v1 = "com.orange.oab.contactless.packid.action.UPDATE_USERS"; // const-string v1, "com.orange.oab.contactless.packid.action.UPDATE_USERS"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "alertOnNetworkError"; // const-string v0, "alertOnNetworkError"
			 /* .line 2 */
			 p1 = 			 (( android.content.Intent ) p1 ).getBooleanExtra ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
			 if ( p1 != null) { // if-eqz p1, :cond_0
			 } // :cond_0
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
	 } // .end method
	 public java.lang.String b ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 final String v0 = "firebaseRegistrationId"; // const-string v0, "firebaseRegistrationId"
		 /* .line 1 */
		 (( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 } // .end method
	 public Boolean c ( android.content.Intent p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 final String v1 = "com.orange.oab.contactless.packid.action.UPDATE_USERS"; // const-string v1, "com.orange.oab.contactless.packid.action.UPDATE_USERS"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "sendUsersUpdatedIntent"; // const-string v0, "sendUsersUpdatedIntent"
			 v0 = 			 (( android.content.Intent ) p1 ).getBooleanExtra ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
			 /* if-nez v0, :cond_1 */
			 /* .line 2 */
		 } // :cond_0
		 (( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 final String v2 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v2, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
		 v0 = 		 (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 p1 = 			 (( e.h.d.a.a.r.e ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/e;->d(Landroid/content/Intent;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_2
			 } // :cond_1
			 int v1 = 1; // const/4 v1, 0x1
		 } // :cond_2
	 } // .end method
	 public final Boolean d ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 final String v0 = "eventType"; // const-string v0, "eventType"
		 /* .line 1 */
		 (( android.content.Intent ) p1 ).getSerializableExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
		 /* .line 2 */
		 v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.DONE;
		 p1 = 		 (( java.lang.Enum ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
	 } // .end method
	 public final Boolean e ( android.content.Intent p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 final String v1 = "android.intent.action.USER_PRESENT"; // const-string v1, "android.intent.action.USER_PRESENT"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_1 */
		 /* .line 2 */
		 (( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 final String v1 = "com.orange.oab.contactless.packid.action.UPDATE_USERS"; // const-string v1, "com.orange.oab.contactless.packid.action.UPDATE_USERS"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_1 */
		 /* .line 3 */
		 (( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 final String v1 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v1, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 p1 = 			 (( e.h.d.a.a.r.e ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/e;->d(Landroid/content/Intent;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_0
			 } // :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :cond_1
	 } // :goto_0
	 int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Received: "; // const-string v1, "Received: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "UpdateUsers"; // const-string v1, "UpdateUsers"
android.util.Log .i ( v1,v0 );
/* .line 2 */
v0 = (( e.h.d.a.a.r.e ) p0 ).e ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/r/e;->e(Landroid/content/Intent;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 v0 = 	 e.h.d.a.a.w.h .a ( p1 );
	 /* if-nez v0, :cond_0 */
	 final String p1 = "Device is not connected"; // const-string p1, "Device is not connected"
	 /* .line 4 */
	 android.util.Log .i ( v1,p1 );
	 return;
	 /* .line 5 */
} // :cond_0
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/orange/oab/contactless/packid/service/UpdateUsersService; */
/* invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 6 */
v1 = (( e.h.d.a.a.r.e ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/r/e;->a(Landroid/content/Intent;)Z
final String v2 = "alertOnNetworkError"; // const-string v2, "alertOnNetworkError"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 7 */
v1 = (( e.h.d.a.a.r.e ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/r/e;->c(Landroid/content/Intent;)Z
final String v2 = "sendUsersUpdatedIntent"; // const-string v2, "sendUsersUpdatedIntent"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 8 */
(( e.h.d.a.a.r.e ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/r/e;->b(Landroid/content/Intent;)Ljava/lang/String;
final String v1 = "firebaseRegistrationId"; // const-string v1, "firebaseRegistrationId"
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 9 */
/* const-class p2, Lcom/orange/oab/contactless/packid/service/UpdateUsersService; */
/* const v1, 0x31996974 */
androidx.core.app.JobIntentService .enqueueWork ( p1,p2,v1,v0 );
} // :cond_1
return;
} // .end method
