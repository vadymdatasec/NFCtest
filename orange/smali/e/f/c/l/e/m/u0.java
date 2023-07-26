public class e.f.c.l.e.m.u0 implements java.io.FilenameFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a;
	 /* # direct methods */
	 public e.f.c.l.e.m.u0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean accept ( java.io.File p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance p1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
		 v0 = this.a;
		 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = ".cls"; // const-string v0, ".cls"
		 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 p1 = 		 (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 p1 = this.a;
		 p1 = 		 (( java.lang.String ) p2 ).contains ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 final String p1 = ".cls_temp"; // const-string p1, ".cls_temp"
			 /* .line 3 */
			 p1 = 			 (( java.lang.String ) p2 ).endsWith ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
			 /* if-nez p1, :cond_1 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_1
	 } // .end method
