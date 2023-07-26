public class e.f.c.l.e.w.a implements e.f.c.l.e.w.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer a;
	 public final e.f.c.l.e.w.d b;
	 public final e.f.c.l.e.w.b c;
	 /* # direct methods */
	 public e.f.c.l.e.w.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/c/l/e/w/a;->a:I */
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 /* new-instance p2, Le/f/c/l/e/w/b; */
		 /* invoke-direct {p2, p1}, Le/f/c/l/e/w/b;-><init>(I)V */
		 this.c = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.StackTraceElement a ( java.lang.StackTraceElement[] p0 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* array-length v0, p1 */
		 /* iget v1, p0, Le/f/c/l/e/w/a;->a:I */
		 /* if-gt v0, v1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 v0 = this.b;
	 /* array-length v1, v0 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* move-object v3, p1 */
} // :goto_0
/* if-ge v2, v1, :cond_2 */
/* aget-object v4, v0, v2 */
/* .line 3 */
/* array-length v5, v3 */
/* iget v6, p0, Le/f/c/l/e/w/a;->a:I */
/* if-gt v5, v6, :cond_1 */
/* .line 4 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 5 */
} // :cond_2
} // :goto_1
/* array-length p1, v3 */
/* iget v0, p0, Le/f/c/l/e/w/a;->a:I */
/* if-le p1, v0, :cond_3 */
/* .line 6 */
p1 = this.c;
(( e.f.c.l.e.w.b ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/f/c/l/e/w/b;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;
} // :cond_3
} // .end method
