public class e.f.c.l.e.m.o0 implements java.io.FilenameFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a;
	 /* # direct methods */
	 public e.f.c.l.e.m.o0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean accept ( java.io.File p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = 		 (( java.lang.String ) p2 ).contains ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 final String p1 = ".cls_temp"; // const-string p1, ".cls_temp"
			 p1 = 			 (( java.lang.String ) p2 ).endsWith ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
			 /* if-nez p1, :cond_0 */
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
} // .end method
