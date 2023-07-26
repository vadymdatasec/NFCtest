public class e.f.c.q.z implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Long b;
	 public final android.os.PowerManager$WakeLock c;
	 public final com.google.firebase.iid.FirebaseInstanceId d;
	 public java.util.concurrent.ExecutorService e;
	 /* # direct methods */
	 public e.f.c.q.z ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 e.f.c.q.h .b ( );
		 this.e = v0;
		 /* .line 3 */
		 this.d = p1;
		 /* .line 4 */
		 /* iput-wide p2, p0, Le/f/c/q/z;->b:J */
		 /* .line 5 */
		 (( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
		 final String p2 = "power"; // const-string p2, "power"
		 (( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p1, Landroid/os/PowerManager; */
		 int p2 = 1; // const/4 p2, 0x1
		 final String p3 = "fiid-sync"; // const-string p3, "fiid-sync"
		 /* .line 6 */
		 (( android.os.PowerManager ) p1 ).newWakeLock ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
		 this.c = p1;
		 int p2 = 0; // const/4 p2, 0x0
		 /* .line 7 */
		 (( android.os.PowerManager$WakeLock ) p1 ).setReferenceCounted ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V
		 return;
	 } // .end method
	 public static com.google.firebase.iid.FirebaseInstanceId a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 8 */
		 p0 = this.d;
	 } // .end method
	 /* # virtual methods */
	 public android.content.Context a ( ) {
		 /* .locals 1 */
		 /* .line 7 */
		 v0 = this.d;
		 (( com.google.firebase.iid.FirebaseInstanceId ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->b()Le/f/c/h;
		 (( e.f.c.h ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/h;->b()Landroid/content/Context;
	 } // .end method
	 public final void a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.d;
		 (( com.google.firebase.iid.FirebaseInstanceId ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->b()Le/f/c/h;
		 (( e.f.c.h ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;
		 final String v1 = "[DEFAULT]"; // const-string v1, "[DEFAULT]"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 int v0 = 3; // const/4 v0, 0x3
			 final String v1 = "FirebaseInstanceId"; // const-string v1, "FirebaseInstanceId"
			 /* .line 2 */
			 v0 = 			 android.util.Log .isLoggable ( v1,v0 );
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 final String v0 = "Invoking onNewToken for app: "; // const-string v0, "Invoking onNewToken for app: "
				 /* .line 3 */
				 v2 = this.d;
				 (( com.google.firebase.iid.FirebaseInstanceId ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/google/firebase/iid/FirebaseInstanceId;->b()Le/f/c/h;
				 (( e.f.c.h ) v2 ).c ( ); // invoke-virtual {v2}, Le/f/c/h;->c()Ljava/lang/String;
				 java.lang.String .valueOf ( v2 );
				 v3 = 				 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
				 if ( v3 != null) { // if-eqz v3, :cond_0
					 (( java.lang.String ) v0 ).concat ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
				 } // :cond_0
				 /* new-instance v2, Ljava/lang/String; */
				 /* invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
				 /* move-object v0, v2 */
			 } // :goto_0
			 android.util.Log .d ( v1,v0 );
			 /* .line 4 */
		 } // :cond_1
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.google.firebase.messaging.NEW_TOKEN"; // const-string v1, "com.google.firebase.messaging.NEW_TOKEN"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v1 = "token"; // const-string v1, "token"
		 /* .line 5 */
		 (( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 6 */
		 /* new-instance p1, Le/f/c/q/f; */
		 (( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
		 v2 = this.e;
		 /* invoke-direct {p1, v1, v2}, Le/f/c/q/f;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V */
		 (( e.f.c.q.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/q/f;->a(Landroid/content/Intent;)Le/f/a/b/h/g;
	 } // :cond_2
	 return;
} // .end method
public Boolean b ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 (( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
	 final String v1 = "connectivity"; // const-string v1, "connectivity"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/net/ConnectivityManager; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 v0 = 	 (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean c ( ) {
	 /* .locals 6 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
/* .line 1 */
v1 = this.d;
(( com.google.firebase.iid.FirebaseInstanceId ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->h()Le/f/c/q/x$a;
/* .line 2 */
v2 = this.d;
v2 = (( com.google.firebase.iid.FirebaseInstanceId ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z
int v3 = 1; // const/4 v3, 0x1
/* if-nez v2, :cond_0 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
try { // :try_start_0
v4 = this.d;
(( com.google.firebase.iid.FirebaseInstanceId ) v4 ).a ( ); // invoke-virtual {v4}, Lcom/google/firebase/iid/FirebaseInstanceId;->a()Ljava/lang/String;
/* if-nez v4, :cond_1 */
final String v1 = "Token retrieval failed: null"; // const-string v1, "Token retrieval failed: null"
/* .line 4 */
android.util.Log .e ( v0,v1 );
} // :cond_1
int v5 = 3; // const/4 v5, 0x3
/* .line 5 */
v5 = android.util.Log .isLoggable ( v0,v5 );
if ( v5 != null) { // if-eqz v5, :cond_2
final String v5 = "Token successfully retrieved"; // const-string v5, "Token successfully retrieved"
/* .line 6 */
android.util.Log .d ( v0,v5 );
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
	 /* .line 7 */
	 v1 = this.a;
	 v1 = 	 (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v1, :cond_4 */
	 /* .line 8 */
} // :cond_3
(( e.f.c.q.z ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Le/f/c/q/z;->a(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_4
/* :catch_0 */
final String v1 = "Token retrieval failed with SecurityException.Will retry token retrieval"; // const-string v1, "Token retrieval failed with SecurityException.Will retry token retrieval"
/* .line 9 */
android.util.Log .w ( v0,v1 );
/* :catch_1 */
/* move-exception v1 */
/* .line 10 */
(( java.io.IOException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
v3 = e.f.c.q.o .a ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 11 */
(( java.io.IOException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
java.lang.String .valueOf ( v1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, 0x34 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Token retrieval failed: "; // const-string v3, "Token retrieval failed: "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ".Will retry token retrieval"; // const-string v1, ".Will retry token retrieval"
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
/* .line 12 */
} // :cond_5
(( java.io.IOException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
/* if-nez v3, :cond_6 */
final String v1 = "Token retrieval failed without exception message.Will retry token retrieval"; // const-string v1, "Token retrieval failed without exception message.Will retry token retrieval"
/* .line 13 */
android.util.Log .w ( v0,v1 );
/* .line 14 */
} // :cond_6
/* throw v1 */
} // .end method
public void run ( ) {
/* .locals 5 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "Wakelock" */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.q.w .b ( );
(( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
v0 = (( e.f.c.q.w ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.c;
(( android.os.PowerManager$WakeLock ) v0 ).acquire ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
try { // :try_start_0
v1 = this.d;
int v2 = 1; // const/4 v2, 0x1
(( com.google.firebase.iid.FirebaseInstanceId ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V
/* .line 4 */
v1 = this.d;
v1 = (( com.google.firebase.iid.FirebaseInstanceId ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->i()Z
/* if-nez v1, :cond_2 */
/* .line 5 */
v1 = this.d;
(( com.google.firebase.iid.FirebaseInstanceId ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
e.f.c.q.w .b ( );
(( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
v0 = (( e.f.c.q.w ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v0 = this.c;
(( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
} // :cond_1
return;
/* .line 8 */
} // :cond_2
try { // :try_start_1
e.f.c.q.w .b ( );
(( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
v1 = (( e.f.c.q.w ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/q/w;->a(Landroid/content/Context;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 9 */
v1 = (( e.f.c.q.z ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/q/z;->b()Z
/* if-nez v1, :cond_4 */
/* .line 10 */
/* new-instance v1, Le/f/c/q/y; */
/* invoke-direct {v1, p0}, Le/f/c/q/y;-><init>(Le/f/c/q/z;)V */
/* .line 11 */
(( e.f.c.q.y ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/q/y;->a()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 12 */
e.f.c.q.w .b ( );
(( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
v0 = (( e.f.c.q.w ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 13 */
v0 = this.c;
(( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
} // :cond_3
return;
/* .line 14 */
} // :cond_4
try { // :try_start_2
v1 = (( e.f.c.q.z ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/q/z;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 15 */
v1 = this.d;
(( com.google.firebase.iid.FirebaseInstanceId ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V
/* .line 16 */
} // :cond_5
v1 = this.d;
/* iget-wide v2, p0, Le/f/c/q/z;->b:J */
(( com.google.firebase.iid.FirebaseInstanceId ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(J)V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 17 */
} // :goto_0
e.f.c.q.w .b ( );
(( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
v0 = (( e.f.c.q.w ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 18 */
v0 = this.c;
(( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
return;
/* :catchall_0 */
/* move-exception v0 */
/* :catch_0 */
/* move-exception v1 */
try { // :try_start_3
final String v2 = "FirebaseInstanceId"; // const-string v2, "FirebaseInstanceId"
/* .line 19 */
(( java.io.IOException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
java.lang.String .valueOf ( v1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, 0x5d */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Topic sync or token retrieval failed on hard failure exceptions: "; // const-string v3, "Topic sync or token retrieval failed on hard failure exceptions: "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ".Won\'t retry the operation."; // const-string v1, ".Won\'t retry the operation."
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 20 */
android.util.Log .e ( v2,v1 );
/* .line 21 */
v1 = this.d;
(( com.google.firebase.iid.FirebaseInstanceId ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 22 */
e.f.c.q.w .b ( );
(( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
v0 = (( e.f.c.q.w ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
	 /* .line 23 */
	 v0 = this.c;
	 (( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
} // :cond_6
return;
/* .line 24 */
} // :goto_1
e.f.c.q.w .b ( );
(( e.f.c.q.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;
v1 = (( e.f.c.q.w ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/q/w;->b(Landroid/content/Context;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 25 */
v1 = this.c;
(( android.os.PowerManager$WakeLock ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V
/* .line 26 */
} // :cond_7
/* throw v0 */
} // .end method
