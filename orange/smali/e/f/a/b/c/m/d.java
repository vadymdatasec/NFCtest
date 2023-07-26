public abstract class e.f.a.b.c.m.d implements android.content.DialogInterface$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.a.b.c.m.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.a.b.c.m.d a ( android.app.Activity p0, android.content.Intent p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/a/b/c/m/k; */
		 /* invoke-direct {v0, p1, p0, p2}, Le/f/a/b/c/m/k;-><init>(Landroid/content/Intent;Landroid/app/Activity;I)V */
	 } // .end method
	 /* # virtual methods */
	 public abstract void a ( ) {
	 } // .end method
	 public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 try { // :try_start_0
			 (( e.f.a.b.c.m.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/m/d;->a()V
			 /* :try_end_0 */
			 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 2 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p2 */
			 /* :catch_0 */
			 /* move-exception p2 */
			 try { // :try_start_1
				 final String v0 = "DialogRedirect"; // const-string v0, "DialogRedirect"
				 final String v1 = "Failed to start resolution intent"; // const-string v1, "Failed to start resolution intent"
				 /* .line 3 */
				 android.util.Log .e ( v0,v1,p2 );
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 4 */
				 return;
				 /* .line 5 */
			 } // :goto_0
			 /* throw p2 */
		 } // .end method
