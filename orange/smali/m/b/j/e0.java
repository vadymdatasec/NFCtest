public class m.b.j.e0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final m.b.j.e0 c;
	 public static final m.b.j.e0 d;
	 /* # instance fields */
	 public final Boolean a;
	 public final Boolean b;
	 /* # direct methods */
	 public static m.b.j.e0 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lm/b/j/e0; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1, v1}, Lm/b/j/e0;-><init>(ZZ)V */
		 /* .line 2 */
		 /* new-instance v0, Lm/b/j/e0; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1, v1}, Lm/b/j/e0;-><init>(ZZ)V */
		 return;
	 } // .end method
	 public m.b.j.e0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lm/b/j/e0;->a:Z */
		 /* .line 3 */
		 /* iput-boolean p2, p0, Lm/b/j/e0;->b:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
		 /* .line 2 */
		 /* iget-boolean v0, p0, Lm/b/j/e0;->a:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 (( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
	 } // :cond_0
} // .end method
public m.b.i.b a ( Object p0 ) {
	 /* .locals 3 */
	 /* .line 4 */
	 /* iget-boolean v0, p0, Lm/b/j/e0;->b:Z */
	 /* if-nez v0, :cond_0 */
	 /* .line 5 */
	 (( m.b.i.b ) p1 ).iterator ( ); // invoke-virtual {p1}, Lm/b/i/b;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* check-cast v1, Lm/b/i/a; */
	 /* .line 6 */
	 (( m.b.i.a ) v1 ).getKey ( ); // invoke-virtual {v1}, Lm/b/i/a;->getKey()Ljava/lang/String;
	 (( java.lang.String ) v2 ).toLowerCase ( ); // invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
	 (( m.b.i.a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lm/b/i/a;->a(Ljava/lang/String;)V
} // :cond_0
} // .end method
