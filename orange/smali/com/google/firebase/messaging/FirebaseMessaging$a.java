public class com.google.firebase.messaging.FirebaseMessaging$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/firebase/messaging/FirebaseMessaging; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final e.f.c.o.d a;
public Boolean b;
public e.f.c.o.b c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/c/o/b<", */
/* "Le/f/c/a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.lang.Boolean d;
public final com.google.firebase.messaging.FirebaseMessaging e; //synthetic
/* # direct methods */
public com.google.firebase.messaging.FirebaseMessaging$a ( ) {
/* .locals 0 */
/* .line 1 */
this.e = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p2;
return;
} // .end method
/* # virtual methods */
public synchronized void a ( ) {
/* .locals 3 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging$a;->b:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* monitor-exit p0 */
return;
/* .line 3 */
} // :cond_0
try { // :try_start_1
(( com.google.firebase.messaging.FirebaseMessaging$a ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->d()Ljava/lang/Boolean;
this.d = v0;
/* if-nez v0, :cond_1 */
/* .line 4 */
/* new-instance v0, Le/f/c/u/p; */
/* invoke-direct {v0, p0}, Le/f/c/u/p;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging$a;)V */
this.c = v0;
/* .line 5 */
v1 = this.a;
/* const-class v2, Le/f/c/a; */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
/* iput-boolean v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging$a;->b:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 7 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void a ( Object p0 ) { //synthethic
/* .locals 1 */
/* .line 8 */
p1 = (( com.google.firebase.messaging.FirebaseMessaging$a ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->b()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 9 */
p1 = this.e;
com.google.firebase.messaging.FirebaseMessaging .b ( p1 );
/* new-instance v0, Le/f/c/u/q; */
/* invoke-direct {v0, p0}, Le/f/c/u/q;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging$a;)V */
} // :cond_0
return;
} // .end method
public synchronized Boolean b ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
(( com.google.firebase.messaging.FirebaseMessaging$a ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->a()V
/* .line 2 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 v0 = this.d;
	 v0 = 	 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* .line 4 */
} // :cond_0
try { // :try_start_1
	 v0 = this.e;
	 com.google.firebase.messaging.FirebaseMessaging .a ( v0 );
	 v0 = 	 (( e.f.c.h ) v0 ).g ( ); // invoke-virtual {v0}, Le/f/c/h;->g()Z
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* .line 5 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public final void c ( ) { //synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.e;
	 com.google.firebase.messaging.FirebaseMessaging .c ( v0 );
	 (( com.google.firebase.iid.FirebaseInstanceId ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->g()Ljava/lang/String;
	 return;
} // .end method
public final java.lang.Boolean d ( ) {
	 /* .locals 6 */
	 final String v0 = "firebase_messaging_auto_init_enabled"; // const-string v0, "firebase_messaging_auto_init_enabled"
	 /* .line 1 */
	 v1 = this.e;
	 com.google.firebase.messaging.FirebaseMessaging .a ( v1 );
	 (( e.f.c.h ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/h;->b()Landroid/content/Context;
	 int v2 = 0; // const/4 v2, 0x0
	 final String v3 = "com.google.firebase.messaging"; // const-string v3, "com.google.firebase.messaging"
	 /* .line 2 */
	 (( android.content.Context ) v1 ).getSharedPreferences ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 final String v4 = "auto_init"; // const-string v4, "auto_init"
	 v5 = 	 /* .line 3 */
	 if ( v5 != null) { // if-eqz v5, :cond_0
		 v0 = 		 /* .line 4 */
		 java.lang.Boolean .valueOf ( v0 );
		 /* .line 5 */
	 } // :cond_0
	 try { // :try_start_0
		 (( android.content.Context ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* .line 6 */
			 (( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 /* const/16 v3, 0x80 */
			 /* .line 7 */
			 (( android.content.pm.PackageManager ) v2 ).getApplicationInfo ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* .line 8 */
				 v2 = this.metaData;
				 if ( v2 != null) { // if-eqz v2, :cond_1
					 v2 = this.metaData;
					 /* .line 9 */
					 v2 = 					 (( android.os.Bundle ) v2 ).containsKey ( v0 ); // invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
					 if ( v2 != null) { // if-eqz v2, :cond_1
						 /* .line 10 */
						 v1 = this.metaData;
						 v0 = 						 (( android.os.Bundle ) v1 ).getBoolean ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
						 java.lang.Boolean .valueOf ( v0 );
						 /* :try_end_0 */
						 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
						 /* :catch_0 */
					 } // :cond_1
					 int v0 = 0; // const/4 v0, 0x0
				 } // .end method
