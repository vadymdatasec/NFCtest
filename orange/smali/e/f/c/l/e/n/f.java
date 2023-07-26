public class e.f.c.l.e.n.f implements e.f.c.l.e.n.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Boolean a;
	 public final java.lang.StringBuilder b; //synthetic
	 public final e.f.c.l.e.n.j c; //synthetic
	 /* # direct methods */
	 public e.f.c.l.e.n.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 2 */
		 /* iput-boolean p1, p0, Le/f/c/l/e/n/f;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.io.InputStream p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* iget-boolean p1, p0, Le/f/c/l/e/n/f;->a:Z */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 /* iput-boolean p1, p0, Le/f/c/l/e/n/f;->a:Z */
		 /* .line 3 */
	 } // :cond_0
	 p1 = this.b;
	 final String v0 = ", "; // const-string v0, ", "
	 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 4 */
} // :goto_0
p1 = this.b;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
return;
} // .end method
