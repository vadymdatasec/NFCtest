public class e.f.c.u.k0 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.Object g;
	 public static java.lang.Boolean h;
	 public static java.lang.Boolean i;
	 /* # instance fields */
	 public final android.content.Context b;
	 public final e.f.c.q.r c;
	 public final android.os.PowerManager$WakeLock d;
	 public final e.f.c.u.i0 e;
	 public final Long f;
	 /* # direct methods */
	 public static e.f.c.u.k0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public e.f.c.u.k0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.e = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 /* iput-wide p4, p0, Le/f/c/u/k0;->f:J */
		 /* .line 5 */
		 this.c = p3;
		 final String p1 = "power"; // const-string p1, "power"
		 /* .line 6 */
		 (( android.content.Context ) p2 ).getSystemService ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p1, Landroid/os/PowerManager; */
		 int p2 = 1; // const/4 p2, 0x1
		 final String p3 = "wake:com.google.firebase.messaging"; // const-string p3, "wake:com.google.firebase.messaging"
		 /* .line 7 */
		 (( android.os.PowerManager ) p1 ).newWakeLock ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
		 this.d = p1;
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 16 */
		 java.lang.String .valueOf ( p0 );
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* add-int/lit16 v0, v0, 0x8e */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v0 = "Missing Permission: "; // const-string v0, "Missing Permission: "
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String p0 = ".This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"; // const-string p0, ".This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* .line 5 */
		 v0 = e.f.c.u.k0.g;
		 /* monitor-enter v0 */
		 /* .line 6 */
		 try { // :try_start_0
			 v1 = e.f.c.u.k0.i;
			 /* if-nez v1, :cond_0 */
			 final String v1 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v1, "android.permission.ACCESS_NETWORK_STATE"
			 /* .line 7 */
			 v2 = e.f.c.u.k0.i;
			 p0 = 			 e.f.c.u.k0 .a ( p0,v1,v2 );
			 /* .line 8 */
		 } // :cond_0
		 p0 = e.f.c.u.k0.i;
		 p0 = 		 (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
		 /* .line 9 */
	 } // :goto_0
	 java.lang.Boolean .valueOf ( p0 );
	 /* .line 10 */
	 p0 = 	 (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
	 /* monitor-exit v0 */
	 /* :catchall_0 */
	 /* move-exception p0 */
	 /* .line 11 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw p0 */
} // .end method
public static Boolean a ( android.content.Context p0, java.lang.String p1, java.lang.Boolean p2 ) {
	 /* .locals 1 */
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 12 */
		 p0 = 		 (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
		 /* .line 13 */
	 } // :cond_0
	 p0 = 	 (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
	 /* if-nez p0, :cond_1 */
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
/* if-nez p0, :cond_2 */
int p2 = 3; // const/4 p2, 0x3
final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
/* .line 14 */
p2 = android.util.Log .isLoggable ( v0,p2 );
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 15 */
e.f.c.u.k0 .a ( p1 );
android.util.Log .d ( v0,p1 );
} // :cond_2
} // .end method
public static Boolean a ( e.f.c.u.k0 p0 ) { //synthethic
/* .locals 0 */
/* .line 17 */
p0 = (( e.f.c.u.k0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/u/k0;->a()Z
} // .end method
public static e.f.c.u.i0 b ( e.f.c.u.k0 p0 ) { //synthethic
/* .locals 0 */
/* .line 9 */
p0 = this.e;
} // .end method
public static Boolean b ( ) { //synthethic
/* .locals 1 */
/* .line 8 */
v0 = e.f.c.u.k0 .c ( );
} // .end method
public static Boolean b ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.c.u.k0.g;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = e.f.c.u.k0.h;
/* if-nez v1, :cond_0 */
final String v1 = "android.permission.WAKE_LOCK"; // const-string v1, "android.permission.WAKE_LOCK"
/* .line 3 */
v2 = e.f.c.u.k0.h;
p0 = e.f.c.u.k0 .a ( p0,v1,v2 );
/* .line 4 */
} // :cond_0
p0 = e.f.c.u.k0.h;
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 5 */
} // :goto_0
java.lang.Boolean .valueOf ( p0 );
/* .line 6 */
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 7 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static android.content.Context c ( e.f.c.u.k0 p0 ) { //synthethic
/* .locals 0 */
/* .line 3 */
p0 = this.b;
} // .end method
public static Boolean c ( ) {
/* .locals 4 */
int v0 = 3; // const/4 v0, 0x3
final String v1 = "FirebaseMessaging"; // const-string v1, "FirebaseMessaging"
/* .line 1 */
v2 = android.util.Log .isLoggable ( v1,v0 );
/* if-nez v2, :cond_1 */
/* const/16 v3, 0x17 */
/* if-ne v2, v3, :cond_0 */
/* .line 2 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
/* # virtual methods */
public synchronized final Boolean a ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
final String v1 = "connectivity"; // const-string v1, "connectivity"
/* .line 2 */
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/ConnectivityManager; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* monitor-exit p0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void run ( ) {
/* .locals 6 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "Wakelock" */
/* } */
} // .end annotation
final String v0 = "TopicsSyncTask\'s wakelock was already released due to timeout."; // const-string v0, "TopicsSyncTask\'s wakelock was already released due to timeout."
final String v1 = "FirebaseMessaging"; // const-string v1, "FirebaseMessaging"
/* .line 1 */
v2 = this.b;
v2 = e.f.c.u.k0 .b ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 2 */
v2 = this.d;
/* sget-wide v3, Le/f/c/u/c;->a:J */
(( android.os.PowerManager$WakeLock ) v2 ).acquire ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
try { // :try_start_0
v3 = this.e;
int v4 = 1; // const/4 v4, 0x1
(( e.f.c.u.i0 ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/u/i0;->a(Z)V
/* .line 4 */
v3 = this.c;
v3 = (( e.f.c.q.r ) v3 ).e ( ); // invoke-virtual {v3}, Le/f/c/q/r;->e()Z
/* if-nez v3, :cond_2 */
/* .line 5 */
v3 = this.e;
(( e.f.c.u.i0 ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Le/f/c/u/i0;->a(Z)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
v2 = this.b;
v2 = e.f.c.u.k0 .b ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
try { // :try_start_1
v2 = this.d;
(( android.os.PowerManager$WakeLock ) v2 ).release ( ); // invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V
/* :try_end_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
return;
/* .line 8 */
/* :catch_0 */
android.util.Log .i ( v1,v0 );
} // :cond_1
return;
/* .line 9 */
} // :cond_2
try { // :try_start_2
v3 = this.b;
v3 = e.f.c.u.k0 .a ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 10 */
v3 = (( e.f.c.u.k0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/u/k0;->a()Z
/* if-nez v3, :cond_4 */
/* .line 11 */
/* new-instance v3, Le/f/c/u/j0; */
/* invoke-direct {v3, p0, p0}, Le/f/c/u/j0;-><init>(Le/f/c/u/k0;Le/f/c/u/k0;)V */
/* .line 12 */
(( e.f.c.u.j0 ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/c/u/j0;->a()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_3 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 13 */
v2 = this.b;
v2 = e.f.c.u.k0 .b ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 14 */
try { // :try_start_3
v2 = this.d;
(( android.os.PowerManager$WakeLock ) v2 ).release ( ); // invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V
/* :try_end_3 */
/* .catch Ljava/lang/RuntimeException; {:try_start_3 ..:try_end_3} :catch_1 */
return;
/* .line 15 */
/* :catch_1 */
android.util.Log .i ( v1,v0 );
} // :cond_3
return;
/* .line 16 */
} // :cond_4
try { // :try_start_4
v3 = this.e;
v3 = (( e.f.c.u.i0 ) v3 ).e ( ); // invoke-virtual {v3}, Le/f/c/u/i0;->e()Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 17 */
v3 = this.e;
(( e.f.c.u.i0 ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Le/f/c/u/i0;->a(Z)V
/* .line 18 */
} // :cond_5
v3 = this.e;
/* iget-wide v4, p0, Le/f/c/u/k0;->f:J */
(( e.f.c.u.i0 ) v3 ).a ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Le/f/c/u/i0;->a(J)V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_3 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 19 */
} // :goto_0
v2 = this.b;
v2 = e.f.c.u.k0 .b ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 20 */
try { // :try_start_5
v2 = this.d;
(( android.os.PowerManager$WakeLock ) v2 ).release ( ); // invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V
/* :try_end_5 */
/* .catch Ljava/lang/RuntimeException; {:try_start_5 ..:try_end_5} :catch_2 */
return;
/* .line 21 */
/* :catch_2 */
android.util.Log .i ( v1,v0 );
return;
/* :catchall_0 */
/* move-exception v2 */
/* :catch_3 */
/* move-exception v3 */
try { // :try_start_6
	 final String v4 = "Failed to sync topics.Won\'t retry sync."; // const-string v4, "Failed to sync topics.Won\'t retry sync."
	 /* .line 22 */
	 (( java.io.IOException ) v3 ).getMessage ( ); // invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
	 java.lang.String .valueOf ( v3 );
	 v5 = 	 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
	 if ( v5 != null) { // if-eqz v5, :cond_6
		 (( java.lang.String ) v4 ).concat ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
	 } // :cond_6
	 /* new-instance v3, Ljava/lang/String; */
	 /* invoke-direct {v3, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_1
android.util.Log .e ( v1,v3 );
/* .line 23 */
v3 = this.e;
(( e.f.c.u.i0 ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Le/f/c/u/i0;->a(Z)V
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* .line 24 */
v2 = this.b;
v2 = e.f.c.u.k0 .b ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_7
	 /* .line 25 */
	 try { // :try_start_7
		 v2 = this.d;
		 (( android.os.PowerManager$WakeLock ) v2 ).release ( ); // invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V
		 /* :try_end_7 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_7 ..:try_end_7} :catch_4 */
		 return;
		 /* .line 26 */
		 /* :catch_4 */
		 android.util.Log .i ( v1,v0 );
	 } // :cond_7
	 return;
	 /* .line 27 */
} // :goto_2
v3 = this.b;
v3 = e.f.c.u.k0 .b ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_8
	 /* .line 28 */
	 try { // :try_start_8
		 v3 = this.d;
		 (( android.os.PowerManager$WakeLock ) v3 ).release ( ); // invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V
		 /* :try_end_8 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_8 ..:try_end_8} :catch_5 */
		 /* .line 29 */
		 /* :catch_5 */
		 android.util.Log .i ( v1,v0 );
		 /* .line 30 */
	 } // :cond_8
} // :goto_3
/* throw v2 */
} // .end method
