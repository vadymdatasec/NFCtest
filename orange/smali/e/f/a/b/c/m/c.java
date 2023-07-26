public abstract class e.f.a.b.c.m.c {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c.e.i a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/i<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.a.b.c.m.c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
return;
} // .end method
public static java.lang.String a ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 6 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 7 */
try { // :try_start_0
	 e.f.a.b.c.q.b .b ( p0 );
	 (( e.f.a.b.c.q.a ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/a/b/c/q/a;->a(Ljava/lang/String;)Ljava/lang/CharSequence;
	 /* :try_end_0 */
	 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* nop */
	 /* .line 8 */
	 (( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
	 p0 = this.name;
	 /* .line 9 */
	 v1 = 	 android.text.TextUtils .isEmpty ( p0 );
	 if ( v1 != null) { // if-eqz v1, :cond_0
	 } // :cond_0
} // .end method
public static java.lang.String a ( android.content.Context p0, Integer p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-eq p1, v0, :cond_2 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* if-eq p1, v0, :cond_1 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* if-eq p1, v0, :cond_0 */
	 /* const p1, 0x104000a */
	 /* .line 2 */
	 (( android.content.res.Resources ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 /* .line 3 */
} // :cond_0
(( android.content.res.Resources ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 4 */
} // :cond_1
(( android.content.res.Resources ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 5 */
} // :cond_2
(( android.content.res.Resources ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // .end method
public static java.lang.String a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 4 */
/* .line 15 */
v0 = e.f.a.b.c.m.c.a;
/* monitor-enter v0 */
/* .line 16 */
try { // :try_start_0
v1 = e.f.a.b.c.m.c.a;
(( c.e.i ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 17 */
/* monitor-exit v0 */
/* .line 18 */
} // :cond_0
e.f.a.b.c.g .a ( p0 );
int v1 = 0; // const/4 v1, 0x0
/* if-nez p0, :cond_1 */
/* .line 19 */
/* monitor-exit v0 */
} // :cond_1
final String v2 = "string"; // const-string v2, "string"
final String v3 = "com.google.android.gms"; // const-string v3, "com.google.android.gms"
/* .line 20 */
v2 = (( android.content.res.Resources ) p0 ).getIdentifier ( p1, v2, v3 ); // invoke-virtual {p0, p1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* if-nez v2, :cond_3 */
final String p0 = "GoogleApiAvailability"; // const-string p0, "GoogleApiAvailability"
final String v2 = "Missing resource: "; // const-string v2, "Missing resource: "
/* .line 21 */
java.lang.String .valueOf ( p1 );
v3 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( v3 != null) { // if-eqz v3, :cond_2
(( java.lang.String ) v2 ).concat ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_2
/* new-instance p1, Ljava/lang/String; */
/* invoke-direct {p1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
android.util.Log .w ( p0,p1 );
/* .line 22 */
/* monitor-exit v0 */
/* .line 23 */
} // :cond_3
(( android.content.res.Resources ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 24 */
v2 = android.text.TextUtils .isEmpty ( p0 );
if ( v2 != null) { // if-eqz v2, :cond_5
final String p0 = "GoogleApiAvailability"; // const-string p0, "GoogleApiAvailability"
final String v2 = "Got empty resource: "; // const-string v2, "Got empty resource: "
/* .line 25 */
java.lang.String .valueOf ( p1 );
v3 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( v3 != null) { // if-eqz v3, :cond_4
(( java.lang.String ) v2 ).concat ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_4
/* new-instance p1, Ljava/lang/String; */
/* invoke-direct {p1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_1
android.util.Log .w ( p0,p1 );
/* .line 26 */
/* monitor-exit v0 */
/* .line 27 */
} // :cond_5
v1 = e.f.a.b.c.m.c.a;
(( c.e.i ) v1 ).put ( p1, p0 ); // invoke-virtual {v1, p1, p0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 28 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 29 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static java.lang.String a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 10 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 11 */
e.f.a.b.c.m.c .a ( p0,p1 );
/* if-nez p0, :cond_0 */
/* .line 12 */
/* .line 13 */
(( android.content.res.Resources ) v0 ).getString ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 14 */
} // :cond_0
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
p1 = this.locale;
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p2, v0, v1 */
java.lang.String .format ( p1,p0,v0 );
} // .end method
public static java.lang.String b ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 16 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 17 */
(( android.content.res.Resources ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // .end method
public static java.lang.String b ( android.content.Context p0, Integer p1 ) {
/* .locals 5 */
/* .line 1 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2 */
e.f.a.b.c.m.c .a ( p0 );
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-eq p1, v3, :cond_7 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq p1, v4, :cond_5 */
int v4 = 3; // const/4 v4, 0x3
/* if-eq p1, v4, :cond_4 */
int v4 = 5; // const/4 v4, 0x5
/* if-eq p1, v4, :cond_3 */
int v4 = 7; // const/4 v4, 0x7
/* if-eq p1, v4, :cond_2 */
/* const/16 v4, 0x9 */
/* if-eq p1, v4, :cond_1 */
/* const/16 v4, 0x14 */
/* if-eq p1, v4, :cond_0 */
/* packed-switch p1, :pswitch_data_0 */
/* .line 3 */
/* new-array p1, v3, [Ljava/lang/Object; */
/* aput-object v1, p1, v2 */
(( android.content.res.Resources ) v0 ).getString ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/* .line 4 */
/* :pswitch_0 */
/* new-array p1, v3, [Ljava/lang/Object; */
/* aput-object v1, p1, v2 */
(( android.content.res.Resources ) v0 ).getString ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/* :pswitch_1 */
final String p1 = "common_google_play_services_sign_in_failed_text"; // const-string p1, "common_google_play_services_sign_in_failed_text"
/* .line 5 */
e.f.a.b.c.m.c .a ( p0,p1,v1 );
/* :pswitch_2 */
final String p1 = "common_google_play_services_api_unavailable_text"; // const-string p1, "common_google_play_services_api_unavailable_text"
/* .line 6 */
e.f.a.b.c.m.c .a ( p0,p1,v1 );
} // :cond_0
final String p1 = "common_google_play_services_restricted_profile_text"; // const-string p1, "common_google_play_services_restricted_profile_text"
/* .line 7 */
e.f.a.b.c.m.c .a ( p0,p1,v1 );
/* .line 8 */
} // :cond_1
/* new-array p1, v3, [Ljava/lang/Object; */
/* aput-object v1, p1, v2 */
(( android.content.res.Resources ) v0 ).getString ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
} // :cond_2
final String p1 = "common_google_play_services_network_error_text"; // const-string p1, "common_google_play_services_network_error_text"
/* .line 9 */
e.f.a.b.c.m.c .a ( p0,p1,v1 );
} // :cond_3
final String p1 = "common_google_play_services_invalid_account_text"; // const-string p1, "common_google_play_services_invalid_account_text"
/* .line 10 */
e.f.a.b.c.m.c .a ( p0,p1,v1 );
/* .line 11 */
} // :cond_4
/* new-array p1, v3, [Ljava/lang/Object; */
/* aput-object v1, p1, v2 */
(( android.content.res.Resources ) v0 ).getString ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/* .line 12 */
} // :cond_5
p0 = e.f.a.b.c.p.e .c ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_6
/* .line 13 */
(( android.content.res.Resources ) v0 ).getString ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 14 */
} // :cond_6
/* new-array p1, v3, [Ljava/lang/Object; */
/* aput-object v1, p1, v2 */
(( android.content.res.Resources ) v0 ).getString ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/* .line 15 */
} // :cond_7
/* new-array p1, v3, [Ljava/lang/Object; */
/* aput-object v1, p1, v2 */
(( android.content.res.Resources ) v0 ).getString ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x10 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static java.lang.String c ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
int v0 = 6; // const/4 v0, 0x6
/* if-ne p1, v0, :cond_0 */
/* .line 1 */
e.f.a.b.c.m.c .a ( p0 );
final String v0 = "common_google_play_services_resolution_required_text"; // const-string v0, "common_google_play_services_resolution_required_text"
/* .line 2 */
e.f.a.b.c.m.c .a ( p0,v0,p1 );
/* .line 3 */
} // :cond_0
e.f.a.b.c.m.c .b ( p0,p1 );
} // .end method
public static java.lang.String d ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
int v0 = 6; // const/4 v0, 0x6
/* if-ne p1, v0, :cond_0 */
final String p1 = "common_google_play_services_resolution_required_title"; // const-string p1, "common_google_play_services_resolution_required_title"
/* .line 1 */
e.f.a.b.c.m.c .a ( p0,p1 );
/* .line 2 */
} // :cond_0
e.f.a.b.c.m.c .e ( p0,p1 );
} // :goto_0
/* if-nez p1, :cond_1 */
/* .line 3 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 4 */
(( android.content.res.Resources ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // :cond_1
} // .end method
public static java.lang.String e ( android.content.Context p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
int v1 = 0; // const/4 v1, 0x0
final String v2 = "GoogleApiAvailability"; // const-string v2, "GoogleApiAvailability"
/* packed-switch p1, :pswitch_data_0 */
/* :pswitch_0 */
/* const/16 p0, 0x21 */
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p0 = "Unexpected error code "; // const-string p0, "Unexpected error code "
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,p0 );
/* :pswitch_1 */
final String p1 = "The current user profile is restricted and could not use authenticated features."; // const-string p1, "The current user profile is restricted and could not use authenticated features."
/* .line 3 */
android.util.Log .e ( v2,p1 );
final String p1 = "common_google_play_services_restricted_profile_title"; // const-string p1, "common_google_play_services_restricted_profile_title"
/* .line 4 */
e.f.a.b.c.m.c .a ( p0,p1 );
/* :pswitch_2 */
final String p1 = "The specified account could not be signed in."; // const-string p1, "The specified account could not be signed in."
/* .line 5 */
android.util.Log .e ( v2,p1 );
final String p1 = "common_google_play_services_sign_in_failed_title"; // const-string p1, "common_google_play_services_sign_in_failed_title"
/* .line 6 */
e.f.a.b.c.m.c .a ( p0,p1 );
/* :pswitch_3 */
final String p0 = "One of the API components you attempted to connect to is not available."; // const-string p0, "One of the API components you attempted to connect to is not available."
/* .line 7 */
android.util.Log .e ( v2,p0 );
/* :pswitch_4 */
final String p0 = "The application is not licensed to the user."; // const-string p0, "The application is not licensed to the user."
/* .line 8 */
android.util.Log .e ( v2,p0 );
/* :pswitch_5 */
final String p0 = "Developer error occurred.Please see logs for detailed information"; // const-string p0, "Developer error occurred.Please see logs for detailed information"
/* .line 9 */
android.util.Log .e ( v2,p0 );
/* :pswitch_6 */
final String p0 = "Google Play services is invalid.Cannot recover."; // const-string p0, "Google Play services is invalid.Cannot recover."
/* .line 10 */
android.util.Log .e ( v2,p0 );
/* :pswitch_7 */
final String p0 = "Internal error occurred.Please see logs for detailed information"; // const-string p0, "Internal error occurred.Please see logs for detailed information"
/* .line 11 */
android.util.Log .e ( v2,p0 );
/* :pswitch_8 */
final String p1 = "Network error occurred.Please retry request later."; // const-string p1, "Network error occurred.Please retry request later."
/* .line 12 */
android.util.Log .e ( v2,p1 );
final String p1 = "common_google_play_services_network_error_title"; // const-string p1, "common_google_play_services_network_error_title"
/* .line 13 */
e.f.a.b.c.m.c .a ( p0,p1 );
/* :pswitch_9 */
final String p1 = "An invalid account was specified when connecting.Please provide a valid account."; // const-string p1, "An invalid account was specified when connecting.Please provide a valid account."
/* .line 14 */
android.util.Log .e ( v2,p1 );
final String p1 = "common_google_play_services_invalid_account_title"; // const-string p1, "common_google_play_services_invalid_account_title"
/* .line 15 */
e.f.a.b.c.m.c .a ( p0,p1 );
/* :pswitch_a */
/* .line 16 */
/* :pswitch_b */
(( android.content.res.Resources ) v0 ).getString ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 17 */
/* :pswitch_c */
(( android.content.res.Resources ) v0 ).getString ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 18 */
/* :pswitch_d */
(( android.content.res.Resources ) v0 ).getString ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_d */
/* :pswitch_c */
/* :pswitch_b */
/* :pswitch_a */
/* :pswitch_9 */
/* :pswitch_a */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_a */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
