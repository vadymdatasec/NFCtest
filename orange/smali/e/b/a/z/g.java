public class e.b.a.z.g implements e.b.a.z.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.b.a.z.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.z.d a ( android.content.Context p0, Object p1 ) {
		 /* .locals 3 */
		 final String v0 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v0, "android.permission.ACCESS_NETWORK_STATE"
		 /* .line 1 */
		 v0 = 		 c.h.f.f .a ( p1,v0 );
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
int v1 = 3; // const/4 v1, 0x3
final String v2 = "ConnectivityMonitor"; // const-string v2, "ConnectivityMonitor"
/* .line 2 */
v1 = android.util.Log .isLoggable ( v2,v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 final String v1 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"; // const-string v1, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"
	 } // :cond_1
	 final String v1 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"; // const-string v1, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"
	 /* .line 3 */
} // :goto_1
android.util.Log .d ( v2,v1 );
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 4 */
/* new-instance v0, Le/b/a/z/f; */
/* invoke-direct {v0, p1, p2}, Le/b/a/z/f;-><init>(Landroid/content/Context;Le/b/a/z/c;)V */
/* .line 5 */
} // :cond_3
/* new-instance v0, Le/b/a/z/r; */
/* invoke-direct {v0}, Le/b/a/z/r;-><init>()V */
} // :goto_2
} // .end method
