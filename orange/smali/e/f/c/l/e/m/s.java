public class e.f.c.l.e.m.s implements java.io.FilenameFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.Set a; //synthetic
	 /* # direct methods */
	 public e.f.c.l.e.m.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean accept ( java.io.File p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = 		 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
		 int v0 = 0; // const/4 v0, 0x0
		 /* const/16 v1, 0x23 */
		 /* if-ge p1, v1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 p1 = this.a;
	 p1 = 	 (( java.lang.String ) p2 ).substring ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
