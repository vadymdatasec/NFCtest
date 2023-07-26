public abstract class e.f.c.u.b {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.concurrent.atomic.AtomicInteger a;
	 /* # direct methods */
	 public static e.f.c.u.b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
		 /* .line 2 */
		 android.os.SystemClock .elapsedRealtime ( );
		 /* move-result-wide v1 */
		 /* long-to-int v2, v1 */
		 /* invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
		 return;
	 } // .end method
	 public static Integer a ( ) {
		 /* .locals 1 */
		 /* .line 95 */
		 v0 = e.f.c.u.b.a;
		 v0 = 		 (( java.util.concurrent.atomic.AtomicInteger ) v0 ).incrementAndGet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
	 } // .end method
	 public static Integer a ( android.content.pm.PackageManager p0, android.content.res.Resources p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4 ) {
		 /* .locals 3 */
		 /* .line 48 */
		 v0 = 		 android.text.TextUtils .isEmpty ( p3 );
		 final String v1 = "FirebaseMessaging"; // const-string v1, "FirebaseMessaging"
		 /* if-nez v0, :cond_2 */
		 final String v0 = "drawable"; // const-string v0, "drawable"
		 /* .line 49 */
		 v0 = 		 (( android.content.res.Resources ) p1 ).getIdentifier ( p3, v0, p2 ); // invoke-virtual {p1, p3, v0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 50 */
			 v2 = 			 e.f.c.u.b .a ( p1,v0 );
			 if ( v2 != null) { // if-eqz v2, :cond_0
			 } // :cond_0
			 final String v0 = "mipmap"; // const-string v0, "mipmap"
			 /* .line 51 */
			 v0 = 			 (( android.content.res.Resources ) p1 ).getIdentifier ( p3, v0, p2 ); // invoke-virtual {p1, p3, v0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 52 */
				 v2 = 				 e.f.c.u.b .a ( p1,v0 );
				 if ( v2 != null) { // if-eqz v2, :cond_1
					 /* .line 53 */
				 } // :cond_1
				 java.lang.String .valueOf ( p3 );
				 v0 = 				 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
				 /* add-int/lit8 v0, v0, 0x3d */
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
				 final String v0 = "Icon resource "; // const-string v0, "Icon resource "
				 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).append ( p3 ); // invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 final String p3 = " not found.Notification will use default icon."; // const-string p3, " not found.Notification will use default icon."
				 (( java.lang.StringBuilder ) v2 ).append ( p3 ); // invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .w ( v1,p3 );
			 } // :cond_2
			 int p3 = 0; // const/4 p3, 0x0
			 final String v0 = "com.google.firebase.messaging.default_notification_icon"; // const-string v0, "com.google.firebase.messaging.default_notification_icon"
			 /* .line 54 */
			 p4 = 			 (( android.os.Bundle ) p4 ).getInt ( v0, p3 ); // invoke-virtual {p4, v0, p3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
			 if ( p4 != null) { // if-eqz p4, :cond_3
				 /* .line 55 */
				 v0 = 				 e.f.c.u.b .a ( p1,p4 );
				 /* if-nez v0, :cond_4 */
				 /* .line 56 */
			 } // :cond_3
			 try { // :try_start_0
				 (( android.content.pm.PackageManager ) p0 ).getApplicationInfo ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
				 /* iget p4, p0, Landroid/content/pm/ApplicationInfo;->icon:I */
				 /* :try_end_0 */
				 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 /* move-exception p0 */
				 /* .line 57 */
				 java.lang.String .valueOf ( p0 );
				 java.lang.String .valueOf ( p0 );
				 p2 = 				 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
				 /* add-int/lit8 p2, p2, 0x23 */
				 /* new-instance p3, Ljava/lang/StringBuilder; */
				 /* invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(I)V */
				 final String p2 = "Couldn\'t get own application info: "; // const-string p2, "Couldn\'t get own application info: "
				 (( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) p3 ).append ( p0 ); // invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .w ( v1,p0 );
			 } // :cond_4
		 } // :goto_0
		 if ( p4 != null) { // if-eqz p4, :cond_5
			 /* .line 58 */
			 p0 = 			 e.f.c.u.b .a ( p1,p4 );
			 /* if-nez p0, :cond_6 */
		 } // :cond_5
		 /* const p4, 0x1080093 */
	 } // :cond_6
} // .end method
public static Integer a ( e.f.c.u.a0 p0 ) {
	 /* .locals 2 */
	 final String v0 = "gcm.n.default_sound"; // const-string v0, "gcm.n.default_sound"
	 /* .line 40 */
	 v0 = 	 (( e.f.c.u.a0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
final String v1 = "gcm.n.default_vibrate_timings"; // const-string v1, "gcm.n.default_vibrate_timings"
/* .line 41 */
v1 = (( e.f.c.u.a0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* or-int/lit8 v0, v0, 0x2 */
} // :cond_1
final String v1 = "gcm.n.default_light_settings"; // const-string v1, "gcm.n.default_light_settings"
/* .line 42 */
p0 = (( e.f.c.u.a0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_2
	 /* or-int/lit8 v0, v0, 0x4 */
} // :cond_2
} // .end method
public static android.app.PendingIntent a ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 4 */
/* .line 104 */
v0 = e.f.c.u.b .a ( );
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "com.google.firebase.MESSAGING_EVENT"; // const-string v2, "com.google.firebase.MESSAGING_EVENT"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* new-instance v2, Landroid/content/ComponentName; */
final String v3 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"; // const-string v3, "com.google.firebase.iid.FirebaseInstanceIdReceiver"
/* invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
/* .line 105 */
(( android.content.Intent ) v1 ).setComponent ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
final String v2 = "wrapped_intent"; // const-string v2, "wrapped_intent"
/* .line 106 */
(( android.content.Intent ) v1 ).putExtra ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* const/high16 v1, 0x40000000 # 2.0f */
/* .line 107 */
android.app.PendingIntent .getBroadcast ( p0,v0,p1,v1 );
} // .end method
public static android.app.PendingIntent a ( android.content.Context p0, e.f.c.u.a0 p1 ) {
/* .locals 2 */
/* .line 100 */
v0 = e.f.c.u.b .c ( p1 );
/* if-nez v0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 101 */
} // :cond_0
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"; // const-string v1, "com.google.firebase.messaging.NOTIFICATION_DISMISS"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 102 */
(( e.f.c.u.a0 ) p1 ).i ( ); // invoke-virtual {p1}, Le/f/c/u/a0;->i()Landroid/os/Bundle;
(( android.content.Intent ) v0 ).putExtras ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 103 */
e.f.c.u.b .a ( p0,p1 );
} // .end method
public static android.app.PendingIntent a ( android.content.Context p0, e.f.c.u.a0 p1, android.app.PendingIntent p2 ) {
/* .locals 2 */
/* .line 96 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.google.firebase.messaging.NOTIFICATION_OPEN"; // const-string v1, "com.google.firebase.messaging.NOTIFICATION_OPEN"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 97 */
(( e.f.c.u.a0 ) p1 ).i ( ); // invoke-virtual {p1}, Le/f/c/u/a0;->i()Landroid/os/Bundle;
(( android.content.Intent ) v0 ).putExtras ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
final String v0 = "pending_intent"; // const-string v0, "pending_intent"
/* .line 98 */
(( android.content.Intent ) p1 ).putExtra ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* .line 99 */
e.f.c.u.b .a ( p0,p1 );
} // .end method
public static android.app.PendingIntent a ( android.content.Context p0, e.f.c.u.a0 p1, java.lang.String p2, android.content.pm.PackageManager p3 ) {
/* .locals 1 */
/* .line 72 */
e.f.c.u.b .a ( p2,p1,p3 );
/* if-nez p2, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
/* const/high16 p3, 0x4000000 */
/* .line 73 */
(( android.content.Intent ) p2 ).addFlags ( p3 ); // invoke-virtual {p2, p3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 74 */
(( e.f.c.u.a0 ) p1 ).j ( ); // invoke-virtual {p1}, Le/f/c/u/a0;->j()Landroid/os/Bundle;
(( android.content.Intent ) p2 ).putExtras ( p3 ); // invoke-virtual {p2, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 75 */
p3 = e.f.c.u.b .a ( );
/* const/high16 v0, 0x40000000 # 2.0f */
/* .line 76 */
android.app.PendingIntent .getActivity ( p0,p3,p2,v0 );
/* .line 77 */
p3 = e.f.c.u.b .c ( p1 );
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 78 */
e.f.c.u.b .a ( p0,p1,p2 );
} // :cond_1
} // .end method
public static android.content.Intent a ( java.lang.String p0, e.f.c.u.a0 p1, android.content.pm.PackageManager p2 ) {
/* .locals 2 */
final String v0 = "gcm.n.click_action"; // const-string v0, "gcm.n.click_action"
/* .line 79 */
(( e.f.c.u.a0 ) p1 ).g ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 80 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 81 */
/* new-instance p1, Landroid/content/Intent; */
/* invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 82 */
(( android.content.Intent ) p1 ).setPackage ( p0 ); // invoke-virtual {p1, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* const/high16 p0, 0x10000000 */
/* .line 83 */
(( android.content.Intent ) p1 ).setFlags ( p0 ); // invoke-virtual {p1, p0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
/* .line 84 */
} // :cond_0
(( e.f.c.u.a0 ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/u/a0;->b()Landroid/net/Uri;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 85 */
/* new-instance p2, Landroid/content/Intent; */
final String v0 = "android.intent.action.VIEW"; // const-string v0, "android.intent.action.VIEW"
/* invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 86 */
(( android.content.Intent ) p2 ).setPackage ( p0 ); // invoke-virtual {p2, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 87 */
(( android.content.Intent ) p2 ).setData ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 88 */
} // :cond_1
(( android.content.pm.PackageManager ) p2 ).getLaunchIntentForPackage ( p0 ); // invoke-virtual {p2, p0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
/* if-nez p0, :cond_2 */
final String p1 = "FirebaseMessaging"; // const-string p1, "FirebaseMessaging"
final String p2 = "No activity found to launch app"; // const-string p2, "No activity found to launch app"
/* .line 89 */
android.util.Log .w ( p1,p2 );
} // :cond_2
} // .end method
public static android.net.Uri a ( java.lang.String p0, e.f.c.u.a0 p1, android.content.res.Resources p2 ) {
/* .locals 1 */
/* .line 66 */
(( e.f.c.u.a0 ) p1 ).f ( ); // invoke-virtual {p1}, Le/f/c/u/a0;->f()Ljava/lang/String;
/* .line 67 */
v0 = android.text.TextUtils .isEmpty ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
final String v0 = "default"; // const-string v0, "default"
/* .line 68 */
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
final String v0 = "raw"; // const-string v0, "raw"
/* .line 69 */
p2 = (( android.content.res.Resources ) p2 ).getIdentifier ( p1, v0, p0 ); // invoke-virtual {p2, p1, v0, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 70 */
java.lang.String .valueOf ( p0 );
p2 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* add-int/lit8 p2, p2, 0x18 */
java.lang.String .valueOf ( p1 );
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/2addr p2, v0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p2 = "android.resource://"; // const-string p2, "android.resource://"
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "/raw/"; // const-string p0, "/raw/"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( p0 );
} // :cond_1
int p0 = 2; // const/4 p0, 0x2
/* .line 71 */
android.media.RingtoneManager .getDefaultUri ( p0 );
} // .end method
public static android.os.Bundle a ( android.content.pm.PackageManager p0, java.lang.String p1 ) {
/* .locals 1 */
/* const/16 v0, 0x80 */
/* .line 90 */
try { // :try_start_0
(( android.content.pm.PackageManager ) p0 ).getApplicationInfo ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 91 */
p1 = this.metaData;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 92 */
p0 = this.metaData;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 93 */
java.lang.String .valueOf ( p0 );
java.lang.String .valueOf ( p0 );
p1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/lit8 p1, p1, 0x23 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p1 = "Couldn\'t get own application info: "; // const-string p1, "Couldn\'t get own application info: "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p1 = "FirebaseMessaging"; // const-string p1, "FirebaseMessaging"
android.util.Log .w ( p1,p0 );
/* .line 94 */
} // :cond_0
p0 = android.os.Bundle.EMPTY;
} // .end method
public static e.f.c.u.a a ( android.content.Context p0, java.lang.String p1, e.f.c.u.a0 p2, java.lang.String p3, android.content.res.Resources p4, android.content.pm.PackageManager p5, android.os.Bundle p6 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lc/h/e/c0$a; */
/* invoke-direct {v0, p0, p3}, Lc/h/e/c0$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
final String p3 = "gcm.n.title"; // const-string p3, "gcm.n.title"
/* .line 2 */
(( e.f.c.u.a0 ) p2 ).b ( p4, p1, p3 ); // invoke-virtual {p2, p4, p1, p3}, Le/f/c/u/a0;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 3 */
v1 = android.text.TextUtils .isEmpty ( p3 );
/* if-nez v1, :cond_0 */
/* .line 4 */
(( c.h.e.c0$a ) v0 ).b ( p3 ); // invoke-virtual {v0, p3}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
} // :cond_0
final String p3 = "gcm.n.body"; // const-string p3, "gcm.n.body"
/* .line 5 */
(( e.f.c.u.a0 ) p2 ).b ( p4, p1, p3 ); // invoke-virtual {p2, p4, p1, p3}, Le/f/c/u/a0;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 6 */
v1 = android.text.TextUtils .isEmpty ( p3 );
/* if-nez v1, :cond_1 */
/* .line 7 */
(( c.h.e.c0$a ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Lc/h/e/c0$a;->a(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
/* .line 8 */
/* new-instance v1, Lc/h/e/y; */
/* invoke-direct {v1}, Lc/h/e/y;-><init>()V */
(( c.h.e.y ) v1 ).a ( p3 ); // invoke-virtual {v1, p3}, Lc/h/e/y;->a(Ljava/lang/CharSequence;)Lc/h/e/y;
(( c.h.e.c0$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;
} // :cond_1
final String p3 = "gcm.n.icon"; // const-string p3, "gcm.n.icon"
/* .line 9 */
(( e.f.c.u.a0 ) p2 ).g ( p3 ); // invoke-virtual {p2, p3}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 10 */
p3 = e.f.c.u.b .a ( p5,p4,p1,p3,p6 );
/* .line 11 */
(( c.h.e.c0$a ) v0 ).e ( p3 ); // invoke-virtual {v0, p3}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;
/* .line 12 */
e.f.c.u.b .a ( p1,p2,p4 );
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 13 */
(( c.h.e.c0$a ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Lc/h/e/c0$a;->a(Landroid/net/Uri;)Lc/h/e/c0$a;
/* .line 14 */
} // :cond_2
e.f.c.u.b .a ( p0,p2,p1,p5 );
(( c.h.e.c0$a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;
/* .line 15 */
e.f.c.u.b .a ( p0,p2 );
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 16 */
(( c.h.e.c0$a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/h/e/c0$a;->b(Landroid/app/PendingIntent;)Lc/h/e/c0$a;
} // :cond_3
final String p1 = "gcm.n.color"; // const-string p1, "gcm.n.color"
/* .line 17 */
(( e.f.c.u.a0 ) p2 ).g ( p1 ); // invoke-virtual {p2, p1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
e.f.c.u.b .a ( p0,p1,p6 );
if ( p0 != null) { // if-eqz p0, :cond_4
/* .line 18 */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
(( c.h.e.c0$a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->a(I)Lc/h/e/c0$a;
} // :cond_4
final String p0 = "gcm.n.sticky"; // const-string p0, "gcm.n.sticky"
/* .line 19 */
p0 = (( e.f.c.u.a0 ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z
int p1 = 1; // const/4 p1, 0x1
/* xor-int/2addr p0, p1 */
/* .line 20 */
(( c.h.e.c0$a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->a(Z)Lc/h/e/c0$a;
final String p0 = "gcm.n.local_only"; // const-string p0, "gcm.n.local_only"
/* .line 21 */
p0 = (( e.f.c.u.a0 ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z
/* .line 22 */
(( c.h.e.c0$a ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->c(Z)Lc/h/e/c0$a;
final String p0 = "gcm.n.ticker"; // const-string p0, "gcm.n.ticker"
/* .line 23 */
(( e.f.c.u.a0 ) p2 ).g ( p0 ); // invoke-virtual {p2, p0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
if ( p0 != null) { // if-eqz p0, :cond_5
/* .line 24 */
(( c.h.e.c0$a ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->c(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
/* .line 25 */
} // :cond_5
(( e.f.c.u.a0 ) p2 ).e ( ); // invoke-virtual {p2}, Le/f/c/u/a0;->e()Ljava/lang/Integer;
if ( p0 != null) { // if-eqz p0, :cond_6
/* .line 26 */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
(( c.h.e.c0$a ) v0 ).d ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->d(I)Lc/h/e/c0$a;
/* .line 27 */
} // :cond_6
(( e.f.c.u.a0 ) p2 ).h ( ); // invoke-virtual {p2}, Le/f/c/u/a0;->h()Ljava/lang/Integer;
if ( p0 != null) { // if-eqz p0, :cond_7
/* .line 28 */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
(( c.h.e.c0$a ) v0 ).f ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->f(I)Lc/h/e/c0$a;
/* .line 29 */
} // :cond_7
(( e.f.c.u.a0 ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/c/u/a0;->d()Ljava/lang/Integer;
if ( p0 != null) { // if-eqz p0, :cond_8
/* .line 30 */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
(( c.h.e.c0$a ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->c(I)Lc/h/e/c0$a;
} // :cond_8
final String p0 = "gcm.n.event_time"; // const-string p0, "gcm.n.event_time"
/* .line 31 */
(( e.f.c.u.a0 ) p2 ).f ( p0 ); // invoke-virtual {p2, p0}, Le/f/c/u/a0;->f(Ljava/lang/String;)Ljava/lang/Long;
if ( p0 != null) { // if-eqz p0, :cond_9
/* .line 32 */
(( c.h.e.c0$a ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/h/e/c0$a;->d(Z)Lc/h/e/c0$a;
/* .line 33 */
(( java.lang.Long ) p0 ).longValue ( ); // invoke-virtual {p0}, Ljava/lang/Long;->longValue()J
/* move-result-wide p3 */
(( c.h.e.c0$a ) v0 ).b ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Lc/h/e/c0$a;->b(J)Lc/h/e/c0$a;
/* .line 34 */
} // :cond_9
(( e.f.c.u.a0 ) p2 ).g ( ); // invoke-virtual {p2}, Le/f/c/u/a0;->g()[J
if ( p0 != null) { // if-eqz p0, :cond_a
/* .line 35 */
(( c.h.e.c0$a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->a([J)Lc/h/e/c0$a;
/* .line 36 */
} // :cond_a
(( e.f.c.u.a0 ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/c/u/a0;->a()[I
int p3 = 0; // const/4 p3, 0x0
if ( p0 != null) { // if-eqz p0, :cond_b
/* .line 37 */
/* aget p4, p0, p3 */
/* aget p1, p0, p1 */
int p5 = 2; // const/4 p5, 0x2
/* aget p0, p0, p5 */
(( c.h.e.c0$a ) v0 ).a ( p4, p1, p0 ); // invoke-virtual {v0, p4, p1, p0}, Lc/h/e/c0$a;->a(III)Lc/h/e/c0$a;
/* .line 38 */
} // :cond_b
p0 = e.f.c.u.b .a ( p2 );
(( c.h.e.c0$a ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/c0$a;->b(I)Lc/h/e/c0$a;
/* .line 39 */
/* new-instance p0, Le/f/c/u/a; */
e.f.c.u.b .b ( p2 );
/* invoke-direct {p0, v0, p1, p3}, Le/f/c/u/a;-><init>(Lc/h/e/c0$a;Ljava/lang/String;I)V */
} // .end method
public static java.lang.Integer a ( android.content.Context p0, java.lang.String p1, android.os.Bundle p2 ) {
/* .locals 4 */
/* .line 59 */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x15 */
/* if-ge v0, v2, :cond_0 */
/* .line 60 */
} // :cond_0
v0 = android.text.TextUtils .isEmpty ( p1 );
final String v2 = "FirebaseMessaging"; // const-string v2, "FirebaseMessaging"
/* if-nez v0, :cond_1 */
/* .line 61 */
try { // :try_start_0
v0 = android.graphics.Color .parseColor ( p1 );
java.lang.Integer .valueOf ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 62 */
/* :catch_0 */
java.lang.String .valueOf ( p1 );
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, 0x38 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v0 = "Color is invalid: "; // const-string v0, "Color is invalid: "
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".Notification will use default color."; // const-string p1, ".Notification will use default color."
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,p1 );
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
final String v0 = "com.google.firebase.messaging.default_notification_color"; // const-string v0, "com.google.firebase.messaging.default_notification_color"
/* .line 63 */
p1 = (( android.os.Bundle ) p2 ).getInt ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 64 */
try { // :try_start_1
p0 = c.h.f.f .a ( p0,p1 );
java.lang.Integer .valueOf ( p0 );
/* :try_end_1 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
final String p0 = "Cannot find the color resource referenced in AndroidManifest."; // const-string p0, "Cannot find the color resource referenced in AndroidManifest."
/* .line 65 */
android.util.Log .w ( v2,p0 );
} // :cond_2
} // .end method
public static Boolean a ( android.content.res.Resources p0, Integer p1 ) {
/* .locals 4 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1a */
} // .end annotation
final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
/* .line 43 */
int v2 = 1; // const/4 v2, 0x1
/* const/16 v3, 0x1a */
/* if-eq v1, v3, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 44 */
try { // :try_start_0
(( android.content.res.Resources ) p0 ).getDrawable ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
/* .line 45 */
/* instance-of p0, p0, Landroid/graphics/drawable/AdaptiveIconDrawable; */
if ( p0 != null) { // if-eqz p0, :cond_1
/* const/16 p0, 0x4d */
/* .line 46 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p0 = "Adaptive icons cannot be used in notifications.Ignoring icon id: "; // const-string p0, "Adaptive icons cannot be used in notifications.Ignoring icon id: "
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,p0 );
/* :try_end_0 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
/* :catch_0 */
/* const/16 p0, 0x42 */
/* .line 47 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p0 = "Couldn\'t find resource "; // const-string p0, "Couldn\'t find resource "
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = ", treating it as an invalid icon"; // const-string p0, ", treating it as an invalid icon"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,p0 );
} // .end method
public static e.f.c.u.a b ( android.content.Context p0, e.f.c.u.a0 p1 ) {
/* .locals 9 */
/* .line 1 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
e.f.c.u.b .a ( v0,v1 );
/* .line 2 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 3 */
(( e.f.c.u.a0 ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/u/a0;->c()Ljava/lang/String;
e.f.c.u.b .b ( p0,v0,v8 );
/* .line 4 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 5 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* move-object v2, p0 */
/* move-object v4, p1 */
/* .line 6 */
/* invoke-static/range {v2 ..v8}, Le/f/c/u/b;->a(Landroid/content/Context;Ljava/lang/String;Le/f/c/u/a0;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/pm/PackageManager;Landroid/os/Bundle;)Le/f/c/u/a; */
} // .end method
public static java.lang.String b ( android.content.Context p0, java.lang.String p1, android.os.Bundle p2 ) {
/* .locals 5 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1a */
} // .end annotation
/* .line 7 */
/* const/16 v1, 0x1a */
int v2 = 0; // const/4 v2, 0x0
/* if-ge v0, v1, :cond_0 */
/* .line 8 */
} // :cond_0
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 9 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
(( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
/* iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I */
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-ge v0, v1, :cond_1 */
/* .line 10 */
} // :cond_1
/* const-class v0, Landroid/app/NotificationManager; */
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/NotificationManager; */
/* .line 11 */
v1 = android.text.TextUtils .isEmpty ( p1 );
final String v2 = "FirebaseMessaging"; // const-string v2, "FirebaseMessaging"
/* if-nez v1, :cond_3 */
/* .line 12 */
(( android.app.NotificationManager ) v0 ).getNotificationChannel ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 13 */
} // :cond_2
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x7a */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Notification Channel requested ("; // const-string v1, "Notification Channel requested ("
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ") has not been created by the app.Manifest configuration, or default, value will be used."; // const-string p1, ") has not been created by the app.Manifest configuration, or default, value will be used."
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,p1 );
} // :cond_3
final String p1 = "com.google.firebase.messaging.default_notification_channel_id"; // const-string p1, "com.google.firebase.messaging.default_notification_channel_id"
/* .line 14 */
(( android.os.Bundle ) p2 ).getString ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 15 */
p2 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez p2, :cond_5 */
/* .line 16 */
(( android.app.NotificationManager ) v0 ).getNotificationChannel ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;
if ( p2 != null) { // if-eqz p2, :cond_4
} // :cond_4
final String p1 = "Notification Channel set in AndroidManifest.xml has not been created by the app.Default value will be used."; // const-string p1, "Notification Channel set in AndroidManifest.xml has not been created by the app.Default value will be used."
/* .line 17 */
android.util.Log .w ( v2,p1 );
} // :cond_5
final String p1 = "Missing Default Notification Channel metadata in AndroidManifest.Default value will be used."; // const-string p1, "Missing Default Notification Channel metadata in AndroidManifest.Default value will be used."
/* .line 18 */
android.util.Log .w ( v2,p1 );
} // :goto_0
final String p1 = "fcm_fallback_notification_channel"; // const-string p1, "fcm_fallback_notification_channel"
/* .line 19 */
(( android.app.NotificationManager ) v0 ).getNotificationChannel ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;
/* if-nez p2, :cond_6 */
/* .line 20 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 21 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v2 = "fcm_fallback_notification_channel_label"; // const-string v2, "fcm_fallback_notification_channel_label"
final String v3 = "string"; // const-string v3, "string"
/* .line 22 */
p2 = (( android.content.res.Resources ) p2 ).getIdentifier ( v2, v3, v1 ); // invoke-virtual {p2, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 23 */
/* new-instance v1, Landroid/app/NotificationChannel; */
/* .line 24 */
(( android.content.Context ) p0 ).getString ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
int p2 = 3; // const/4 p2, 0x3
/* invoke-direct {v1, p1, p0, p2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V */
/* .line 25 */
(( android.app.NotificationManager ) v0 ).createNotificationChannel ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V
} // :cond_6
/* :catch_0 */
} // .end method
public static java.lang.String b ( e.f.c.u.a0 p0 ) {
/* .locals 3 */
final String v0 = "gcm.n.tag"; // const-string v0, "gcm.n.tag"
/* .line 26 */
(( e.f.c.u.a0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
/* .line 27 */
v0 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v0, :cond_0 */
/* .line 28 */
} // :cond_0
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* const/16 p0, 0x25 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p0 = "FCM-Notification:"; // const-string p0, "FCM-Notification:"
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Boolean c ( e.f.c.u.a0 p0 ) {
/* .locals 1 */
final String v0 = "google.c.a.e"; // const-string v0, "google.c.a.e"
/* .line 1 */
p0 = (( e.f.c.u.a0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z
} // .end method
