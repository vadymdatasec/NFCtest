public class e.f.c.q.w {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.c.q.w e;
	 /* # instance fields */
	 public java.lang.String a;
	 public java.lang.Boolean b;
	 public java.lang.Boolean c;
	 public final java.util.Queue d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Queue<", */
	 /* "Landroid/content/Intent;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.q.w ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
/* .line 3 */
this.b = v0;
/* .line 4 */
this.c = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/ArrayDeque; */
/* invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V */
this.d = v0;
return;
} // .end method
public static synchronized e.f.c.q.w b ( ) {
/* .locals 2 */
/* const-class v0, Le/f/c/q/w; */
/* monitor-enter v0 */
/* .line 1 */
try { // :try_start_0
	 v1 = e.f.c.q.w.e;
	 /* if-nez v1, :cond_0 */
	 /* .line 2 */
	 /* new-instance v1, Le/f/c/q/w; */
	 /* invoke-direct {v1}, Le/f/c/q/w;-><init>()V */
	 /* .line 3 */
} // :cond_0
v1 = e.f.c.q.w.e;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* throw v1 */
} // .end method
/* # virtual methods */
public final Integer a ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 5 */
/* .line 2 */
(( e.f.c.q.w ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/q/w;->b(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;
final String v1 = "FirebaseInstanceId"; // const-string v1, "FirebaseInstanceId"
if ( v0 != null) { // if-eqz v0, :cond_2
	 int v2 = 3; // const/4 v2, 0x3
	 /* .line 3 */
	 v2 = 	 android.util.Log .isLoggable ( v1,v2 );
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 final String v2 = "Restricting intent to a specific service: "; // const-string v2, "Restricting intent to a specific service: "
		 /* .line 4 */
		 java.lang.String .valueOf ( v0 );
		 v4 = 		 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 (( java.lang.String ) v2 ).concat ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 } // :cond_0
		 /* new-instance v3, Ljava/lang/String; */
		 /* invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
		 /* move-object v2, v3 */
	 } // :goto_0
	 android.util.Log .d ( v1,v2 );
	 /* .line 5 */
} // :cond_1
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( android.content.Intent ) p2 ).setClassName ( v2, v0 ); // invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 6 */
} // :cond_2
try { // :try_start_0
v0 = (( e.f.c.q.w ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 7 */
	 e.f.c.q.a0 .a ( p1,p2 );
	 /* .line 8 */
} // :cond_3
(( android.content.Context ) p1 ).startService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
final String p2 = "Missing wake lock permission, service start may be delayed"; // const-string p2, "Missing wake lock permission, service start may be delayed"
/* .line 9 */
android.util.Log .d ( v1,p2 );
} // :goto_1
/* if-nez p1, :cond_4 */
final String p1 = "Error while delivering the message: ServiceIntent not found."; // const-string p1, "Error while delivering the message: ServiceIntent not found."
/* .line 10 */
android.util.Log .e ( v1,p1 );
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* const/16 p1, 0x194 */
} // :cond_4
int p1 = -1; // const/4 p1, -0x1
/* :catch_0 */
/* move-exception p1 */
/* .line 11 */
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( p1 );
p2 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* add-int/lit8 p2, p2, 0x2d */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p2 = "Failed to start service while in background: "; // const-string p2, "Failed to start service while in background: "
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,p1 );
/* const/16 p1, 0x192 */
/* :catch_1 */
/* move-exception p1 */
final String p2 = "Error while delivering the message to the serviceIntent"; // const-string p2, "Error while delivering the message to the serviceIntent"
/* .line 12 */
android.util.Log .e ( v1,p2,p1 );
/* const/16 p1, 0x191 */
} // .end method
public android.content.Intent a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* check-cast v0, Landroid/content/Intent; */
} // .end method
public Boolean a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 13 */
v0 = this.c;
/* if-nez v0, :cond_1 */
final String v0 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v0, "android.permission.ACCESS_NETWORK_STATE"
/* .line 14 */
p1 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
java.lang.Boolean .valueOf ( p1 );
this.c = p1;
/* .line 15 */
} // :cond_1
p1 = this.b;
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p1, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
/* .line 16 */
p1 = android.util.Log .isLoggable ( v0,p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
final String p1 = "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"; // const-string p1, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
/* .line 17 */
android.util.Log .d ( v0,p1 );
/* .line 18 */
} // :cond_2
p1 = this.c;
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
public synchronized final java.lang.String b ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 4 */
/* monitor-enter p0 */
/* .line 4 */
try { // :try_start_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
p1 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* .line 6 */
} // :cond_0
try { // :try_start_1
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v1 = 0; // const/4 v1, 0x0
(( android.content.pm.PackageManager ) v0 ).resolveService ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
int v0 = 0; // const/4 v0, 0x0
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 7 */
v1 = this.serviceInfo;
/* if-nez v1, :cond_1 */
/* goto/16 :goto_3 */
/* .line 8 */
} // :cond_1
p2 = this.serviceInfo;
/* .line 9 */
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v2 = this.packageName;
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
v1 = this.name;
/* if-nez v1, :cond_2 */
/* .line 10 */
} // :cond_2
v0 = this.name;
final String v1 = "."; // const-string v1, "."
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 11 */
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
java.lang.String .valueOf ( p1 );
p2 = this.name;
java.lang.String .valueOf ( p2 );
v0 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_3
(( java.lang.String ) p1 ).concat ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_3
/* new-instance p2, Ljava/lang/String; */
/* invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, p2 */
} // :goto_0
this.a = p1;
/* .line 12 */
} // :cond_4
p1 = this.name;
this.a = p1;
/* .line 13 */
} // :goto_1
p1 = this.a;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
} // :cond_5
} // :goto_2
try { // :try_start_2
final String p1 = "FirebaseInstanceId"; // const-string p1, "FirebaseInstanceId"
/* .line 14 */
v1 = this.packageName;
p2 = this.name;
java.lang.String .valueOf ( v1 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x5e */
java.lang.String .valueOf ( p2 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/2addr v2, v3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "Error resolving target intent service, skipping classname enforcement.Resolved service was: "; // const-string v2, "Error resolving target intent service, skipping classname enforcement.Resolved service was: "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/"; // const-string v1, "/"
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( p1,p2 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 15 */
/* monitor-exit p0 */
} // :cond_6
} // :goto_3
try { // :try_start_3
final String p1 = "FirebaseInstanceId"; // const-string p1, "FirebaseInstanceId"
final String p2 = "Failed to resolve target intent service, skipping classname enforcement"; // const-string p2, "Failed to resolve target intent service, skipping classname enforcement"
/* .line 16 */
android.util.Log .e ( p1,p2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 17 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public Boolean b ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 18 */
v0 = this.b;
/* if-nez v0, :cond_1 */
final String v0 = "android.permission.WAKE_LOCK"; // const-string v0, "android.permission.WAKE_LOCK"
/* .line 19 */
p1 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
java.lang.Boolean .valueOf ( p1 );
this.b = p1;
/* .line 20 */
} // :cond_1
p1 = this.b;
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p1, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
/* .line 21 */
p1 = android.util.Log .isLoggable ( v0,p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
final String p1 = "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest"; // const-string p1, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
/* .line 22 */
android.util.Log .d ( v0,p1 );
/* .line 23 */
} // :cond_2
p1 = this.b;
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
public Integer c ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "Starting service"; // const-string v1, "Starting service"
/* .line 2 */
android.util.Log .d ( v0,v1 );
/* .line 3 */
} // :cond_0
v0 = this.d;
/* .line 4 */
/* new-instance p2, Landroid/content/Intent; */
final String v0 = "com.google.firebase.MESSAGING_EVENT"; // const-string v0, "com.google.firebase.MESSAGING_EVENT"
/* invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 5 */
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( android.content.Intent ) p2 ).setPackage ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 6 */
p1 = (( e.f.c.q.w ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/q/w;->a(Landroid/content/Context;Landroid/content/Intent;)I
} // .end method
