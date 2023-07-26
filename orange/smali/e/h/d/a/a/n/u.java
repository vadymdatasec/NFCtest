public abstract class e.h.d.a.a.n.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 final String v0 = "packid.UserClean"; // const-string v0, "packid.UserClean"
		 final String v1 = "Delete all data"; // const-string v1, "Delete all data"
		 /* .line 1 */
		 android.util.Log .i ( v0,v1 );
		 /* .line 2 */
		 e.h.d.a.a.s.m .c ( p0 );
		 (( e.h.d.a.a.s.g0 ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/s/g0;->b()V
		 /* .line 3 */
		 e.h.d.a.a.n.w.c .a ( p0 );
		 /* .line 4 */
		 com.orange.oab.contactless.packid.service.Aid .register ( p0 );
		 int v0 = 0; // const/4 v0, 0x0
		 final String v1 = "========="; // const-string v1, "========="
		 /* .line 5 */
		 com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,v1,v0 );
		 final String v2 = "Clear All Users"; // const-string v2, "Clear All Users"
		 /* .line 6 */
		 com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,v2 );
		 /* .line 7 */
		 com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,v1,v0 );
		 return;
	 } // .end method
