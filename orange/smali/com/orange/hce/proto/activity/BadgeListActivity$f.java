public class com.orange.hce.proto.activity.BadgeListActivity$f extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/hce/proto/activity/BadgeListActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "f" */
} // .end annotation
/* # instance fields */
public final com.orange.hce.proto.activity.BadgeListActivity a; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.BadgeListActivity$f ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
public com.orange.hce.proto.activity.BadgeListActivity$f ( ) { //synthethic
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
return;
} // .end method
/* # virtual methods */
public final Boolean a ( android.content.Intent p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v0 = "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"; // const-string v0, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public final Boolean b ( android.content.Intent p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"; // const-string v1, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v0 = "reason"; // const-string v0, "reason"
	 (( android.content.Intent ) p1 ).getSerializableExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
	 v0 = com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason.ENCRYPTION_ERROR;
	 /* if-ne p1, v0, :cond_0 */
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "userUpdateReceiver onReceive "; // const-string v1, "userUpdateReceiver onReceive "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "reason"; // const-string v1, "reason"
v2 = (( android.content.Intent ) p2 ).hasExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = " with reason "; // const-string v3, " with reason "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Intent ) p2 ).getSerializableExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
final String v1 = ""; // const-string v1, ""
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.BadgeList"; // const-string v1, "packid.BadgeList"
android.util.Log .d ( v1,v0 );
/* .line 2 */
v0 = this.a;
com.orange.hce.proto.activity.BadgeListActivity .c ( v0 );
/* .line 3 */
v0 = (( com.orange.hce.proto.activity.BadgeListActivity$f ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->b(Landroid/content/Intent;)Z
final String v1 = "message"; // const-string v1, "message"
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = this.a;
(( android.content.Intent ) p2 ).getStringExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
com.orange.hce.proto.activity.BadgeListActivity .a ( v0,p2 );
/* .line 5 */
} // :cond_1
v0 = (( com.orange.hce.proto.activity.BadgeListActivity$f ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a(Landroid/content/Intent;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
v0 = this.a;
(( android.content.Intent ) p2 ).getStringExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( com.orange.hce.proto.activity.BadgeListActivity ) v0 ).c ( p2 ); // invoke-virtual {v0, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->c(Ljava/lang/String;)V
/* .line 7 */
} // :cond_2
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v0 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v0, "com.orange.oab.contactless.packid.action.USER_UPDATED"
p2 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 8 */
p2 = this.a;
com.orange.hce.proto.activity.BadgeListActivity .d ( p2 );
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 9 */
p2 = this.a;
com.orange.hce.proto.activity.BadgeListActivity .d ( p2 );
int v0 = 0; // const/4 v0, 0x0
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p2 ).setRefreshing ( v0 ); // invoke-virtual {p2, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V
/* .line 10 */
} // :cond_3
p2 = this.a;
com.orange.hce.proto.activity.BadgeListActivity .e ( p2 );
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 11 */
p2 = this.a;
com.orange.hce.proto.activity.BadgeListActivity .e ( p2 );
(( android.app.ProgressDialog ) p2 ).dismiss ( ); // invoke-virtual {p2}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 12 */
p2 = this.a;
int v0 = 0; // const/4 v0, 0x0
com.orange.hce.proto.activity.BadgeListActivity .a ( p2,v0 );
/* .line 13 */
} // :cond_4
/* new-instance p2, Lcom/orange/business/packid/android/lib/PackId; */
v0 = this.a;
/* invoke-direct {p2, v0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
p2 = (( com.orange.business.packid.android.lib.PackId ) p2 ).hasBleBadges ( ); // invoke-virtual {p2}, Lcom/orange/business/packid/android/lib/PackId;->hasBleBadges()Z
if ( p2 != null) { // if-eqz p2, :cond_5
p2 = this.a;
p2 = com.orange.hce.proto.activity.BadgeListActivity .f ( p2 );
/* if-nez p2, :cond_5 */
/* .line 14 */
p2 = this.a;
com.orange.hce.proto.activity.BadgeListActivity .g ( p2 );
/* .line 15 */
} // :cond_5
com.orange.hce.proto.widget.PackIdWidgetProvider .c ( p1 );
/* .line 16 */
} // :cond_6
} // :goto_1
/* new-instance p2, Lcom/orange/business/packid/android/lib/PackId; */
v0 = this.a;
/* invoke-direct {p2, v0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
p2 = (( com.orange.business.packid.android.lib.PackId ) p2 ).getUsers ( ); // invoke-virtual {p2}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 17 */
p2 = this.a;
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/orange/hce/proto/activity/NoBadgeActivity; */
/* invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( android.app.Activity ) p2 ).startActivity ( v0 ); // invoke-virtual {p2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
} // :cond_7
return;
} // .end method
