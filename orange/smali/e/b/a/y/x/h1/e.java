public class e.b.a.y.x.h1.e implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Runnable b; //synthetic
	 public final e.b.a.y.x.h1.f c; //synthetic
	 /* # direct methods */
	 public e.b.a.y.x.h1.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.c;
		 /* iget-boolean v0, v0, Le/b/a/y/x/h1/f;->d:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder; */
			 /* invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V */
			 /* .line 3 */
			 (( android.os.StrictMode$ThreadPolicy$Builder ) v0 ).detectNetwork ( ); // invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;
			 (( android.os.StrictMode$ThreadPolicy$Builder ) v0 ).penaltyDeath ( ); // invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;
			 (( android.os.StrictMode$ThreadPolicy$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;
			 /* .line 4 */
			 android.os.StrictMode .setThreadPolicy ( v0 );
			 /* .line 5 */
		 } // :cond_0
		 try { // :try_start_0
			 v0 = this.b;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* .line 6 */
			 v1 = this.c;
			 v1 = this.c;
		 } // :goto_0
		 return;
	 } // .end method
