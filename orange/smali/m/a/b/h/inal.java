public class inal implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) {
		 /* .locals 5 */
		 /* if-nez p1, :cond_0 */
		 /* if-nez p2, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_0
	 int v0 = -1; // const/4 v0, -0x1
	 /* if-nez p1, :cond_1 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-nez p2, :cond_2 */
/* .line 1 */
} // :cond_2
/* check-cast p1, Lm/a/b/h/j; */
/* .line 2 */
/* check-cast p2, Lm/a/b/h/j; */
/* .line 3 */
(( m.a.b.h.j ) p1 ).f ( ); // invoke-virtual {p1}, Lm/a/b/h/j;->f()J
/* move-result-wide v2 */
(( m.a.b.h.j ) p2 ).f ( ); // invoke-virtual {p2}, Lm/a/b/h/j;->f()J
/* move-result-wide p1 */
/* cmp-long v4, v2, p1 */
/* if-gez v4, :cond_3 */
} // :cond_3
} // .end method
