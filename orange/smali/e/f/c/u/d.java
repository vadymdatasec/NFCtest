public class e.f.c.u.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.concurrent.Executor a;
	 public final android.content.Context b;
	 public final e.f.c.u.a0 c;
	 /* # direct methods */
	 public e.f.c.u.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p3;
		 /* .line 3 */
		 this.b = p1;
		 /* .line 4 */
		 this.c = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( c.h.e.c0$a p0, Object p1 ) {
		 /* .locals 5 */
		 final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
		 /* if-nez p2, :cond_0 */
		 return;
		 /* .line 8 */
	 } // :cond_0
	 try { // :try_start_0
		 (( e.f.c.u.x ) p2 ).m ( ); // invoke-virtual {p2}, Le/f/c/u/x;->m()Le/f/a/b/h/g;
		 /* const-wide/16 v2, 0x5 */
		 v4 = java.util.concurrent.TimeUnit.SECONDS;
		 e.f.a.b.h.n .a ( v1,v2,v3,v4 );
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* .line 9 */
		 (( c.h.e.c0$a ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/h/e/c0$a;->b(Landroid/graphics/Bitmap;)Lc/h/e/c0$a;
		 /* .line 10 */
		 /* new-instance v2, Lc/h/e/x; */
		 /* invoke-direct {v2}, Lc/h/e/x;-><init>()V */
		 (( c.h.e.x ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Lc/h/e/x;->b(Landroid/graphics/Bitmap;)Lc/h/e/x;
		 int v1 = 0; // const/4 v1, 0x0
		 (( c.h.e.x ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lc/h/e/x;->a(Landroid/graphics/Bitmap;)Lc/h/e/x;
		 (( c.h.e.c0$a ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;
		 /* :try_end_0 */
		 /* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 ..:try_end_0} :catch_0 */
		 return;
		 /* :catch_0 */
		 final String p1 = "Failed to download image in time, showing notification without it"; // const-string p1, "Failed to download image in time, showing notification without it"
		 /* .line 11 */
		 android.util.Log .w ( v0,p1 );
		 /* .line 12 */
		 (( e.f.c.u.x ) p2 ).close ( ); // invoke-virtual {p2}, Le/f/c/u/x;->close()V
		 return;
		 /* :catch_1 */
		 final String p1 = "Interrupted while downloading image, showing notification without it"; // const-string p1, "Interrupted while downloading image, showing notification without it"
		 /* .line 13 */
		 android.util.Log .w ( v0,p1 );
		 /* .line 14 */
		 (( e.f.c.u.x ) p2 ).close ( ); // invoke-virtual {p2}, Le/f/c/u/x;->close()V
		 /* .line 15 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
		 return;
		 /* :catch_2 */
		 /* move-exception p1 */
		 /* .line 16 */
		 (( java.util.concurrent.ExecutionException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;
		 java.lang.String .valueOf ( p1 );
		 java.lang.String .valueOf ( p1 );
		 p2 = 		 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
		 /* add-int/lit8 p2, p2, 0x1a */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String p2 = "Failed to download image: "; // const-string p2, "Failed to download image: "
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .w ( v0,p1 );
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 3 */
		 final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
		 int v1 = 3; // const/4 v1, 0x3
		 /* .line 17 */
		 v1 = 		 android.util.Log .isLoggable ( v0,v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 final String v1 = "Showing notification"; // const-string v1, "Showing notification"
			 /* .line 18 */
			 android.util.Log .d ( v0,v1 );
			 /* .line 19 */
		 } // :cond_0
		 v0 = this.b;
		 final String v1 = "notification"; // const-string v1, "notification"
		 /* .line 20 */
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/app/NotificationManager; */
		 /* .line 21 */
		 v1 = this.b;
		 /* iget v2, p1, Le/f/c/u/a;->c:I */
		 p1 = this.a;
		 (( c.h.e.c0$a ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/e/c0$a;->a()Landroid/app/Notification;
		 (( android.app.NotificationManager ) v0 ).notify ( v1, v2, p1 ); // invoke-virtual {v0, v1, v2, p1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V
		 return;
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.c;
		 final String v1 = "gcm.n.noui"; // const-string v1, "gcm.n.noui"
		 v0 = 		 (( e.f.c.u.a0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 v0 = 		 (( e.f.c.u.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/u/d;->b()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 3 */
		 } // :cond_1
		 (( e.f.c.u.d ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/u/d;->c()Le/f/c/u/x;
		 /* .line 4 */
		 v2 = this.b;
		 v3 = this.c;
		 /* .line 5 */
		 e.f.c.u.b .b ( v2,v3 );
		 /* .line 6 */
		 v3 = this.a;
		 (( e.f.c.u.d ) p0 ).a ( v3, v0 ); // invoke-virtual {p0, v3, v0}, Le/f/c/u/d;->a(Lc/h/e/c0$a;Le/f/c/u/x;)V
		 /* .line 7 */
		 (( e.f.c.u.d ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/u/d;->a(Le/f/c/u/a;)V
	 } // .end method
	 public final Boolean b ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 final String v1 = "keyguard"; // const-string v1, "keyguard"
		 /* .line 2 */
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/app/KeyguardManager; */
		 /* .line 3 */
		 v0 = 		 (( android.app.KeyguardManager ) v0 ).inKeyguardRestrictedInputMode ( ); // invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
		 } // :cond_0
		 v0 = 		 e.f.a.b.c.p.h .f ( );
		 /* if-nez v0, :cond_1 */
		 /* const-wide/16 v2, 0xa */
		 /* .line 5 */
		 android.os.SystemClock .sleep ( v2,v3 );
		 /* .line 6 */
	 } // :cond_1
	 v0 = 	 android.os.Process .myPid ( );
	 /* .line 7 */
	 v2 = this.b;
	 final String v3 = "activity"; // const-string v3, "activity"
	 (( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v2, Landroid/app/ActivityManager; */
	 /* .line 8 */
	 (( android.app.ActivityManager ) v2 ).getRunningAppProcesses ( ); // invoke-virtual {v2}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
	 if ( v2 != null) { // if-eqz v2, :cond_3
		 /* .line 9 */
	 v3 = 	 } // :cond_2
	 if ( v3 != null) { // if-eqz v3, :cond_3
		 /* check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo; */
		 /* .line 10 */
		 /* iget v4, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I */
		 /* if-ne v4, v0, :cond_2 */
		 /* .line 11 */
		 /* iget v0, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I */
		 /* const/16 v2, 0x64 */
		 /* if-ne v0, v2, :cond_3 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_3
} // .end method
public final e.f.c.u.x c ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.c;
	 final String v1 = "gcm.n.image"; // const-string v1, "gcm.n.image"
	 (( e.f.c.u.a0 ) v0 ).g ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 2 */
	 e.f.c.u.x .b ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 v1 = this.a;
		 (( e.f.c.u.x ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/u/x;->a(Ljava/util/concurrent/Executor;)V
	 } // :cond_0
} // .end method
