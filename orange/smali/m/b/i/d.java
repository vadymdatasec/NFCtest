public class m.b.i.d extends m.b.i.t {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.b.i.d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p2}, Lm/b/i/t;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 p2 = this.d;
		 final String v0 = "comment"; // const-string v0, "comment"
		 (( m.b.i.b ) p2 ).a ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lm/b/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( java.lang.Appendable p0, Integer p1, Object p2 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = 	 (( m.b.i.g ) p3 ).g ( ); // invoke-virtual {p3}, Lm/b/i/g;->g()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( m.b.i.t ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lm/b/i/t;->a(Ljava/lang/Appendable;ILm/b/i/g;)V
	 } // :cond_0
	 final String p2 = "<!--"; // const-string p2, "<!--"
	 /* .line 3 */
	 /* .line 4 */
	 (( m.b.i.d ) p0 ).r ( ); // invoke-virtual {p0}, Lm/b/i/d;->r()Ljava/lang/String;
	 final String p2 = "-->"; // const-string p2, "-->"
	 /* .line 5 */
	 return;
} // .end method
public void c ( java.lang.Appendable p0, Integer p1, Object p2 ) {
	 /* .locals 0 */
	 return;
} // .end method
public java.lang.String i ( ) {
	 /* .locals 1 */
	 final String v0 = "#comment"; // const-string v0, "#comment"
} // .end method
public java.lang.String r ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.d;
	 final String v1 = "comment"; // const-string v1, "comment"
	 (( m.b.i.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lm/b/i/b;->a(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( m.b.i.t ) p0 ).j ( ); // invoke-virtual {p0}, Lm/b/i/t;->j()Ljava/lang/String;
} // .end method
