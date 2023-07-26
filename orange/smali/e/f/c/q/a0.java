public abstract class e.f.c.q.a0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Long a;
	 public static final java.lang.Object b;
	 public static e.f.a.b.g.a c;
	 /* # direct methods */
	 public static e.f.c.q.a0 ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = java.util.concurrent.TimeUnit.MINUTES;
		 /* const-wide/16 v1, 0x1 */
		 (( java.util.concurrent.TimeUnit ) v0 ).toMillis ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
		 /* move-result-wide v0 */
		 /* sput-wide v0, Le/f/c/q/a0;->a:J */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static android.content.ComponentName a ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 3 */
		 /* .line 4 */
		 v0 = e.f.c.q.a0.b;
		 /* monitor-enter v0 */
		 /* .line 5 */
		 try { // :try_start_0
			 e.f.c.q.a0 .a ( p0 );
			 /* .line 6 */
			 v1 = 			 e.f.c.q.a0 .b ( p1 );
			 int v2 = 1; // const/4 v2, 0x1
			 /* .line 7 */
			 e.f.c.q.a0 .a ( p1,v2 );
			 /* .line 8 */
			 (( android.content.Context ) p0 ).startService ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
			 /* if-nez p0, :cond_0 */
			 int p0 = 0; // const/4 p0, 0x0
			 /* .line 9 */
			 /* monitor-exit v0 */
		 } // :cond_0
		 /* if-nez v1, :cond_1 */
		 /* .line 10 */
		 p1 = e.f.c.q.a0.c;
		 /* sget-wide v1, Le/f/c/q/a0;->a:J */
		 (( e.f.a.b.g.a ) p1 ).a ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Le/f/a/b/g/a;->a(J)V
		 /* .line 11 */
	 } // :cond_1
	 /* monitor-exit v0 */
	 /* :catchall_0 */
	 /* move-exception p0 */
	 /* .line 12 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw p0 */
} // .end method
public static void a ( android.content.Context p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = e.f.c.q.a0.c;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Le/f/a/b/g/a; */
	 int v1 = 1; // const/4 v1, 0x1
	 final String v2 = "wake:com.google.firebase.iid.WakeLockHolder"; // const-string v2, "wake:com.google.firebase.iid.WakeLockHolder"
	 /* invoke-direct {v0, p0, v1, v2}, Le/f/a/b/g/a;-><init>(Landroid/content/Context;ILjava/lang/String;)V */
	 /* .line 3 */
	 (( e.f.a.b.g.a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/g/a;->a(Z)V
} // :cond_0
return;
} // .end method
public static void a ( android.content.Intent p0 ) {
/* .locals 2 */
/* .line 14 */
v0 = e.f.c.q.a0.b;
/* monitor-enter v0 */
/* .line 15 */
try { // :try_start_0
	 v1 = e.f.c.q.a0.c;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v1 = 		 e.f.c.q.a0 .b ( p0 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v1 = 0; // const/4 v1, 0x0
			 /* .line 16 */
			 e.f.c.q.a0 .a ( p0,v1 );
			 /* .line 17 */
			 p0 = e.f.c.q.a0.c;
			 (( e.f.a.b.g.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/g/a;->a()V
			 /* .line 18 */
		 } // :cond_0
		 /* monitor-exit v0 */
		 return;
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw p0 */
	 } // .end method
	 public static void a ( android.content.Intent p0, Boolean p1 ) {
		 /* .locals 1 */
		 final String v0 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"; // const-string v0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"
		 /* .line 13 */
		 (( android.content.Intent ) p0 ).putExtra ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
		 return;
	 } // .end method
	 public static Boolean b ( android.content.Intent p0 ) {
		 /* .locals 2 */
		 final String v0 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"; // const-string v0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 1 */
		 p0 = 		 (( android.content.Intent ) p0 ).getBooleanExtra ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
	 } // .end method
