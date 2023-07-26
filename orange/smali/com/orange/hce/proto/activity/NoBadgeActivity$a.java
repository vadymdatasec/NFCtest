public class com.orange.hce.proto.activity.NoBadgeActivity$a extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/hce/proto/activity/NoBadgeActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final com.orange.hce.proto.activity.NoBadgeActivity a; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.NoBadgeActivity$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.a;
com.orange.hce.proto.activity.NoBadgeActivity .a ( v0 );
(( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 2 */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 p2 = this.a;
	 int v0 = 0; // const/4 v0, 0x0
	 final String v1 = "BadgeListActivity"; // const-string v1, "BadgeListActivity"
	 (( android.app.Activity ) p2 ).getSharedPreferences ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 /* .line 4 */
	 /* new-instance v1, Lcom/orange/business/packid/android/lib/PackId; */
	 /* invoke-direct {v1, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
	 v1 = 	 (( com.orange.business.packid.android.lib.PackId ) v1 ).hasBleBadges ( ); // invoke-virtual {v1}, Lcom/orange/business/packid/android/lib/PackId;->hasBleBadges()Z
	 final String v2 = "NoBadgeActivity"; // const-string v2, "NoBadgeActivity"
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 int v1 = 1; // const/4 v1, 0x1
		 v1 = 		 final String v3 = "hasSeePermissionsActivity"; // const-string v3, "hasSeePermissionsActivity"
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 5 */
			 /* new-instance v1, Landroid/content/Intent; */
			 /* const-class v4, Lcom/orange/hce/proto/activity/PermissionsActivity; */
			 /* invoke-direct {v1, p1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
			 /* .line 6 */
			 p1 = this.a;
			 (( android.app.Activity ) p1 ).startActivity ( v1 ); // invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
			 /* .line 7 */
			 /* .line 8 */
			 p1 = this.a;
			 com.orange.hce.proto.activity.NoBadgeActivity .b ( p1 );
			 final String p1 = "Starting PermissionsActivity"; // const-string p1, "Starting PermissionsActivity"
			 /* .line 9 */
			 android.util.Log .i ( v2,p1 );
			 /* .line 10 */
		 } // :cond_0
		 /* new-instance p2, Landroid/content/Intent; */
		 /* const-class v0, Lcom/orange/hce/proto/activity/BadgeListActivity; */
		 /* invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* .line 11 */
		 p1 = this.a;
		 (( android.app.Activity ) p1 ).startActivity ( p2 ); // invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
		 /* .line 12 */
		 p1 = this.a;
		 com.orange.hce.proto.activity.NoBadgeActivity .b ( p1 );
		 final String p1 = "Starting BadgeListActivity"; // const-string p1, "Starting BadgeListActivity"
		 /* .line 13 */
		 android.util.Log .i ( v2,p1 );
		 /* .line 14 */
	 } // :goto_0
	 p1 = this.a;
	 (( android.app.Activity ) p1 ).finish ( ); // invoke-virtual {p1}, Landroid/app/Activity;->finish()V
	 /* .line 15 */
} // :cond_1
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v0 = "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"; // const-string v0, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 16 */
	 p1 = this.a;
	 final String v0 = "message"; // const-string v0, "message"
	 (( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 com.orange.hce.proto.activity.NoBadgeActivity .a ( p1,p2 );
	 /* .line 17 */
	 p1 = this.a;
	 com.orange.hce.proto.activity.NoBadgeActivity .b ( p1 );
} // :cond_2
} // :goto_1
return;
} // .end method
