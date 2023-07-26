public abstract class e.b.a.y.x.g1.i implements e.b.a.y.x.g1.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Long a;
	 public final e.b.a.y.x.g1.h b;
	 /* # direct methods */
	 public e.b.a.y.x.g1.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput-wide p2, p0, Le/b/a/y/x/g1/i;->a:J */
		 /* .line 3 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.y.x.g1.c a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 v2 = 	 (( java.io.File ) v0 ).isDirectory ( ); // invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
	 /* if-nez v2, :cond_2 */
	 v2 = 	 (( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
	 if ( v2 != null) { // if-eqz v2, :cond_1
	 } // :cond_1
	 /* .line 3 */
} // :cond_2
} // :goto_0
/* iget-wide v1, p0, Le/b/a/y/x/g1/i;->a:J */
e.b.a.y.x.g1.j .a ( v0,v1,v2 );
} // .end method
