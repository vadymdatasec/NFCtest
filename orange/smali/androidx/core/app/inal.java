public class inal extends androidx.core.app.JobIntentService$h {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/core/app/JobIntentService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "c" */
} // .end annotation
/* # instance fields */
public final android.content.Context d;
public final android.os.PowerManager$WakeLock e;
public final android.os.PowerManager$WakeLock f;
public Boolean g;
public Boolean h;
/* # direct methods */
public inal ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0, p2}, Landroidx/core/app/JobIntentService$h;-><init>(Landroid/content/ComponentName;)V */
/* .line 2 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.d = v0;
final String v0 = "power"; // const-string v0, "power"
/* .line 3 */
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/os/PowerManager; */
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 5 */
(( android.content.ComponentName ) p2 ).getClassName ( ); // invoke-virtual {p2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ":launch"; // const-string v1, ":launch"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
/* .line 6 */
(( android.os.PowerManager ) p1 ).newWakeLock ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
this.e = v0;
int v2 = 0; // const/4 v2, 0x0
/* .line 7 */
(( android.os.PowerManager$WakeLock ) v0 ).setReferenceCounted ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V
/* .line 8 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 9 */
(( android.content.ComponentName ) p2 ).getClassName ( ); // invoke-virtual {p2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ":run"; // const-string p2, ":run"
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 10 */
(( android.os.PowerManager ) p1 ).newWakeLock ( v1, p2 ); // invoke-virtual {p1, v1, p2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
this.f = p1;
/* .line 11 */
(( android.os.PowerManager$WakeLock ) p1 ).setReferenceCounted ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* .line 10 */
/* monitor-enter p0 */
/* .line 11 */
try { // :try_start_0
	 /* iget-boolean v0, p0, Landroidx/core/app/JobIntentService$c;->h:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 12 */
		 /* iget-boolean v0, p0, Landroidx/core/app/JobIntentService$c;->g:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 13 */
			 v0 = this.e;
			 /* const-wide/32 v1, 0xea60 */
			 (( android.os.PowerManager$WakeLock ) v0 ).acquire ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 14 */
		 /* iput-boolean v0, p0, Landroidx/core/app/JobIntentService$c;->h:Z */
		 /* .line 15 */
		 v0 = this.f;
		 (( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
		 /* .line 16 */
	 } // :cond_1
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public void a ( android.content.Intent p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Landroid/content/Intent; */
	 /* invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V */
	 /* .line 2 */
	 p1 = this.a;
	 (( android.content.Intent ) v0 ).setComponent ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
	 /* .line 3 */
	 p1 = this.d;
	 (( android.content.Context ) p1 ).startService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 4 */
		 /* monitor-enter p0 */
		 /* .line 5 */
		 try { // :try_start_0
			 /* iget-boolean p1, p0, Landroidx/core/app/JobIntentService$c;->g:Z */
			 /* if-nez p1, :cond_0 */
			 int p1 = 1; // const/4 p1, 0x1
			 /* .line 6 */
			 /* iput-boolean p1, p0, Landroidx/core/app/JobIntentService$c;->g:Z */
			 /* .line 7 */
			 /* iget-boolean p1, p0, Landroidx/core/app/JobIntentService$c;->h:Z */
			 /* if-nez p1, :cond_0 */
			 /* .line 8 */
			 p1 = this.e;
			 /* const-wide/32 v0, 0xea60 */
			 (( android.os.PowerManager$WakeLock ) p1 ).acquire ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
			 /* .line 9 */
		 } // :cond_0
		 /* monitor-exit p0 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit p0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw p1 */
	 } // :cond_1
} // :goto_0
return;
} // .end method
public void b ( ) {
/* .locals 3 */
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
	 /* iget-boolean v0, p0, Landroidx/core/app/JobIntentService$c;->h:Z */
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 3 */
	 /* iput-boolean v0, p0, Landroidx/core/app/JobIntentService$c;->h:Z */
	 /* .line 4 */
	 v0 = this.f;
	 /* const-wide/32 v1, 0x927c0 */
	 (( android.os.PowerManager$WakeLock ) v0 ).acquire ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
	 /* .line 5 */
	 v0 = this.e;
	 (( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
	 /* .line 6 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
try { // :try_start_0
	 /* iput-boolean v0, p0, Landroidx/core/app/JobIntentService$c;->g:Z */
	 /* .line 3 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
