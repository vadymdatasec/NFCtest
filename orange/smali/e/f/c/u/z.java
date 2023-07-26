public abstract class e.f.c.u.z {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.c.n.a a;
	 /* # direct methods */
	 public static e.f.c.u.z ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/c/n/h/f; */
		 /* invoke-direct {v0}, Le/f/c/n/h/f;-><init>()V */
		 /* const-class v1, Le/f/c/u/t; */
		 /* new-instance v2, Le/f/c/u/u; */
		 /* invoke-direct {v2}, Le/f/c/u/u;-><init>()V */
		 /* .line 2 */
		 (( e.f.c.n.h.f ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/n/h/f;->a(Ljava/lang/Class;Le/f/c/n/c;)Le/f/c/n/h/f;
		 /* const-class v1, Le/f/c/u/v; */
		 /* new-instance v2, Le/f/c/u/s; */
		 /* invoke-direct {v2}, Le/f/c/u/s;-><init>()V */
		 /* .line 3 */
		 (( e.f.c.n.h.f ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/n/h/f;->a(Ljava/lang/Class;Le/f/c/n/c;)Le/f/c/n/h/f;
		 /* .line 4 */
		 (( e.f.c.n.h.f ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/n/h/f;->a()Le/f/c/n/a;
		 return;
	 } // .end method
	 public static Integer a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 final String v0 = "high"; // const-string v0, "high"
		 /* .line 47 */
		 v0 = 		 (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p0 = 1; // const/4 p0, 0x1
		 } // :cond_0
		 final String v0 = "normal"; // const-string v0, "normal"
		 /* .line 48 */
		 p0 = 		 (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 int p0 = 2; // const/4 p0, 0x2
		 } // :cond_1
		 int p0 = 0; // const/4 p0, 0x0
	 } // .end method
	 public static java.lang.String a ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 final String v0 = "collapse_key"; // const-string v0, "collapse_key"
		 /* .line 46 */
		 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 } // .end method
	 public static void a ( java.lang.String p0, android.content.Intent p1 ) {
		 /* .locals 4 */
		 /* .line 13 */
		 /* new-instance v0, Landroid/os/Bundle; */
		 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
		 /* .line 14 */
		 e.f.c.u.z .b ( p1 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 final String v2 = "_nmid"; // const-string v2, "_nmid"
			 /* .line 15 */
			 (( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 16 */
		 } // :cond_0
		 e.f.c.u.z .c ( p1 );
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 final String v2 = "_nmn"; // const-string v2, "_nmn"
			 /* .line 17 */
			 (( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 18 */
		 } // :cond_1
		 e.f.c.u.z .f ( p1 );
		 /* .line 19 */
		 v2 = 		 android.text.TextUtils .isEmpty ( v1 );
		 /* if-nez v2, :cond_2 */
		 final String v2 = "label"; // const-string v2, "label"
		 /* .line 20 */
		 (( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 21 */
	 } // :cond_2
	 e.f.c.u.z .d ( p1 );
	 /* .line 22 */
	 v2 = 	 android.text.TextUtils .isEmpty ( v1 );
	 /* if-nez v2, :cond_3 */
	 final String v2 = "message_channel"; // const-string v2, "message_channel"
	 /* .line 23 */
	 (( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 24 */
} // :cond_3
e.f.c.u.z .k ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_4
	 final String v2 = "_nt"; // const-string v2, "_nt"
	 /* .line 25 */
	 (( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 26 */
} // :cond_4
e.f.c.u.z .g ( p1 );
final String v2 = "FirebaseMessaging"; // const-string v2, "FirebaseMessaging"
if ( v1 != null) { // if-eqz v1, :cond_5
	 try { // :try_start_0
		 final String v3 = "_nmt"; // const-string v3, "_nmt"
		 /* .line 27 */
		 v1 = 		 java.lang.Integer .parseInt ( v1 );
		 (( android.os.Bundle ) v0 ).putInt ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v1 */
		 final String v3 = "Error while parsing timestamp in GCM event"; // const-string v3, "Error while parsing timestamp in GCM event"
		 /* .line 28 */
		 android.util.Log .w ( v2,v3,v1 );
		 /* .line 29 */
	 } // :cond_5
} // :goto_0
e.f.c.u.z .m ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_6
	 try { // :try_start_1
		 final String v3 = "_ndt"; // const-string v3, "_ndt"
		 /* .line 30 */
		 v1 = 		 java.lang.Integer .parseInt ( v1 );
		 /* .line 31 */
		 (( android.os.Bundle ) v0 ).putInt ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NumberFormatException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* :catch_1 */
		 /* move-exception v1 */
		 final String v3 = "Error while parsing use_device_time in GCM event"; // const-string v3, "Error while parsing use_device_time in GCM event"
		 /* .line 32 */
		 android.util.Log .w ( v2,v3,v1 );
		 /* .line 33 */
	 } // :cond_6
} // :goto_1
e.f.c.u.z .i ( p1 );
final String v1 = "_nr"; // const-string v1, "_nr"
/* .line 34 */
v1 = (( java.lang.String ) v1 ).equals ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_7 */
final String v1 = "_nf"; // const-string v1, "_nf"
/* .line 35 */
v1 = (( java.lang.String ) v1 ).equals ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_8
} // :cond_7
final String v1 = "_nmc"; // const-string v1, "_nmc"
/* .line 36 */
(( android.os.Bundle ) v0 ).putString ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
} // :cond_8
int p1 = 3; // const/4 p1, 0x3
/* .line 37 */
p1 = android.util.Log .isLoggable ( v2,p1 );
if ( p1 != null) { // if-eqz p1, :cond_9
/* .line 38 */
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( p0 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x25 */
java.lang.String .valueOf ( p1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/2addr v1, v3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Logging to scion event="; // const-string v1, "Logging to scion event="
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " scionPayload="; // const-string v1, " scionPayload="
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,p1 );
/* .line 39 */
} // :cond_9
e.f.c.h .j ( );
/* const-class v1, Le/f/c/j/a/c; */
(( e.f.c.h ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/f/c/h;->a(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast p1, Le/f/c/j/a/c; */
if ( p1 != null) { // if-eqz p1, :cond_a
final String v1 = "fcm"; // const-string v1, "fcm"
/* .line 40 */
return;
} // :cond_a
final String p0 = "Unable to log event: analytics library is missing"; // const-string p0, "Unable to log event: analytics library is missing"
/* .line 41 */
android.util.Log .w ( v2,p0 );
return;
} // .end method
public static void a ( java.lang.String p0, android.content.Intent p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Landroid/content/Intent;", */
/* "Le/f/a/a/f<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 42 */
/* new-instance v0, Le/f/c/u/v; */
/* invoke-direct {v0, p0, p1}, Le/f/c/u/v;-><init>(Ljava/lang/String;Landroid/content/Intent;)V */
/* .line 43 */
/* new-instance p0, Le/f/c/u/t; */
/* invoke-direct {p0, v0}, Le/f/c/u/t;-><init>(Le/f/c/u/v;)V */
/* .line 44 */
try { // :try_start_0
p1 = e.f.c.u.z.a;
e.f.a.a.c .a ( p0 );
/* :try_end_0 */
/* .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
final String p0 = "FirebaseMessaging"; // const-string p0, "FirebaseMessaging"
final String p1 = "Failed to encode big query analytics payload.Skip sending"; // const-string p1, "Failed to encode big query analytics payload.Skip sending"
/* .line 45 */
android.util.Log .d ( p0,p1 );
return;
} // .end method
public static Boolean a ( ) {
/* .locals 6 */
final String v0 = "delivery_metrics_exported_to_big_query_enabled"; // const-string v0, "delivery_metrics_exported_to_big_query_enabled"
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
try { // :try_start_0
e.f.c.h .j ( );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 2 */
e.f.c.h .j ( );
(( e.f.c.h ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/c/h;->b()Landroid/content/Context;
final String v3 = "com.google.firebase.messaging"; // const-string v3, "com.google.firebase.messaging"
/* .line 3 */
(( android.content.Context ) v2 ).getSharedPreferences ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v4 = "export_to_big_query"; // const-string v4, "export_to_big_query"
v5 = /* .line 4 */
if ( v5 != null) { // if-eqz v5, :cond_0
	 v0 = 	 /* .line 5 */
	 /* .line 6 */
} // :cond_0
try { // :try_start_1
	 (( android.content.Context ) v2 ).getPackageManager ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* .line 7 */
		 (( android.content.Context ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 /* const/16 v4, 0x80 */
		 /* .line 8 */
		 (( android.content.pm.PackageManager ) v3 ).getApplicationInfo ( v2, v4 ); // invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* .line 9 */
			 v3 = this.metaData;
			 if ( v3 != null) { // if-eqz v3, :cond_1
				 v3 = this.metaData;
				 /* .line 10 */
				 v3 = 				 (( android.os.Bundle ) v3 ).containsKey ( v0 ); // invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
				 if ( v3 != null) { // if-eqz v3, :cond_1
					 /* .line 11 */
					 v2 = this.metaData;
					 v0 = 					 (( android.os.Bundle ) v2 ).getBoolean ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
					 /* :try_end_1 */
					 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
					 /* :catch_0 */
				 } // :cond_1
				 /* :catch_1 */
				 final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
				 final String v2 = "FirebaseApp has not being initialized.Device might be in direct boot mode.Skip exporting delivery metrics to Big Query"; // const-string v2, "FirebaseApp has not being initialized.Device might be in direct boot mode.Skip exporting delivery metrics to Big Query"
				 /* .line 12 */
				 android.util.Log .i ( v0,v2 );
			 } // .end method
			 public static java.lang.String b ( ) {
				 /* .locals 1 */
				 /* .line 2 */
				 e.f.c.h .j ( );
				 com.google.firebase.iid.FirebaseInstanceId .getInstance ( v0 );
				 (( com.google.firebase.iid.FirebaseInstanceId ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->c()Ljava/lang/String;
			 } // .end method
			 public static java.lang.String b ( android.content.Intent p0 ) {
				 /* .locals 1 */
				 final String v0 = "google.c.a.c_id"; // const-string v0, "google.c.a.c_id"
				 /* .line 1 */
				 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 } // .end method
			 public static java.lang.String c ( ) {
				 /* .locals 1 */
				 /* .line 2 */
				 e.f.c.h .j ( );
				 (( e.f.c.h ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/h;->b()Landroid/content/Context;
				 (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 } // .end method
			 public static java.lang.String c ( android.content.Intent p0 ) {
				 /* .locals 1 */
				 final String v0 = "google.c.a.c_l"; // const-string v0, "google.c.a.c_l"
				 /* .line 1 */
				 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 } // .end method
			 public static java.lang.String d ( ) {
				 /* .locals 4 */
				 /* .line 2 */
				 e.f.c.h .j ( );
				 /* .line 3 */
				 (( e.f.c.h ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;
				 (( e.f.c.i ) v1 ).c ( ); // invoke-virtual {v1}, Le/f/c/i;->c()Ljava/lang/String;
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 4 */
				 } // :cond_0
				 (( e.f.c.h ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;
				 (( e.f.c.i ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;
				 final String v1 = "1:"; // const-string v1, "1:"
				 /* .line 5 */
				 v1 = 				 (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
				 /* if-nez v1, :cond_1 */
			 } // :cond_1
			 final String v1 = ":"; // const-string v1, ":"
			 /* .line 6 */
			 (( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
			 /* .line 7 */
			 /* array-length v1, v0 */
			 int v2 = 2; // const/4 v2, 0x2
			 int v3 = 0; // const/4 v3, 0x0
			 /* if-ge v1, v2, :cond_2 */
		 } // :cond_2
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 8 */
		 /* aget-object v0, v0, v1 */
		 /* .line 9 */
		 v1 = 		 (( java.lang.String ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
		 if ( v1 != null) { // if-eqz v1, :cond_3
		 } // :cond_3
	 } // .end method
	 public static java.lang.String d ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 final String v0 = "google.c.a.m_c"; // const-string v0, "google.c.a.m_c"
		 /* .line 1 */
		 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 } // .end method
	 public static java.lang.String e ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 final String v0 = "google.message_id"; // const-string v0, "google.message_id"
		 /* .line 1 */
		 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "message_id"; // const-string v0, "message_id"
		 /* .line 2 */
		 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 } // :cond_0
} // .end method
public static java.lang.String f ( android.content.Intent p0 ) {
	 /* .locals 1 */
	 final String v0 = "google.c.a.m_l"; // const-string v0, "google.c.a.m_l"
	 /* .line 1 */
	 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public static java.lang.String g ( android.content.Intent p0 ) {
	 /* .locals 1 */
	 final String v0 = "google.c.a.ts"; // const-string v0, "google.c.a.ts"
	 /* .line 1 */
	 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public static java.lang.String h ( android.content.Intent p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( android.content.Intent ) p0 ).getExtras ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( android.content.Intent ) p0 ).getExtras ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 p0 = 		 e.f.c.u.a0 .a ( p0 );
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 final String p0 = "DISPLAY_NOTIFICATION"; // const-string p0, "DISPLAY_NOTIFICATION"
		 } // :cond_0
		 final String p0 = "DATA_MESSAGE"; // const-string p0, "DATA_MESSAGE"
	 } // .end method
	 public static java.lang.String i ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.content.Intent ) p0 ).getExtras ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.content.Intent ) p0 ).getExtras ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
			 p0 = 			 e.f.c.u.a0 .a ( p0 );
			 if ( p0 != null) { // if-eqz p0, :cond_0
				 final String p0 = "display"; // const-string p0, "display"
			 } // :cond_0
			 final String p0 = "data"; // const-string p0, "data"
		 } // .end method
		 public static Integer j ( android.content.Intent p0 ) {
			 /* .locals 2 */
			 final String v0 = "google.delivered_priority"; // const-string v0, "google.delivered_priority"
			 /* .line 1 */
			 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 /* if-nez v0, :cond_1 */
			 final String v0 = "google.priority_reduced"; // const-string v0, "google.priority_reduced"
			 /* .line 2 */
			 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 final String v1 = "1"; // const-string v1, "1"
			 v0 = 			 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 int p0 = 2; // const/4 p0, 0x2
			 } // :cond_0
			 final String v0 = "google.priority"; // const-string v0, "google.priority"
			 /* .line 3 */
			 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 /* .line 4 */
		 } // :cond_1
		 p0 = 		 e.f.c.u.z .a ( v0 );
	 } // .end method
	 public static java.lang.String k ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 final String v0 = "from"; // const-string v0, "from"
		 /* .line 1 */
		 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 final String v0 = "/topics/"; // const-string v0, "/topics/"
			 /* .line 2 */
			 v0 = 			 (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
			 } // :cond_0
			 int p0 = 0; // const/4 p0, 0x0
		 } // .end method
		 public static Integer l ( android.content.Intent p0 ) {
			 /* .locals 2 */
			 /* .line 1 */
			 (( android.content.Intent ) p0 ).getExtras ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
			 final String v0 = "google.ttl"; // const-string v0, "google.ttl"
			 (( android.os.Bundle ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
			 /* .line 2 */
			 /* instance-of v0, p0, Ljava/lang/Integer; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 /* check-cast p0, Ljava/lang/Integer; */
				 p0 = 				 (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
				 /* .line 4 */
			 } // :cond_0
			 /* instance-of v0, p0, Ljava/lang/String; */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 5 */
				 try { // :try_start_0
					 /* move-object v0, p0 */
					 /* check-cast v0, Ljava/lang/String; */
					 p0 = 					 java.lang.Integer .parseInt ( v0 );
					 /* :try_end_0 */
					 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .line 6 */
					 /* :catch_0 */
					 java.lang.String .valueOf ( p0 );
					 java.lang.String .valueOf ( p0 );
					 v0 = 					 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
					 /* add-int/lit8 v0, v0, 0xd */
					 /* new-instance v1, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
					 final String v0 = "Invalid TTL: "; // const-string v0, "Invalid TTL: "
					 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
					 android.util.Log .w ( v0,p0 );
				 } // :cond_1
				 int p0 = 0; // const/4 p0, 0x0
			 } // .end method
			 public static java.lang.String m ( android.content.Intent p0 ) {
				 /* .locals 2 */
				 final String v0 = "google.c.a.udt"; // const-string v0, "google.c.a.udt"
				 /* .line 1 */
				 v1 = 				 (( android.content.Intent ) p0 ).hasExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 2 */
					 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
				 } // :cond_0
				 int p0 = 0; // const/4 p0, 0x0
			 } // .end method
			 public static Boolean n ( android.content.Intent p0 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 (( android.content.Intent ) p0 ).getAction ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
				 final String v0 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"; // const-string v0, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
				 p0 = 				 (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 } // .end method
			 public static void o ( android.content.Intent p0 ) {
				 /* .locals 1 */
				 final String v0 = "_nd"; // const-string v0, "_nd"
				 /* .line 1 */
				 e.f.c.u.z .a ( v0,p0 );
				 return;
			 } // .end method
			 public static void p ( android.content.Intent p0 ) {
				 /* .locals 1 */
				 final String v0 = "_nf"; // const-string v0, "_nf"
				 /* .line 1 */
				 e.f.c.u.z .a ( v0,p0 );
				 return;
			 } // .end method
			 public static void q ( android.content.Intent p0 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 e.f.c.u.z .s ( p0 );
				 final String v0 = "_no"; // const-string v0, "_no"
				 /* .line 2 */
				 e.f.c.u.z .a ( v0,p0 );
				 return;
			 } // .end method
			 public static void r ( android.content.Intent p0 ) {
				 /* .locals 5 */
				 /* .line 1 */
				 v0 = 				 e.f.c.u.z .u ( p0 );
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 final String v0 = "_nr"; // const-string v0, "_nr"
					 /* .line 2 */
					 e.f.c.u.z .a ( v0,p0 );
					 /* .line 3 */
				 } // :cond_0
				 v0 = 				 e.f.c.u.z .t ( p0 );
				 if ( v0 != null) { // if-eqz v0, :cond_2
					 /* .line 4 */
					 com.google.firebase.messaging.FirebaseMessaging .d ( );
					 if ( v0 != null) { // if-eqz v0, :cond_1
						 /* .line 5 */
						 /* const-class v1, Ljava/lang/String; */
						 final String v2 = "json"; // const-string v2, "json"
						 /* .line 6 */
						 e.f.a.a.b .a ( v2 );
						 v3 = e.f.c.u.y.a;
						 final String v4 = "FCM_CLIENT_EVENT_LOGGING"; // const-string v4, "FCM_CLIENT_EVENT_LOGGING"
						 /* .line 7 */
						 final String v1 = "MESSAGE_DELIVERED"; // const-string v1, "MESSAGE_DELIVERED"
						 /* .line 8 */
						 e.f.c.u.z .a ( v1,p0,v0 );
						 return;
					 } // :cond_1
					 final String p0 = "FirebaseMessaging"; // const-string p0, "FirebaseMessaging"
					 final String v0 = "TransportFactory is null.Skip exporting message delivery metrics to Big Query"; // const-string v0, "TransportFactory is null.Skip exporting message delivery metrics to Big Query"
					 /* .line 9 */
					 android.util.Log .e ( p0,v0 );
				 } // :cond_2
				 return;
			 } // .end method
			 public static void s ( android.content.Intent p0 ) {
				 /* .locals 5 */
				 /* if-nez p0, :cond_0 */
				 return;
			 } // :cond_0
			 final String v0 = "google.c.a.tc"; // const-string v0, "google.c.a.tc"
			 /* .line 1 */
			 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 final String v1 = "1"; // const-string v1, "1"
			 /* .line 2 */
			 v0 = 			 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 int v1 = 3; // const/4 v1, 0x3
			 final String v2 = "FirebaseMessaging"; // const-string v2, "FirebaseMessaging"
			 if ( v0 != null) { // if-eqz v0, :cond_3
				 /* .line 3 */
				 e.f.c.h .j ( );
				 /* const-class v3, Le/f/c/j/a/c; */
				 (( e.f.c.h ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Le/f/c/h;->a(Ljava/lang/Class;)Ljava/lang/Object;
				 /* check-cast v0, Le/f/c/j/a/c; */
				 /* .line 4 */
				 v1 = 				 android.util.Log .isLoggable ( v2,v1 );
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 final String v1 = "Received event with track-conversion=true.Setting user property and reengagement event"; // const-string v1, "Received event with track-conversion=true.Setting user property and reengagement event"
					 /* .line 5 */
					 android.util.Log .d ( v2,v1 );
				 } // :cond_1
				 if ( v0 != null) { // if-eqz v0, :cond_2
					 final String v1 = "google.c.a.c_id"; // const-string v1, "google.c.a.c_id"
					 /* .line 6 */
					 (( android.content.Intent ) p0 ).getStringExtra ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
					 final String v1 = "fcm"; // const-string v1, "fcm"
					 final String v2 = "_ln"; // const-string v2, "_ln"
					 /* .line 7 */
					 /* .line 8 */
					 /* new-instance v2, Landroid/os/Bundle; */
					 /* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
					 final String v3 = "source"; // const-string v3, "source"
					 final String v4 = "Firebase"; // const-string v4, "Firebase"
					 /* .line 9 */
					 (( android.os.Bundle ) v2 ).putString ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
					 final String v3 = "medium"; // const-string v3, "medium"
					 final String v4 = "notification"; // const-string v4, "notification"
					 /* .line 10 */
					 (( android.os.Bundle ) v2 ).putString ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
					 final String v3 = "campaign"; // const-string v3, "campaign"
					 /* .line 11 */
					 (( android.os.Bundle ) v2 ).putString ( v3, p0 ); // invoke-virtual {v2, v3, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
					 final String p0 = "_cmp"; // const-string p0, "_cmp"
					 /* .line 12 */
					 return;
				 } // :cond_2
				 final String p0 = "Unable to set user property for conversion tracking: analytics library is missing"; // const-string p0, "Unable to set user property for conversion tracking: analytics library is missing"
				 /* .line 13 */
				 android.util.Log .w ( v2,p0 );
				 return;
				 /* .line 14 */
			 } // :cond_3
			 p0 = 			 android.util.Log .isLoggable ( v2,v1 );
			 if ( p0 != null) { // if-eqz p0, :cond_4
				 final String p0 = "Received event with track-conversion=false.Do not set user property"; // const-string p0, "Received event with track-conversion=false.Do not set user property"
				 /* .line 15 */
				 android.util.Log .d ( v2,p0 );
			 } // :cond_4
			 return;
		 } // .end method
		 public static Boolean t ( android.content.Intent p0 ) {
			 /* .locals 0 */
			 if ( p0 != null) { // if-eqz p0, :cond_1
				 /* .line 1 */
				 p0 = 				 e.f.c.u.z .n ( p0 );
				 if ( p0 != null) { // if-eqz p0, :cond_0
					 /* .line 2 */
				 } // :cond_0
				 p0 = 				 e.f.c.u.z .a ( );
			 } // :cond_1
		 } // :goto_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // .end method
	 public static Boolean u ( android.content.Intent p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 /* .line 1 */
			 v0 = 			 e.f.c.u.z .n ( p0 );
			 if ( v0 != null) { // if-eqz v0, :cond_0
			 } // :cond_0
			 final String v0 = "google.c.a.e"; // const-string v0, "google.c.a.e"
			 /* .line 2 */
			 (( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 final String v0 = "1"; // const-string v0, "1"
			 p0 = 			 (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 } // :cond_1
	 } // :goto_0
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
