public class e.b.a.y.x.h1.h implements e.b.a.y.x.h1.j {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.b.a.y.x.h1.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.Throwable p0 ) {
		 /* .locals 2 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int v0 = 6; // const/4 v0, 0x6
			 final String v1 = "GlideExecutor"; // const-string v1, "GlideExecutor"
			 /* .line 1 */
			 v0 = 			 android.util.Log .isLoggable ( v1,v0 );
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 final String v0 = "Request threw uncaught throwable"; // const-string v0, "Request threw uncaught throwable"
				 /* .line 2 */
				 android.util.Log .e ( v1,v0,p1 );
			 } // :cond_0
			 return;
		 } // .end method
