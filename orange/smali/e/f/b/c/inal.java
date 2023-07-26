public class inal implements e.f.b.c.l {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final e.f.b.c.j a;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/b/c/j; */
		 /* invoke-direct {v0}, Le/f/b/c/j;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.io.Closeable p0, java.lang.Throwable p1, java.lang.Throwable p2 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 p2 = e.f.b.c.i.a;
		 v0 = java.util.logging.Level.WARNING;
		 java.lang.String .valueOf ( p1 );
		 java.lang.String .valueOf ( p1 );
		 v1 = 		 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
		 /* add-int/lit8 v1, v1, 0x2a */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v1 = "Suppressing exception thrown when closing "; // const-string v1, "Suppressing exception thrown when closing "
		 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.util.logging.Logger ) p2 ).log ( v0, p1, p3 ); // invoke-virtual {p2, v0, p1, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
		 return;
	 } // .end method
