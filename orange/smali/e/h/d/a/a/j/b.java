public class e.h.d.a.a.j.b implements com.orange.oab.contactless.packid.debug.DebugConsolePrinter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public e.h.d.a.a.j.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void log ( java.lang.String p0, Integer p1, java.lang.String p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 android.util.Log .d ( p1,p3 );
		 /* .line 4 */
		 p1 = this.a;
		 com.orange.oab.contactless.packid.service.LogManager .log ( p1,p2,p3,p4 );
		 return;
	 } // .end method
	 public void log ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( e.h.d.a.a.j.b ) p0 ).log ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/j/b;->log(Ljava/lang/String;Ljava/lang/String;I)V
		 return;
	 } // .end method
	 public void log ( java.lang.String p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 1 */
		 /* const/high16 v0, -0x1000000 */
		 /* .line 2 */
		 (( e.h.d.a.a.j.b ) p0 ).log ( p1, v0, p2, p3 ); // invoke-virtual {p0, p1, v0, p2, p3}, Le/h/d/a/a/j/b;->log(Ljava/lang/String;ILjava/lang/String;I)V
		 return;
	 } // .end method