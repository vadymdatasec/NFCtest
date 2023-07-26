public class l.l extends l.a0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public l.a0 e;
	 /* # direct methods */
	 public l.l ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ll/a0;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 this.e = p1;
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "delegate == null"; // const-string v0, "delegate == null"
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public l.a0 a ( ) {
		 /* .locals 1 */
		 /* .line 5 */
		 v0 = this.e;
		 (( l.a0 ) v0 ).a ( ); // invoke-virtual {v0}, Ll/a0;->a()Ll/a0;
	 } // .end method
	 public l.a0 a ( Long p0 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 v0 = this.e;
		 (( l.a0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ll/a0;->a(J)Ll/a0;
	 } // .end method
	 public l.a0 a ( Long p0, java.util.concurrent.TimeUnit p1 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 v0 = this.e;
		 (( l.a0 ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;
	 } // .end method
	 public final l.l a ( l.a0 p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 1 */
			 this.e = p1;
			 /* .line 2 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "delegate == null"; // const-string v0, "delegate == null"
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public l.a0 b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.e;
		 (( l.a0 ) v0 ).b ( ); // invoke-virtual {v0}, Ll/a0;->b()Ll/a0;
	 } // .end method
	 public Long c ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.e;
		 (( l.a0 ) v0 ).c ( ); // invoke-virtual {v0}, Ll/a0;->c()J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 public Boolean d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.e;
		 v0 = 		 (( l.a0 ) v0 ).d ( ); // invoke-virtual {v0}, Ll/a0;->d()Z
	 } // .end method
	 public void e ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.e;
	 (( l.a0 ) v0 ).e ( ); // invoke-virtual {v0}, Ll/a0;->e()V
	 return;
} // .end method
public Long f ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.e;
	 (( l.a0 ) v0 ).f ( ); // invoke-virtual {v0}, Ll/a0;->f()J
	 /* move-result-wide v0 */
	 /* return-wide v0 */
} // .end method
public final l.a0 g ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.e;
} // .end method
