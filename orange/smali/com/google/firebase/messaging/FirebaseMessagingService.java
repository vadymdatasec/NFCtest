public class com.google.firebase.messaging.FirebaseMessagingService extends e.f.c.u.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.Queue g;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Queue<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static com.google.firebase.messaging.FirebaseMessagingService ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayDeque; */
/* const/16 v1, 0xa */
/* invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V */
return;
} // .end method
public com.google.firebase.messaging.FirebaseMessagingService ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/c/u/i;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public void a ( e.f.c.u.b0 p0 ) {
/* .locals 0 */
return;
} // .end method
public void a ( java.lang.String p0, java.lang.Exception p1 ) {
/* .locals 0 */
return;
} // .end method
public final Boolean a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = android.text.TextUtils .isEmpty ( p1 );
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
} // :cond_0
v0 = v0 = com.google.firebase.messaging.FirebaseMessagingService.g;
if ( v0 != null) { // if-eqz v0, :cond_3
	 int v0 = 3; // const/4 v0, 0x3
	 final String v1 = "FirebaseMessaging"; // const-string v1, "FirebaseMessaging"
	 /* .line 3 */
	 v0 = 	 android.util.Log .isLoggable ( v1,v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 final String v0 = "Received duplicate message: "; // const-string v0, "Received duplicate message: "
		 /* .line 4 */
		 java.lang.String .valueOf ( p1 );
		 v2 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 (( java.lang.String ) v0 ).concat ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 } // :cond_1
		 /* new-instance p1, Ljava/lang/String; */
		 /* invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
	 } // :goto_0
	 android.util.Log .d ( v1,p1 );
} // :cond_2
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
} // :cond_3
v0 = v0 = com.google.firebase.messaging.FirebaseMessagingService.g;
/* const/16 v2, 0xa */
/* if-lt v0, v2, :cond_4 */
/* .line 6 */
v0 = com.google.firebase.messaging.FirebaseMessagingService.g;
/* .line 7 */
} // :cond_4
v0 = com.google.firebase.messaging.FirebaseMessagingService.g;
} // .end method
public android.content.Intent b ( android.content.Intent p0 ) {
/* .locals 0 */
/* .line 1 */
e.f.c.q.w .b ( );
(( e.f.c.q.w ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/q/w;->a()Landroid/content/Intent;
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public void c ( android.content.Intent p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "com.google.android.c2dm.intent.RECEIVE"; // const-string v1, "com.google.android.c2dm.intent.RECEIVE"
/* .line 2 */
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_5 */
final String v1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"; // const-string v1, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
final String v1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"; // const-string v1, "com.google.firebase.messaging.NOTIFICATION_DISMISS"
/* .line 3 */
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
v0 = e.f.c.u.z .u ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 5 */
e.f.c.u.z .o ( p1 );
return;
} // :cond_1
final String v1 = "com.google.firebase.messaging.NEW_TOKEN"; // const-string v1, "com.google.firebase.messaging.NEW_TOKEN"
/* .line 6 */
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "token"; // const-string v0, "token"
/* .line 7 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->c(Ljava/lang/String;)V
return;
} // :cond_2
final String v0 = "Unknown intent action: "; // const-string v0, "Unknown intent action: "
/* .line 8 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_3
(( java.lang.String ) v0 ).concat ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_3
/* new-instance p1, Ljava/lang/String; */
/* invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
android.util.Log .d ( v0,p1 );
} // :cond_4
return;
/* .line 9 */
} // :cond_5
} // :goto_1
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->h(Landroid/content/Intent;)V
return;
} // .end method
public void c ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean d ( android.content.Intent p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "com.google.firebase.messaging.NOTIFICATION_OPEN"; // const-string v1, "com.google.firebase.messaging.NOTIFICATION_OPEN"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->i(Landroid/content/Intent;)V
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void f ( android.content.Intent p0 ) {
/* .locals 4 */
/* .line 1 */
(( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
} // :cond_0
final String v1 = "androidx.content.wakelockid"; // const-string v1, "androidx.content.wakelockid"
/* .line 3 */
(( android.os.Bundle ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
/* .line 4 */
v1 = e.f.c.u.a0 .a ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
/* new-instance v1, Le/f/c/u/a0; */
/* invoke-direct {v1, v0}, Le/f/c/u/a0;-><init>(Landroid/os/Bundle;)V */
/* .line 6 */
e.f.c.u.j .c ( );
/* .line 7 */
/* new-instance v3, Le/f/c/u/d; */
/* invoke-direct {v3, p0, v1, v2}, Le/f/c/u/d;-><init>(Landroid/content/Context;Le/f/c/u/a0;Ljava/util/concurrent/Executor;)V */
/* .line 8 */
try { // :try_start_0
v1 = (( e.f.c.u.d ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/c/u/d;->a()Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 9 */
return;
/* .line 10 */
} // :cond_1
/* .line 11 */
v1 = e.f.c.u.z .u ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 12 */
e.f.c.u.z .p ( p1 );
/* :catchall_0 */
/* move-exception p1 */
/* .line 13 */
/* .line 14 */
/* throw p1 */
/* .line 15 */
} // :cond_2
} // :goto_0
/* new-instance p1, Le/f/c/u/b0; */
/* invoke-direct {p1, v0}, Le/f/c/u/b0;-><init>(Landroid/os/Bundle;)V */
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->a(Le/f/c/u/b0;)V
return;
} // .end method
public final java.lang.String g ( android.content.Intent p0 ) {
/* .locals 1 */
final String v0 = "google.message_id"; // const-string v0, "google.message_id"
/* .line 1 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v0, :cond_0 */
final String v0 = "message_id"; // const-string v0, "message_id"
/* .line 2 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
} // .end method
public final void h ( android.content.Intent p0 ) {
/* .locals 1 */
final String v0 = "google.message_id"; // const-string v0, "google.message_id"
/* .line 1 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2 */
v0 = (( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->a(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
/* .line 3 */
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).j ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->j(Landroid/content/Intent;)V
} // :cond_0
return;
} // .end method
public final void i ( android.content.Intent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.u.z .u ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
e.f.c.u.z .q ( p1 );
} // :cond_0
return;
} // .end method
public final void j ( android.content.Intent p0 ) {
/* .locals 7 */
final String v0 = "message_type"; // const-string v0, "message_type"
/* .line 1 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "gcm"; // const-string v1, "gcm"
/* if-nez v0, :cond_0 */
/* move-object v0, v1 */
} // :cond_0
int v2 = -1; // const/4 v2, -0x1
/* .line 2 */
v3 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
int v4 = 3; // const/4 v4, 0x3
int v5 = 2; // const/4 v5, 0x2
int v6 = 1; // const/4 v6, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v1 = "send_event"; // const-string v1, "send_event"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_1 */
final String v1 = "send_error"; // const-string v1, "send_error"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_2 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_3 */
final String v1 = "deleted_messages"; // const-string v1, "deleted_messages"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
} // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_6
/* if-eq v2, v6, :cond_5 */
/* if-eq v2, v5, :cond_4 */
/* if-eq v2, v4, :cond_3 */
final String p1 = "Received message with unknown type: "; // const-string p1, "Received message with unknown type: "
/* .line 3 */
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_2
(( java.lang.String ) p1 ).concat ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_2
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, v0 */
} // :goto_1
final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
android.util.Log .w ( v0,p1 );
return;
/* .line 4 */
} // :cond_3
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->g(Landroid/content/Intent;)Ljava/lang/String;
/* new-instance v1, Lcom/google/firebase/messaging/SendException; */
final String v2 = "error"; // const-string v2, "error"
/* .line 5 */
(( android.content.Intent ) p1 ).getStringExtra ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v1, p1}, Lcom/google/firebase/messaging/SendException;-><init>(Ljava/lang/String;)V */
/* .line 6 */
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->a(Ljava/lang/String;Ljava/lang/Exception;)V
return;
} // :cond_4
final String v0 = "google.message_id"; // const-string v0, "google.message_id"
/* .line 7 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->b(Ljava/lang/String;)V
return;
/* .line 8 */
} // :cond_5
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->a()V
return;
/* .line 9 */
} // :cond_6
e.f.c.u.z .r ( p1 );
/* .line 10 */
(( com.google.firebase.messaging.FirebaseMessagingService ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->f(Landroid/content/Intent;)V
return;
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x7aedf14e -> :sswitch_3 */
/* 0x18f11 -> :sswitch_2 */
/* 0x308f3e91 -> :sswitch_1 */
/* 0x3090df23 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
